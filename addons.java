import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class addons {
    public static void extras(WebDriver driver) throws InterruptedException{
        try{
            driver.findElement(By.xpath("//body[1]/div[4]/div[2]/div[3]/div[12]/div[36]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[1]/span[1]/div[1]/span[1]/span[1]/span[1]/button[1]/div[1]/div[1]/p[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("mbbPopoverLink")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//body[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/button[1]")).click();
            driver.findElement(By.id("a-autoid-14")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("add-to-cart-button")).click();
            driver.findElement(By.id("attach-sidesheet-checkout-button")).click();
        }catch (RuntimeException exception){
            System.out.println("Unable to select add-ons");
        }
    }
}
