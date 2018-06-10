package az.unibank.stream.ws;

import az.unibank.stream.implementation.Category;
import az.unibank.stream.implementation.ServiceException;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AzarM on 2/25/2018.
 */
public class CategoryListConverter extends RequestConverter<Category> {
    private String gpRequest;

    public CategoryListConverter(String gpRequest) {
        super(gpRequest);
    }
    @Override
    public void convertToAggregator() {


    }

    @Override
    public List<Category> sendToAggregator() {
        Token token = new Token("az");
        List<Category> categories = new ArrayList<>();
        try {
            categories = StreamUtils.getStreamPort("az").getCategoryList();

            categories.stream().forEach(category -> System.out.println(category.getAlias()));


        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public String convertToGp(List<Category> categories  ) {
        StringBuilder result = new StringBuilder();
        String header = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\">\n"
                + "   <soap:Body>\n"
                + "      <ns2:GetCategoryListResponse xmlns:ns2=\"http://webservice.web.pg.goldenpay.az/\">\n"
                + "         <return>\n"
                + "            <status>\n"
                + "               <code>1</code>\n"
                + "               <message>success</message>\n"
                + "            </status>\n"
                + "            <categories>";
        result.append(header);
        for (Category category: categories) {
            result.append("<category>\n"
                    + "                  <categoryName>".concat( category.getAlias()).concat("</categoryName>\n"
                    + "                        <title>").concat(     category.getName()   ).concat("</title>\n"
                    + "               </category>"));
        }

        String footer = "            </categories>\n"
                + "         </return>\n"
                + "      </ns2:GetCategoryListResponse>\n"
                + "   </soap:Body>\n"
                + "</soap:Envelope>";
        result.append(footer);
        return result.toString();
    }
}
