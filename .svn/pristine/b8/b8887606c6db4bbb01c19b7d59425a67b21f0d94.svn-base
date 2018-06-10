package az.unibank.stream.ws;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * Created by AzarM on 2/25/2018.
 */
public class Token {
    private final String key;
    private Object[] data;

    public Token(String key) {
        this.key = key;
    }

    public String generate(long time) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(
                key.getBytes(), "RAW")
        );

        StringBuilder buffer = new StringBuilder();
        if (data != null) {
            Arrays.stream(data).forEach(elem -> buffer.append(elem));
        }
        byte[] array = buffer.toString().getBytes("UTF-8");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(mac.doFinal(ByteBuffer.allocate(array.length+8)
                    .put(array)
                    .putLong(time)
                    .array()
                    ));

        return new String(new sun.misc.BASE64Encoder().encode(digest));

    }

    public void setData(Object... data) {
        this.data = data;
    }
}
