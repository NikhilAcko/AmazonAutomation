import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
class selectproduct {
    public static void selecting(WebDriver driver)throws InterruptedException{
        try{
            WebElement Element = driver.findElement(By.id("searchDropdownBox"));
            Element.click();
            Select select = new Select(Element);
            select.selectByVisibleText("Electronics");
            Thread.sleep(1000);

            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple Phones");
            Thread.sleep(1000);
            driver.findElement(By.id("nav-search-submit-button")).click();
            driver.get("https://www.amazon.in/Apple-iPhone-13-Pro-128GB/dp/B09G99YPQM/ref=sr_1_1_sspa?crid=1DK7RG69R9CS3&keywords=Apple+Phones&qid=1664258696&qu=eyJxc2MiOiI2LjQ1IiwicXNhIjoiNi4wOSIsInFzcCI6IjEuNTkifQ%3D%3D&s=electronics&sprefix=%2Celectronics%2C302&sr=1-1-spons&psc=1");

        }catch(RuntimeException exception){
            System.out.println("unable to select product");
        }

    }
}
