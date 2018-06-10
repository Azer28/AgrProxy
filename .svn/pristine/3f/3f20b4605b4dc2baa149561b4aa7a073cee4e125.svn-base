package az.unibank.stream.ws;

import az.unibank.stream.implementation.Category;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.net.ssl.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.security.cert.X509Certificate;
import java.util.List;

/**
 * Created by AzarM on 2/24/2018.
 */
@Path("/")
public class UserController {

    private RequestConverter gpAggregatorHandler;
    @Context
    Request request;

    @Context
    private HttpHeaders requestHeader;
    @Path("/{all}")
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Object getCustomInfo(String requestXml, @PathParam("all") String all) {
        System.out.println(all);
        System.out.println(requestXml);
        System.out.println(request.getMethod());
        MultivaluedMap<String, String> mvmap = requestHeader.getRequestHeaders();
        ignoreSSlError();
        RequestConverter<Category> toAggrConverter = GpRequestMethod.findConverterType(requestXml).get();
        return toAggrConverter.handleRequest();
    }

    public Document parseDocument(String xmlContent) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(xmlContent)));
        return document;
    }

    public SOAPMessage buildSoapMessageFromStr(String requestBody) {
        InputStream is = new ByteArrayInputStream(requestBody.getBytes());
        try {
        SOAPMessage
            message = MessageFactory.newInstance().createMessage(null, is);
            return message;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void ignoreSSlError() {
        try {
            /* Start of Fix */
            TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }

            }};

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };
            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
            /* End of the fix*/
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
