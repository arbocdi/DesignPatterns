package arbocdi.dp.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Browser browser = new Browser.AdultContentBlocker(new Browser.OperaBrowser());
        browser.connect("google.com");
        browser.connect("adultPics.org");
    }
}
