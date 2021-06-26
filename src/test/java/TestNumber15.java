import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNumber15 extends HomeWorkRun  {

    @BeforeClass
    public static void runOnceBeforeClass() {
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void test01(){
        ((JavascriptExecutor)driver).executeScript("document.getElementById(\"nine\").click();");
        driver.close();
    }

    // EX number 16
    /*
    * I know it's possible
    * 1. Cross browser Testing is a technique to test web application with different web browsers.
      2. Selenium can support different type of browsers for automation.
      3. Selenium can be integrated with TestNG to perform Multi Browser Testing.
      4. From parameters in testing.xml we can pass browser name, and in a test case,
      * we can create WebDriver reference accordingly.*/
}
