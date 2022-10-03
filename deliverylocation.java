import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class deliverylocation {
    public static void enterpincode(WebDriver driver)throws InterruptedException {
        try {
            driver.findElement(By.xpath("//div[@id='contextualIngressPtLabel_deliveryShortLine']")).click();
            driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("122001");
            driver.findElement(By.xpath("//span[@id='GLUXZipUpdate']")).click();
            Thread.sleep(2000);
            driver.get("https://www.amazon.in/Apple-iPhone-13-Pro-256GB/dp/B09G99YPQM/ref=sr_1_1?crid=1O80S698VYC5C&dd=mdi3jYe9y7JefCg2VNXyUw%2C%2C&keywords=Apple%2BPhones&qid=1664222342&qu=eyJxc2MiOiI2LjQ1IiwicXNhIjoiNi4wOSIsInFzcCI6IjEuNTkifQ%3D%3D&refinements=p_90%3A6741117031&rnid=6741116031&s=electronics&sprefix=%2Celectronics%2C269&sr=1-1&th=1");
        }catch(RuntimeException exception){
            System.out.println("unable to set location");
        }
    }
}