package az.unibank.stream.ws;

import az.unibank.stream.implementation.Service;
import az.unibank.stream.implementation.ServiceException;
import com.unibank.xml.parse.XMLHandler;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AzarM on 3/1/2018.
 */
public class MerchantListConverter extends RequestConverter<Service> {


    public MerchantListConverter(String gpRequest) {
        super(gpRequest);
    }

    @Override
    public void convertToAggregator() {

    }

    @Override
    public List<Service> sendToAggregator() {
        String lang = XMLHandler.extractSingleTag(gpRequest, "lang");
        String categoryId = XMLHandler.extractSingleTag(gpRequest, "categoryName");
        List<Service> services = new ArrayList<>();
        try {
            services = StreamUtils.getStreamPort(lang).getServiceList(categoryId);

        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return services;
    }

    @Override
    public String convertToGp(List<Service> services) {
        StringBuilder result = new StringBuilder();

        result.append("<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\">\n"
                + "   <soap:Body>\n"
                + "      <ns2:GetMerchantListResponse xmlns:ns2=\"http://webservice.web.pg.goldenpay.az/\">\n"
                + "         <return>\n"
                + "            <status>\n"
                + "               <code>1</code>\n"
                + "               <message>success</message>\n"
                + "            </status>\n"
                + "            <merchants>");
        for (Service service: services) {
            result.append("<merchant>\n" +
                    "                  <name>" + service.getAlias()+"</name>\n" +
                    "                  <description>"+ service.getDescription()+"</description>\n" +
                    "                  <title>"+ service.getName()+"</title>\n" +
                    "               </merchant>\n");
        }

        result.append("</merchants>\n" +
                "         </return>\n" +
                "      </ns2:GetMerchantListResponse>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>");
        return result.toString();
    }
}
