
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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

    private final static QName _GetAllGroupsListResponse_QNAME = new QName("http://Server/", "getAllGroupsListResponse");
    private final static QName _LoginClientResponse_QNAME = new QName("http://Server/", "loginClientResponse");
    private final static QName _EditThreadNameResponse_QNAME = new QName("http://Server/", "editThreadNameResponse");
    private final static QName _ReceiveMessageResponse_QNAME = new QName("http://Server/", "receiveMessageResponse");
    private final static QName _CreateThread_QNAME = new QName("http://Server/", "createThread");
    private final static QName _RegisterClient_QNAME = new QName("http://Server/", "registerClient");
    private final static QName _SendMessageResponse_QNAME = new QName("http://Server/", "sendMessageResponse");
    private final static QName _RegisterClientResponse_QNAME = new QName("http://Server/", "registerClientResponse");
    private final static QName _EditSingleThreadResponse_QNAME = new QName("http://Server/", "editSingleThreadResponse");
    private final static QName _CreateThreadResponse_QNAME = new QName("http://Server/", "createThreadResponse");
    private final static QName _EditThreadName_QNAME = new QName("http://Server/", "editThreadName");
    private final static QName _ReceiveMessage_QNAME = new QName("http://Server/", "receiveMessage");
    private final static QName _GetAllGroupsList_QNAME = new QName("http://Server/", "getAllGroupsList");
    private final static QName _EditSingleThread_QNAME = new QName("http://Server/", "editSingleThread");
    private final static QName _SendMessage_QNAME = new QName("http://Server/", "sendMessage");
    private final static QName _LoginClient_QNAME = new QName("http://Server/", "loginClient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllGroupsList }
     * 
     */
    public GetAllGroupsList createGetAllGroupsList() {
        return new GetAllGroupsList();
    }

    /**
     * Create an instance of {@link ReceiveMessage }
     * 
     */
    public ReceiveMessage createReceiveMessage() {
        return new ReceiveMessage();
    }

    /**
     * Create an instance of {@link EditThreadName }
     * 
     */
    public EditThreadName createEditThreadName() {
        return new EditThreadName();
    }

    /**
     * Create an instance of {@link CreateThreadResponse }
     * 
     */
    public CreateThreadResponse createCreateThreadResponse() {
        return new CreateThreadResponse();
    }

    /**
     * Create an instance of {@link EditSingleThreadResponse }
     * 
     */
    public EditSingleThreadResponse createEditSingleThreadResponse() {
        return new EditSingleThreadResponse();
    }

    /**
     * Create an instance of {@link LoginClient }
     * 
     */
    public LoginClient createLoginClient() {
        return new LoginClient();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link EditSingleThread }
     * 
     */
    public EditSingleThread createEditSingleThread() {
        return new EditSingleThread();
    }

    /**
     * Create an instance of {@link CreateThread }
     * 
     */
    public CreateThread createCreateThread() {
        return new CreateThread();
    }

    /**
     * Create an instance of {@link EditThreadNameResponse }
     * 
     */
    public EditThreadNameResponse createEditThreadNameResponse() {
        return new EditThreadNameResponse();
    }

    /**
     * Create an instance of {@link ReceiveMessageResponse }
     * 
     */
    public ReceiveMessageResponse createReceiveMessageResponse() {
        return new ReceiveMessageResponse();
    }

    /**
     * Create an instance of {@link GetAllGroupsListResponse }
     * 
     */
    public GetAllGroupsListResponse createGetAllGroupsListResponse() {
        return new GetAllGroupsListResponse();
    }

    /**
     * Create an instance of {@link LoginClientResponse }
     * 
     */
    public LoginClientResponse createLoginClientResponse() {
        return new LoginClientResponse();
    }

    /**
     * Create an instance of {@link RegisterClientResponse }
     * 
     */
    public RegisterClientResponse createRegisterClientResponse() {
        return new RegisterClientResponse();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link RegisterClient }
     * 
     */
    public RegisterClient createRegisterClient() {
        return new RegisterClient();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGroupsListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getAllGroupsListResponse")
    public JAXBElement<GetAllGroupsListResponse> createGetAllGroupsListResponse(GetAllGroupsListResponse value) {
        return new JAXBElement<GetAllGroupsListResponse>(_GetAllGroupsListResponse_QNAME, GetAllGroupsListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "loginClientResponse")
    public JAXBElement<LoginClientResponse> createLoginClientResponse(LoginClientResponse value) {
        return new JAXBElement<LoginClientResponse>(_LoginClientResponse_QNAME, LoginClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditThreadNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "editThreadNameResponse")
    public JAXBElement<EditThreadNameResponse> createEditThreadNameResponse(EditThreadNameResponse value) {
        return new JAXBElement<EditThreadNameResponse>(_EditThreadNameResponse_QNAME, EditThreadNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "receiveMessageResponse")
    public JAXBElement<ReceiveMessageResponse> createReceiveMessageResponse(ReceiveMessageResponse value) {
        return new JAXBElement<ReceiveMessageResponse>(_ReceiveMessageResponse_QNAME, ReceiveMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "createThread")
    public JAXBElement<CreateThread> createCreateThread(CreateThread value) {
        return new JAXBElement<CreateThread>(_CreateThread_QNAME, CreateThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "registerClient")
    public JAXBElement<RegisterClient> createRegisterClient(RegisterClient value) {
        return new JAXBElement<RegisterClient>(_RegisterClient_QNAME, RegisterClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "sendMessageResponse")
    public JAXBElement<SendMessageResponse> createSendMessageResponse(SendMessageResponse value) {
        return new JAXBElement<SendMessageResponse>(_SendMessageResponse_QNAME, SendMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "registerClientResponse")
    public JAXBElement<RegisterClientResponse> createRegisterClientResponse(RegisterClientResponse value) {
        return new JAXBElement<RegisterClientResponse>(_RegisterClientResponse_QNAME, RegisterClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditSingleThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "editSingleThreadResponse")
    public JAXBElement<EditSingleThreadResponse> createEditSingleThreadResponse(EditSingleThreadResponse value) {
        return new JAXBElement<EditSingleThreadResponse>(_EditSingleThreadResponse_QNAME, EditSingleThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "createThreadResponse")
    public JAXBElement<CreateThreadResponse> createCreateThreadResponse(CreateThreadResponse value) {
        return new JAXBElement<CreateThreadResponse>(_CreateThreadResponse_QNAME, CreateThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditThreadName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "editThreadName")
    public JAXBElement<EditThreadName> createEditThreadName(EditThreadName value) {
        return new JAXBElement<EditThreadName>(_EditThreadName_QNAME, EditThreadName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "receiveMessage")
    public JAXBElement<ReceiveMessage> createReceiveMessage(ReceiveMessage value) {
        return new JAXBElement<ReceiveMessage>(_ReceiveMessage_QNAME, ReceiveMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGroupsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getAllGroupsList")
    public JAXBElement<GetAllGroupsList> createGetAllGroupsList(GetAllGroupsList value) {
        return new JAXBElement<GetAllGroupsList>(_GetAllGroupsList_QNAME, GetAllGroupsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditSingleThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "editSingleThread")
    public JAXBElement<EditSingleThread> createEditSingleThread(EditSingleThread value) {
        return new JAXBElement<EditSingleThread>(_EditSingleThread_QNAME, EditSingleThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "sendMessage")
    public JAXBElement<SendMessage> createSendMessage(SendMessage value) {
        return new JAXBElement<SendMessage>(_SendMessage_QNAME, SendMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "loginClient")
    public JAXBElement<LoginClient> createLoginClient(LoginClient value) {
        return new JAXBElement<LoginClient>(_LoginClient_QNAME, LoginClient.class, null, value);
    }

}
