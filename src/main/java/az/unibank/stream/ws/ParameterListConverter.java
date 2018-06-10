package az.unibank.stream.ws;

import az.unibank.stream.implementation.Field;
import az.unibank.stream.implementation.Option;
import az.unibank.stream.implementation.ServiceException;
import com.sun.javafx.image.impl.BaseByteToIntConverter;
import com.sun.xml.internal.ws.util.*;
import com.unibank.xml.parse.XMLHandler;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by azarm on 3/10/2018.
 */
public class ParameterListConverter extends RequestConverter<Field> {
    private List<String> parameterConditionsServices = new ArrayList<>();
    public ParameterListConverter(String gpRequest) {
        super(gpRequest);
        parameterConditionsServices.add("nar");
    }

    @Override
    public void convertToAggregator() {

    }

    @Override
    public List<Field> sendToAggregator() {
        String lang = XMLHandler.extractSingleTag(gpRequest, "lang");
        String serviceId = XMLHandler.extractSingleTag(gpRequest, "merchantName");
        List<Field> fields = new ArrayList<>();
        try {
            fields = StreamUtils.getStreamPort(lang).getService(serviceId).getFieldList().getField();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return fields;
    }

    @Override
    public String convertToGp(List<Field> fields) {
        StringBuilder result = new StringBuilder();
        result.append("<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                "   <soap:Body>\n" +
                "      <ns2:GetParameterListResponse xmlns:ns2=\"http://webservice.web.pg.goldenpay.az/\">\n" +
                "         <return>\n" +
                "            <status>\n" +
                "               <code>1</code>\n" +
                "               <message>success</message>\n" +
                "            </status>\n" +
                "            <parameters>\n" +
                "               <parameter>\n");
        for (Field field : fields) {
            result.append("<parameter><name>"+ field.getName() + "</name>" +
                    " <type>" + findGoldenPayParamType(field.getType().name()) +"</type>" +
                    "                                <title>" + field.getLabel() + "</title>" +
                    "                                <regexp>" + field.getPattern() + "</regexp>" +
                    "                           <description>" + field.getDescription() + "</description>");
            if (field.getOptionList() != null) {
                result.append("<options>");
                for (Option option: field.getOptionList().getOption()) {
                    result.append("<option>" +
                            " <title>" + option.getLabel() + "</title>" +
                            " <value>" + option.getValue() + "</value>" +
                            " </option>");
                }
                result.append("</options>");
            }
            result.append(addParameterConditions(XMLHandler.extractSingleTag(gpRequest, "merchantName"), field.getName()));
        }
        return result.toString();
    }

    public String findGoldenPayParamType(String type) {
        if ("list".equalsIgnoreCase(type)) {
            return "select";
        } else if ("numeric".equalsIgnoreCase(type)) {
            return "number";
        } else {
            return "string";
        }
    }

    public String addParameterConditions(String serviceId, String paramName) {
        StringBuilder parameterConditions = new StringBuilder();
        if (parameterConditionsServices.contains(serviceId)) {
            if (paramName.equals("prefix") || paramName.equals("number")) {
                parameterConditions.append("<parameterCondition>" +
                        "                     <paramName>payment_type</paramName>" +
                        "                     <paramValue>phone</paramValue>" +
                        "                  </parameterCondition>");
            } else if (paramName.equals("number")) {
                parameterConditions.append("<parameterCondition>" +
                        "                     <paramName>payment_type</paramName>" +
                        "                     <paramValue>account</paramValue>" +
                        "                  </parameterCondition>");
            }
        }
        return parameterConditions.toString();
    }
}
