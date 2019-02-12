import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
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
    }
}
