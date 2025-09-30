package com.ilcarro.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    public static JavascriptExecutor js;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void openURL() {
        driver.get("https://icarro-v1.netlify.app/search?page=0&size=10");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public boolean isElementDisplayed(WebElement element) {

        try {
            element.isDisplayed();
            return true;

        } catch (NoSuchElementException ex) {
            ex.getMessage();
            return false;
        }
    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public void select(WebElement locator, String item) {
        Select select = new Select(locator);
        select.selectByVisibleText(item);
    }

    public void isMessageTextPresent(WebElement locator,String message) {
        assert locator.getText().contains(message);

    }

    public void moveWithJS(int x, int y) {
        js.executeScript("window.scrollBy("+ x +","+ y +")");
    }

    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void tearDown() {
        driver.quit();
    }
}
