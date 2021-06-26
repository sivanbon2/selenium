import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestNumber12 extends HomeWorkRun {
    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void test01(){

        System.out.println(driver.findElement(By.id("seven")).getSize());

        if(driver.findElement(By.id("six")).isDisplayed()){
            System.out.println("Six button is displayed");
        }else {
            System.out.println("Six button is not displayed");
        }
        driver.close();
    }

    @Test
    public void test02(){
        WebElement num = driver.findElement(By.id("seven"));
        System.out.println(driver.findElement(By.id("seven")).getSize());
        List<WebElement> elements = driver.findElements(By.className("keys"));

        String result = "4";
        driver.findElement(By.id("two")).click();
        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.id("equal")).click();
        assert result.equals( driver.findElement(By.id("screen")).getText());
        driver.close();

        }

        //EX 13
    @Test
    public void test03(){
        System.out.println(driver.findElement(By.id("two")).getCssValue("height"));
        System.out.println(driver.findElement(By.id("two")).getCssValue("width"));
        driver.close();

    }




}

