package az.unibank.stream.ws;

import java.util.List;

/**
 * Created by AzarM on 2/25/2018.
 */
public abstract class RequestConverter<T> {

    protected String gpRequest;

    public RequestConverter(String gpRequest) {
        this.gpRequest = gpRequest;
    }
    public abstract void convertToAggregator();
    public abstract List<T> sendToAggregator();
    public abstract String convertToGp(List<T> elements);

    public String handleRequest() {
        return convertToGp(sendToAggregator());
    }
}
