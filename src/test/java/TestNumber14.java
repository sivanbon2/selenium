import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestNumber14 extends HomeWorkRun  {

    @Test
    public void test1() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);
        driver.get("https://translate.google.com");
        options.addArguments("--disable-extensions");
        driver.close();
    }

}
