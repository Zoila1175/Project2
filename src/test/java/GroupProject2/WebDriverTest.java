package GroupProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverTest {
    public static void main(String[] args) {

        // Create a ChromeDriver object
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        System.out.println("Chrome Driver Title: " + chromeDriver.getTitle());
        chromeDriver.quit();

        // Create a FirefoxDriver object
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        System.out.println("Firefox Driver Title: " + firefoxDriver.getTitle());
        firefoxDriver.quit();

        // Create a SafariDriver object
        WebDriver safariDriver = new SafariDriver();
        safariDriver.get("https://www.google.com");
        System.out.println("Safari Driver Title: " + safariDriver.getTitle());
        safariDriver.quit();
    }
}