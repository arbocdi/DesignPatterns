package arbocdi.dp.structural.proxy;

public interface Browser {
    void connect(String site);

    class OperaBrowser implements Browser{

        @Override
        public void connect(String site) {
            System.out.println("Connected to "+site);
        }
    }

    class AdultContentBlocker implements Browser{

        private Browser browser;

        public AdultContentBlocker(Browser browser) {
            this.browser = browser;
        }

        @Override
        public void connect(String site) {
            if(site.toLowerCase().contains("adult")){
                System.out.println("Access denied");
            }else{
                browser.connect(site);
            }
        }
    }
}
