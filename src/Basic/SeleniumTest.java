package Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest{


    public static  void main(String[] args){

        System.out.println("Hiii");

        System.setProperty("webdriver.chrome.driver","D:\\Projects\\NextGen\\ClientLaunch\\Poc\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        String baseUrl="https://www.google.com/";

        driver.get(baseUrl);
        String expectedTitle="Google";
        String actualTitle="";
        actualTitle=driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }

public String GetTitle() {

    System.setProperty("webdriver.chrome.driver", "/opt/java/lib/chromedriver");

    ChromeOptions options = new ChromeOptions();
    options.setBinary("/opt/java/lib/headless-chromium");
    options.addArguments("--headless");
    options.addArguments("--no-sandbox");
    options.addArguments("--single-process");
    options.addArguments("--disable-dev-shm-usage");

    WebDriver driver = new ChromeDriver(options);

    String baseUrl = "https://www.google.com/";

    driver.get(baseUrl);

    String actualTitle = "";
    actualTitle = driver.getTitle();

    driver.close();
    return actualTitle;
}
}