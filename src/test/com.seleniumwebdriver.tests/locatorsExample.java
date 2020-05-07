import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsExample {
    public static void main(String[] args) {
        //setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        //Create driver object for Chrome
        WebDriver driver = new ChromeDriver();

        //Navigate to a URL
        driver.get("https://www.google.com");

        // id example
        WebElement id = driver.findElement(By.id("tsf"));

        // name example
        WebElement name = driver.findElement(By.name("f"));

        // tag name example
        WebElement tagname = driver.findElement(By.tagName("form"));

        // class name example
        WebElement classname = driver.findElement(By.className("gb_g"));

        // link text example
        WebElement linktext = driver.findElement(By.linkText("Gmail"));

        // partial link text example
        WebElement partiallinktext = driver.findElement(By.partialLinkText("mail"));

        // css selector example
        WebElement css = driver.findElement(By.cssSelector("form[name='f']"));

        // absolute ​xpath​​ example
        WebElement axpath = driver.findElement(By.xpath("/html/body/div/div/form"));

        // relative xpath example (If using xpath make sure to use relative xpath always)
        WebElement rxpath = driver.findElement(By.xpath("//form[@name='f']"));

        //quit the browser
        driver.quit();
    }
}
