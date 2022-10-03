import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class login {
    public static void signin( WebDriver driver) throws InterruptedException{
        try{
            driver.findElement(By.id("ap_email")).sendKeys("9818277494");
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("ap_password")).sendKeys("Acko@1234");
            driver.findElement(By.id("signInSubmit")).click();
            Thread.sleep(6000);
        }catch (RuntimeException exception){
            System.out.println("unable to sign in");
        }

    }
}
