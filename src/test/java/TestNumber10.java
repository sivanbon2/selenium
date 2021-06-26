import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestNumber10 extends HomeWorkRun {

    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Controllers/");
    }

    @Test
    public void test01(){
        List<WebElement> elements = driver.findElements(By.className("table5"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
            assert element.findElement(By.xpath("//input[3]")).getAttribute("value").equals("Cheese") ;
            driver.close();
        }
    }

    @Test
    public void test02(){
        List<WebElement> elements = driver.findElements(By.name("dropdownmenu"));
        for (WebElement element : elements) {
            element.click();
            element.findElement(By.xpath("//option[2]")).click();
            System.out.println(element.getText());
            driver.close();
        }
    }
}
