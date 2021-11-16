// To demonstrate Abstraction. 
package classes;

public class Browser {
    public String navigate(String url){
    
        String ip = findAddress(url);
        String response = sendHTTPRequest(ip);
        return response;
    }
    
    private String findAddress(String url){
        return "127.0.0.1";
    }
    
    private String sendHTTPRequest(String ip){
       return "<html>Some Response page. <html>";
    }
}
