import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorVyssheyeObrazovanieTest {
    private WebDriver webDriver;

    @Before
    public void init() {
        WebDriverManager.chromedriver()
                .setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void locatorTest() {
        webDriver.navigate().to("https://skillfactory.ru/");
        WebElement webElement = webDriver.findElement(By.id("sbs-562561178-1679402552401"));
//        List<WebElement> list = webDriver.findElements(By.id("user_email"));
//        list.get(0).sendKeys("test");
//        System.out.println(list.size());
        webDriver.findElement(By.className("tn-atom")).click();
    }

}

