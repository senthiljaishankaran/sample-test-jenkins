import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
@Test
public class SampleTest {
    public void sampleTest()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\senth\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.google.com");
        String title=driver.getTitle();
        System.out.println("Title of the website is: "+title);

        driver.quit();
    }
}
