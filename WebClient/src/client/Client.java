package client;

/**
 *
 * Name - W.R.B.V.Bandara
 * IIT No - w1626630
 * UOW No - 2016147
 */
public class Client {

    public static boolean createThread(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.createThread(arg0, arg1, arg2);
    }

    public static boolean editSingleThread(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.editSingleThread(arg0, arg1, arg2);
    }

    public static boolean editThreadName(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.editThreadName(arg0, arg1, arg2);
    }

    public static java.util.List<java.lang.String> getAllGroupsList() {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.getAllGroupsList();
    }

    public static boolean loginClient(java.lang.String arg0, java.lang.String arg1) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.loginClient(arg0, arg1);
    }

    public static java.util.List<java.lang.String> receiveMessage() {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.receiveMessage();
    }

    public static boolean registerClient(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.registerClient(arg0, arg1, arg2);
    }

    public static boolean sendMessage(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.sendMessage(arg0, arg1, arg2, arg3);
    }

    
   
}
