import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaguruFirstTest {

    @Test
    public void qaguruRegFirstTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("http://qaguru.lv/register");
        driver.manage().window().maximize();

        String qTitle = driver.getTitle(); //quaguru get title variable
        System.out.println(qTitle);
        Assertions.assertEquals("Test", qTitle);

        WebElement qName = driver.findElement(By.id("firstName"));
        qName.click();
        qName.sendKeys("Ivans");
        WebElement qSurn = driver.findElement(By.id("lastName"));
        qSurn.click();
        qSurn.sendKeys("Berzins");
    }
}
