import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;

public class WebDriverBasicMethodsExample {
    public static void main(String[] args) throws Exception {
        //setup the edge driver using WebDriverManager
        WebDriverManager.edgedriver().setup();
        //Create driver object for Microsoft EDGE Browser
        WebDriver driver = new EdgeDriver();

        // get method - load a new webpage in the current browser window
        driver.get("https://www.google.com");

        // getCurrentURL - retrieves the url of the current browser window
        String CurrentURL = driver.getCurrentUrl();

        // getTitle - retrieves the title of the current web page
        String PageTitle = driver.getTitle();

        // getPageSource - retrieves the source of the loaded web page
        String PageSource = driver.getPageSource();

        // to maximise browser
        driver.manage().window().maximize();

        // findElement - to find the first element in the dom based on the locator
        WebElement firstElement = driver.findElement(By.id("id or any other locator & value"));

        // findElements - to find all the elements within the current page
        List<WebElement> listofelements = driver.findElements(By.xpath("xpath or any common locator & value"));

        // getWindowHandle - gets a unique value to identify the window in this driver instance
        String currentwindow = driver.getWindowHandle();

        // getWindowHandles - gets list of unique values to identify all the open windows in this driver instance
        ArrayList<String> listofwindows = new ArrayList<String>(driver.getWindowHandles());

        // switchTo - can be used to select a window or frame or alert
        // switches to default window/parent window
        driver.switchTo().defaultContent();
        // switch to frame
        driver.switchTo().frame(0 /* you can switch to frame by using id or name or index */ );
        // switch to Alert
        driver.switchTo().alert().accept(); // to accept the alert (Like clicking on OK or Continue in Alert)
        driver.switchTo().alert().dismiss(); // dismissing the alert without accepting like clicking on Cancel
        driver.switchTo().alert().getText(); // retrieves the text from the Alert (i.e., Alert message)

        // close - closes the current window
        driver.close();

        // quits the browser - closing every window opened by driver
        driver.quit();
    }
}
