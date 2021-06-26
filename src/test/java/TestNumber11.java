import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNumber11 extends HomeWorkRun {

    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void test01(){
        driver.findElement(By.id("email")).sendKeys("sivanh@rapyd.net");
        driver.findElement(By.id("passContainer")).sendKeys("1234");
        driver.findElement(By.name("login")).click();
        driver.close();

    }
}
