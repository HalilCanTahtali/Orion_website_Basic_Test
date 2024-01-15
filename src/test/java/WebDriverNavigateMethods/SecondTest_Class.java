package WebDriverNavigateMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest_Class
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\project\\ChromeDriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://www.orioninc.com");
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
