import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sergey
 */
public class InsuranceTest {
    WebDriver driver;
    String baseUrl = "https://www.rgs.ru";


    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);


    }

    @Test
    public void testInsurance() {
        driver.findElement(By.xpath("//ol[contains(@class,'rgs-menu')]/li/a[contains(text(),'Страхование')]")).click();
        driver.findElement(By.xpath("//li[@class='adv-analytics-navigation-line3-link']//a[contains(text(),'ДМС')]")).click();
    }

    @After
    public void afterTest() {
        driver.quit();

    }

}
