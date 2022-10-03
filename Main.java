import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        try {
            System.setProperty("webdriver.chrome.driver", "/Users/nikhil.kabba/IdeaProjects/SeleniumFirstUseCase/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            driver.get("https://www.amazon.in");
            driver.manage().window().maximize();
            try {
                //Test if the product is selected properly
                selectproduct.selecting(driver);
                //Test if delivery location is selected
                deliverylocation.enterpincode(driver);
                //Test if add-on are added
                addons.extras(driver);
                //Test if user is able to sign in
                login.signin(driver);
                //Test if payment is successful
                purchase.payment(driver);

            }catch(RuntimeException exception){
                System.out.println("Unable to find selectors !!");
            }finally {
                Thread.sleep(5000);
               driver.quit();
            }
        }catch(RuntimeException exception){
            System.out.println("Unable to run the code !!");
        }
    }
}