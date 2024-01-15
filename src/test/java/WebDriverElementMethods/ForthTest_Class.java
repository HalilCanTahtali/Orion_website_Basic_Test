package WebDriverElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForthTest_Class
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\project\\ChromeDriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);
        // This is necessary for the browser and the driver to work synchronously.


        driver.get("https://www.orioninc.com");
        driver.manage().window().maximize(); //Fullscreen for my comfortable.

        // locate the elements
        driver.findElement(By.id("hs-eu-confirmation-button")).click(); //accept the cookies.

        driver.findElement(By.className("search-icon")).click();        //click the search icon.

        driver.findElement((By.name("s"))).sendKeys("Selamun aleyküm", Keys.ENTER); // fill the search textbox.
    }
}