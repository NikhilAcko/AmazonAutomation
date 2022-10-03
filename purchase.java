import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class purchase {
    public static void payment(WebDriver driver)throws InterruptedException{
        try{
            Thread.sleep(2000);
            driver.findElement(By.id("shipToThisAddressButton")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//body[1]/div[9]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
            Thread.sleep(2000);
            //            driver.findElement(By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]")).click();
//            driver.findElement(By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]")).click();
//            driver.findElement(By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]")).click();
//           driver.findElement(By.xpath("//body[1]/div[9]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
//            driver.findElement(By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]")).click();
//            driver.findElement(By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]")).click();
//            driver.findElement(By.xpath("//body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
            //driver.findElement(By.id("setOrderingPrefsCheckbox")).click();
            //driver.findElement(By.id("bottomSubmitOrderButtonId")).click();
        }catch (RuntimeException exception){
            System.out.println("unable to select payment method");
        }
    }
}
