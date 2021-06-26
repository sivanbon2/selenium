import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNumber5 extends HomeWorkRun  {
    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void test01(){
        System.out.println(driver.findElement(By.id("logo-icon")).getAttribute("id"));
        driver.close();
    }

}

