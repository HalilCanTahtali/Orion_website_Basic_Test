package WebDriverGetMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest_Class
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\project\\ChromeDriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.orioninc.com");
        // 2. Sayfa basligini(title) yazdirin
        String pageTitle = driver.getTitle();
        String expectedTitle="Innovation";
        System.err.println("Expected Title word is "+expectedTitle);
        System.out.println(pageTitle);
        // 3. Sayfa basliginin Innovation icerdigini test edin
        if(pageTitle.contains(expectedTitle))
            System.out.println("Tittle contains test is PASSED.");
        else
            System.out.println("Tittle contains test is FAILED.");
        // 4. Sayfa adresini(url) yazdirin
        String expectedURL="orion";
        String currentURL=driver.getCurrentUrl();
        System.err.println("Expected URL word is "+expectedURL);
        System.out.println(currentURL);
        // 5. Sayfa url’inin “orion” icerdigini test edin.
        if(currentURL.contains(expectedURL))
            System.out.println("URL contains test is PASSED.");
        else
            System.out.println("URL contains test is FAILED.");
        // 6. Sayfa handle degerini yazdirin
        System.out.println("Window handle:" + driver.getWindowHandle());
        // 7. Sayfa HTML kodlarinda "innovation" kelimesi gectigini test edin
        if(driver.getPageSource().contains("innovation"))
            System.out.println("Source code cantains innovation test is PASSED.");
        else
            System.out.println("Source code cantains innovation test is FAILED.");
        Thread.sleep(4000);
        driver.close();

    }
}
