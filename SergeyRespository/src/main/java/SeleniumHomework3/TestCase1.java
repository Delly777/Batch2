package SeleniumHomework3;

import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCase1 {
    /*Navigate to "https://www.saucedemo.com/" Enter username "standard_user"
Enter password "secret_sauce"
Click Login button
Select Name (Z-A) from drop down box
Validate the products are displayed in descending order

     */

    @Test
    public void validateProductsOrder(){
        System.setProperty("webdriver.http.factory","jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


        Select select = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        select.selectByValue("za");

        List<WebElement> itemNames = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> stringItemNames = new ArrayList<>();
        List <String> sortedItemNames = new ArrayList<>();
        for (WebElement itemName:itemNames){
            stringItemNames.add(itemName.getText().trim());
            sortedItemNames.add(itemName.getText().trim());
        }
        Collections.sort(sortedItemNames);
        Collections.reverse(sortedItemNames);
        Assert.assertEquals(stringItemNames,sortedItemNames);


    }


}
