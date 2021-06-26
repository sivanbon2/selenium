import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Answers to questions 1-3
public class TestNumber1 extends HomeWorkRun {

    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://www.walla.co.il");
    }

    @Test
    public void test01(){
        String websiteTitle = "וואלה! - האתר המוביל בישראל - עדכונים מסביב לשעון";
        String websiteUrl = "https://www.walla.co.il/";
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        assert driver.getTitle().equals(websiteTitle);
        assert driver.getCurrentUrl().equals(websiteUrl);
        driver.close();
    }

}