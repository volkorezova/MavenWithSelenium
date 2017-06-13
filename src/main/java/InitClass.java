import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by tatyanavolkorezova on 13.06.17.
 */
public class InitClass {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://old.qalight.com/zapisatsya-na-kurs/");
        WebElement element = driver.findElement(By.name("Записаться на курс"));

        System.out.println("Page title is: "+ driver.getTitle());



    }



}
