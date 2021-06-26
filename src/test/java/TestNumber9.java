import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNumber9 extends HomeWorkRun {
    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void test01(){
        driver.findElement(By.id("search")).sendKeys(" LITTLE BIG - HYPNODANCER (Official Music Video)");
        driver.findElement(By.id("search-icon-legacy")).click();
        driver.close();
    }
}
