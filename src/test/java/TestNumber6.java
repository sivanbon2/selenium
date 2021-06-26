import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNumber6 extends HomeWorkRun   {
    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumhq.org/");
    }

    @Test
    public void test01(){
        System.out.println(driver.findElement(By.name("search")).getAttribute("id"));
        driver.findElement(By.name("search")).sendKeys("selenium");
        driver.close();
    }
}
