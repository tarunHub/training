package automation.PageElements;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @author tarun
 * @param
 *
 */
public class LogoutPageElements {

    @FindBy(css = "someBrowserCss") //this locator is used when here is browser (desktop or mobile)
    @iOSFindBy(uiAutomator = ".elements()[0]") //this locator is used when here is iOS native content
    @AndroidFindBy(className = "android.widget.TextView")
    public WebElement logout;

}
