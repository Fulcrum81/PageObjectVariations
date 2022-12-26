package pageobject.object;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class PageBase {

//    protected Logger LOG = Logger.getLogger(PageBase.class);
    public boolean hasOpened(WebDriver driver, String title) {
        return driver.getTitle().equals(title);
    }
}
