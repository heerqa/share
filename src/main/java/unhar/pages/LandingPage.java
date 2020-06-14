package unhar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://google.co.in")
public class LandingPage extends ExtendedPageObject {


    public void openURL() throws InterruptedException {
        waitForPageLoaded();
        waitForPageLoaded();
        String url = "https://unhar-web.azurewebsites.net/Identity/Account/Login";
//        String url = System.getProperty("URL");
//        if (url == null) {
//            throw new InterruptedException("URL is null");
//        }
        getDriver().get(url);
    }

    public void quitBrowser()  {
        getDriver().close();
    }

    @FindBy(id = "Input_Email")
    WebElementFacade email;

    public void setEmail(String strUsername) throws InterruptedException {
        waitForPageLoaded();
        waitForPageLoaded();
        withTimeoutOf(120, TimeUnit.SECONDS).waitForPresenceOf(By.id("Input_Email"));
        email.sendKeys(strUsername);
    }

    @FindBy(id = "Input_Password")
    WebElementFacade pass;

    public void setPassword(String strPasss) throws InterruptedException {
        waitForPageLoaded();
        pass.sendKeys(strPasss);
        Thread.sleep(999);
    }

    @FindBy(xpath = "//button[text()='Sign in']")
    WebElement btn;

    public void clickLoginBtn() throws InterruptedException {
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", btn);
        getDriver().findElement(By.xpath("//button[text()='Sign in']")).click();
        waitForPageLoaded();
    }

}
