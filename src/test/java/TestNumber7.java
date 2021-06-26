import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNumber7 extends HomeWorkRun {

    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void test01() {
        String title = "Amazon.com. Spend less. Smile more.";
        assert driver.getTitle().equals(title);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Leather shoes");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.close();
    }
}
