import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNumber4 extends HomeWorkRun  {

    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
    }

    @Test
    public void test01(){
       System.out.println(driver.findElement(By.className("er8xn")).getAttribute("class"));
       System.out.println(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[1]/span/span/div/textarea"))
               .getAttribute("jsname"));
        driver.close();

    }
}
