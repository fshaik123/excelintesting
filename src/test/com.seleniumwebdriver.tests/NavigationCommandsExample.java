import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommandsExample {
    public static void main(String[] args) {
        //setup the firefox driver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        //Create driver object for Firefox
        WebDriver driver = new FirefoxDriver();

        //Navigate to a URL
        driver.get("https://www.google.com");

        // Navigate to new URL
        driver.navigate().to("https://www.bing.com");

        // Similar to clicking on back button in the browser
        driver.navigate().back();

        // Similar to clicking on forward button in the browser
        driver.navigate().forward();

        // Refresh  the browser
        driver.navigate().refresh();

        //quit the browser
        driver.quit();
    }
}
