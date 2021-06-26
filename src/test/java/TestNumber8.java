import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNumber8 extends HomeWorkRun {

    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://translate.google.co.il/?hl=iw");
    }

    @Test
    public void test01(){
        driver.findElement(By.className("er8xn")).sendKeys("אבא");
        driver.close();
    }
}
