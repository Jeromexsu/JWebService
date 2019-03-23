

public class WebServiceClient {
    public static void main(String[] args) {
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap =mobileCodeWS.getMobileCodeWSSoap();
        String tel = mobileCodeWSSoap.getMobileCodeInfo("15921907570",null);
        System.out.println(tel);
    }
}
