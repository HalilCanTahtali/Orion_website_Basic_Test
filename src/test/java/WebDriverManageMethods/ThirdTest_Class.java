package WebDriverManageMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest_Class
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\ChromeDriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.youtube.com");
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(0,0)); //(676, 318)
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
    }
}

