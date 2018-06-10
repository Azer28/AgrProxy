package az.unibank.stream.ws;

import az.unibank.stream.implementation.STREAM;
import az.unibank.stream.implementation.STREAMPort;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by AzarM on 2/25/2018.
 */
public class StreamUtils {

    public static STREAMPort getStreamPort(String lang) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        STREAM streamService = new STREAM();

        Token token = new Token("E4DE9A399EC6BC4BEB06852E74B532D6");
        token.setData("Azer");
        String xToken = token.generate(System.currentTimeMillis()/200);

        STREAMPort port = streamService.getSTREAMPort();
        BindingProvider prov = (BindingProvider) port;
        Map<String, List<String>> headers = new HashMap<>();

        List<String> xAgent = new ArrayList<String>();
        xAgent.add("Azer"); // change from hardcoded value Mobile to dynamic read from web.xml

        headers.put("X-Agent", xAgent );
        headers.put("X-Token", Collections.singletonList(xToken));
        headers.put("X-Language", Collections.singletonList(lang));

        prov.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
//
//        prov.getRequestContext().put("x-agent", "azer"); // change from hardcoded value Mobile to dynamic read from web.xml
//        prov.getRequestContext().put("x-token", xToken);
//        prov.getRequestContext().put("X-Language", lang);
//
//        BindingProvider prov1 = (BindingProvider) port;

        return port;
    }
}
