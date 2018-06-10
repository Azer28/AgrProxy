
package az.unibank.stream.implementation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the az.unibank.stream.implementation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPaymentListResponse_QNAME = new QName("STREAM", "GetPaymentListResponse");
    private final static QName _GetBillListResponse_QNAME = new QName("STREAM", "GetBillListResponse");
    private final static QName _GetIconList_QNAME = new QName("STREAM", "GetIconList");
    private final static QName _Pay_QNAME = new QName("STREAM", "Pay");
    private final static QName _GetPaymentResponse_QNAME = new QName("STREAM", "GetPaymentResponse");
    private final static QName _GetPayment_QNAME = new QName("STREAM", "GetPayment");
    private final static QName _GetCategoryListResponse_QNAME = new QName("STREAM", "GetCategoryListResponse");
    private final static QName _GetIconListResponse_QNAME = new QName("STREAM", "GetIconListResponse");
    private final static QName _GetPaymentList_QNAME = new QName("STREAM", "GetPaymentList");
    private final static QName _GetCategoryList_QNAME = new QName("STREAM", "GetCategoryList");
    private final static QName _GetServiceListResponse_QNAME = new QName("STREAM", "GetServiceListResponse");
    private final static QName _PayResponse_QNAME = new QName("STREAM", "PayResponse");
    private final static QName _GetBillList_QNAME = new QName("STREAM", "GetBillList");
    private final static QName _GetService_QNAME = new QName("STREAM", "GetService");
    private final static QName _RegisterResponse_QNAME = new QName("STREAM", "RegisterResponse");
    private final static QName _GetIconResponse_QNAME = new QName("STREAM", "GetIconResponse");
    private final static QName _ServiceException_QNAME = new QName("STREAM", "ServiceException");
    private final static QName _GetServiceList_QNAME = new QName("STREAM", "GetServiceList");
    private final static QName _Register_QNAME = new QName("STREAM", "Register");
    private final static QName _GetIcon_QNAME = new QName("STREAM", "GetIcon");
    private final static QName _GetServiceResponse_QNAME = new QName("STREAM", "GetServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: az.unibank.stream.implementation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Fee }
     * 
     */
    public Fee createFee() {
        return new Fee();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link Bill }
     * 
     */
    public Bill createBill() {
        return new Bill();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link GetIconListResponse }
     * 
     */
    public GetIconListResponse createGetIconListResponse() {
        return new GetIconListResponse();
    }

    /**
     * Create an instance of {@link GetPaymentList }
     * 
     */
    public GetPaymentList createGetPaymentList() {
        return new GetPaymentList();
    }

    /**
     * Create an instance of {@link GetPaymentListResponse }
     * 
     */
    public GetPaymentListResponse createGetPaymentListResponse() {
        return new GetPaymentListResponse();
    }

    /**
     * Create an instance of {@link GetBillListResponse }
     * 
     */
    public GetBillListResponse createGetBillListResponse() {
        return new GetBillListResponse();
    }

    /**
     * Create an instance of {@link GetIconList }
     * 
     */
    public GetIconList createGetIconList() {
        return new GetIconList();
    }

    /**
     * Create an instance of {@link Pay }
     * 
     */
    public Pay createPay() {
        return new Pay();
    }

    /**
     * Create an instance of {@link GetPaymentResponse }
     * 
     */
    public GetPaymentResponse createGetPaymentResponse() {
        return new GetPaymentResponse();
    }

    /**
     * Create an instance of {@link GetPayment }
     * 
     */
    public GetPayment createGetPayment() {
        return new GetPayment();
    }

    /**
     * Create an instance of {@link GetCategoryListResponse }
     * 
     */
    public GetCategoryListResponse createGetCategoryListResponse() {
        return new GetCategoryListResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetIconResponse }
     * 
     */
    public GetIconResponse createGetIconResponse() {
        return new GetIconResponse();
    }

    /**
     * Create an instance of {@link ServiceFault }
     * 
     */
    public ServiceFault createServiceFault() {
        return new ServiceFault();
    }

    /**
     * Create an instance of {@link GetServiceList }
     * 
     */
    public GetServiceList createGetServiceList() {
        return new GetServiceList();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link GetIcon }
     * 
     */
    public GetIcon createGetIcon() {
        return new GetIcon();
    }

    /**
     * Create an instance of {@link GetServiceResponse }
     * 
     */
    public GetServiceResponse createGetServiceResponse() {
        return new GetServiceResponse();
    }

    /**
     * Create an instance of {@link GetCategoryList }
     * 
     */
    public GetCategoryList createGetCategoryList() {
        return new GetCategoryList();
    }

    /**
     * Create an instance of {@link GetServiceListResponse }
     * 
     */
    public GetServiceListResponse createGetServiceListResponse() {
        return new GetServiceListResponse();
    }

    /**
     * Create an instance of {@link PayResponse }
     * 
     */
    public PayResponse createPayResponse() {
        return new PayResponse();
    }

    /**
     * Create an instance of {@link GetBillList }
     * 
     */
    public GetBillList createGetBillList() {
        return new GetBillList();
    }

    /**
     * Create an instance of {@link GetService }
     * 
     */
    public GetService createGetService() {
        return new GetService();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link Tariff }
     * 
     */
    public Tariff createTariff() {
        return new Tariff();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link Icon }
     * 
     */
    public Icon createIcon() {
        return new Icon();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link Bill.FixedAmountList }
     * 
     */
    public Bill.FixedAmountList createBillFixedAmountList() {
        return new Bill.FixedAmountList();
    }

    /**
     * Create an instance of {@link Bill.DetailList }
     * 
     */
    public Bill.DetailList createBillDetailList() {
        return new Bill.DetailList();
    }

    /**
     * Create an instance of {@link Payment.DetailList }
     * 
     */
    public Payment.DetailList createPaymentDetailList() {
        return new Payment.DetailList();
    }

    /**
     * Create an instance of {@link Service.FeeList }
     * 
     */
    public Service.FeeList createServiceFeeList() {
        return new Service.FeeList();
    }

    /**
     * Create an instance of {@link Service.FieldList }
     * 
     */
    public Service.FieldList createServiceFieldList() {
        return new Service.FieldList();
    }

    /**
     * Create an instance of {@link Service.TariffList }
     * 
     */
    public Service.TariffList createServiceTariffList() {
        return new Service.TariffList();
    }

    /**
     * Create an instance of {@link Service.CurrencyList }
     * 
     */
    public Service.CurrencyList createServiceCurrencyList() {
        return new Service.CurrencyList();
    }

    /**
     * Create an instance of {@link Field.OptionList }
     * 
     */
    public Field.OptionList createFieldOptionList() {
        return new Field.OptionList();
    }

    /**
     * Create an instance of {@link Category.ChildList }
     * 
     */
    public Category.ChildList createCategoryChildList() {
        return new Category.ChildList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetPaymentListResponse")
    public JAXBElement<GetPaymentListResponse> createGetPaymentListResponse(GetPaymentListResponse value) {
        return new JAXBElement<GetPaymentListResponse>(_GetPaymentListResponse_QNAME, GetPaymentListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetBillListResponse")
    public JAXBElement<GetBillListResponse> createGetBillListResponse(GetBillListResponse value) {
        return new JAXBElement<GetBillListResponse>(_GetBillListResponse_QNAME, GetBillListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIconList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetIconList")
    public JAXBElement<GetIconList> createGetIconList(GetIconList value) {
        return new JAXBElement<GetIconList>(_GetIconList_QNAME, GetIconList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "Pay")
    public JAXBElement<Pay> createPay(Pay value) {
        return new JAXBElement<Pay>(_Pay_QNAME, Pay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetPaymentResponse")
    public JAXBElement<GetPaymentResponse> createGetPaymentResponse(GetPaymentResponse value) {
        return new JAXBElement<GetPaymentResponse>(_GetPaymentResponse_QNAME, GetPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetPayment")
    public JAXBElement<GetPayment> createGetPayment(GetPayment value) {
        return new JAXBElement<GetPayment>(_GetPayment_QNAME, GetPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetCategoryListResponse")
    public JAXBElement<GetCategoryListResponse> createGetCategoryListResponse(GetCategoryListResponse value) {
        return new JAXBElement<GetCategoryListResponse>(_GetCategoryListResponse_QNAME, GetCategoryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIconListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetIconListResponse")
    public JAXBElement<GetIconListResponse> createGetIconListResponse(GetIconListResponse value) {
        return new JAXBElement<GetIconListResponse>(_GetIconListResponse_QNAME, GetIconListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetPaymentList")
    public JAXBElement<GetPaymentList> createGetPaymentList(GetPaymentList value) {
        return new JAXBElement<GetPaymentList>(_GetPaymentList_QNAME, GetPaymentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetCategoryList")
    public JAXBElement<GetCategoryList> createGetCategoryList(GetCategoryList value) {
        return new JAXBElement<GetCategoryList>(_GetCategoryList_QNAME, GetCategoryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetServiceListResponse")
    public JAXBElement<GetServiceListResponse> createGetServiceListResponse(GetServiceListResponse value) {
        return new JAXBElement<GetServiceListResponse>(_GetServiceListResponse_QNAME, GetServiceListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "PayResponse")
    public JAXBElement<PayResponse> createPayResponse(PayResponse value) {
        return new JAXBElement<PayResponse>(_PayResponse_QNAME, PayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetBillList")
    public JAXBElement<GetBillList> createGetBillList(GetBillList value) {
        return new JAXBElement<GetBillList>(_GetBillList_QNAME, GetBillList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetService")
    public JAXBElement<GetService> createGetService(GetService value) {
        return new JAXBElement<GetService>(_GetService_QNAME, GetService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "RegisterResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIconResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetIconResponse")
    public JAXBElement<GetIconResponse> createGetIconResponse(GetIconResponse value) {
        return new JAXBElement<GetIconResponse>(_GetIconResponse_QNAME, GetIconResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "ServiceException")
    public JAXBElement<ServiceFault> createServiceException(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceException_QNAME, ServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetServiceList")
    public JAXBElement<GetServiceList> createGetServiceList(GetServiceList value) {
        return new JAXBElement<GetServiceList>(_GetServiceList_QNAME, GetServiceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "Register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIcon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetIcon")
    public JAXBElement<GetIcon> createGetIcon(GetIcon value) {
        return new JAXBElement<GetIcon>(_GetIcon_QNAME, GetIcon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "STREAM", name = "GetServiceResponse")
    public JAXBElement<GetServiceResponse> createGetServiceResponse(GetServiceResponse value) {
        return new JAXBElement<GetServiceResponse>(_GetServiceResponse_QNAME, GetServiceResponse.class, null, value);
    }

}
