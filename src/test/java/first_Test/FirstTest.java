package first_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class FirstTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
    }

    public static class Selenium_Manager {
        public static void main(String[] args) {
            SeleniumManager.getInstance().getDriverPath("chromedriver");
            ChromeDriver driver=new ChromeDriver();
            driver.get("https://www.techproeducation.com");
            driver.close();
            driver.quit();


            SeleniumManager.getInstance().getDriverPath("IEDriverServer");
            InternetExplorerDriver driver1=new InternetExplorerDriver();
            driver1.get("https://www.techproeducation.com");


        }
    }
}
