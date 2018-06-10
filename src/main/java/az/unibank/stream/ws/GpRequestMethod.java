package az.unibank.stream.ws;

import java.util.Optional;

/**
 * Created by AzarM on 2/25/2018.
 */
public enum GpRequestMethod {


    CATEGORIES("GetCategoryList") {
        RequestConverter find(String gpRequest) {
            if (gpRequest.contains(super.gpMethodName))
                return new CategoryListConverter(gpRequest);
            return null;
        }
    },
    MERCHANTS("GetMerchantList") {
        RequestConverter find(String gpRequest) {
            if (gpRequest.contains(super.gpMethodName))
                return new MerchantListConverter(gpRequest);
            return null;
        }
    } ,
    PARAMETERS("GetParameterList") {
        RequestConverter find(String gpRequest) {
            if (gpRequest.contains(super.gpMethodName))
                return new CategoryListConverter(gpRequest);
            return null;
        }
    } ,
    BILLINGINFORMATION("GetBillingInformation") {
        RequestConverter find(String gpRequest) {
            if (gpRequest.contains(super.gpMethodName))
                return new CategoryListConverter(gpRequest);
            return null;
        }
    },
    PAYMENTKEY("GetPaymentKey") {
        RequestConverter find(String gpRequest) {
            if (gpRequest.contains(super.gpMethodName))
                return new CategoryListConverter(gpRequest);
            return null;
        }
    },
    BANKPAY("BankPay") {
        RequestConverter find(String gpRequest) {
            if (gpRequest.contains(super.gpMethodName))
                return new CategoryListConverter(gpRequest);
            return null;
        }
    };

    public String gpMethodName;
    GpRequestMethod(String gpMethodName) {
        this.gpMethodName = gpMethodName;
    }

    abstract RequestConverter find(String str);

    @Override
    public String toString() {
        return super.toString();
    }

    static Optional<RequestConverter> findConverterType(String gpRequest) {
        Optional<RequestConverter> result = Optional.empty();
        for (GpRequestMethod method: GpRequestMethod.values()) {
            RequestConverter converter = method.find(gpRequest);
            if (converter != null) {
                result = Optional.of(converter);
                break;
            }
        }
        if (result.get() == null) {
            throw new NullPointerException("proper converter type is not found");
        }
        return result;
    }

    public static void main(String[] args) {

       // System.out.println(re.gpMethodName);
        RequestConverter gpta = GpRequestMethod.findConverterType("GetCategoryList").get();
        System.out.println(gpta);
    }
}
