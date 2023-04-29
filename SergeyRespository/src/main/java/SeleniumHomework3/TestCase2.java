package SeleniumHomework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class TestCase2 {
    /*
    Navigate to "https://www.saucedemo.com/" Enter username "standard_user"
Enter password "secret_sauce"
Click Login button
Select Price (low-high) from drop down box
Validate the products are displayed according to their price and they are displayed low price to high price

     */
    @Test
    public void sss() throws InterruptedException {
        System.setProperty("webdriver.http.factory","jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        List<WebElement> itemNamesDefault = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<WebElement> itemPricesDefault = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        Map<String,String> defaultSort = new HashMap<>();
        for(int i = 0; i<itemNamesDefault.size();i++){
            defaultSort.put(itemNamesDefault.get(i).getText().trim(), itemPricesDefault.get(i).getText().trim());
        }

        Select select = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        select.selectByValue("lohi");


        List<WebElement> itemNames = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<WebElement> itemPrices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        Map<String,String> afterSort = new HashMap<>();
        for(int i = 0; i<itemNames.size();i++){
            afterSort.put(itemNames.get(i).getText().trim(), itemPrices.get(i).getText().trim());
        }

        Assert.assertEquals(defaultSort,afterSort); // products are displayed according to their prices

        List<Double> doubleItemPrices = new ArrayList<>();
        List<Double> sortedItemPrices = new ArrayList<>();
        for(WebElement itemPrice : itemPrices){
            doubleItemPrices.add(Double.parseDouble(itemPrice.getText().trim().replace("$","")));
            sortedItemPrices.add(Double.parseDouble(itemPrice.getText().trim().replace("$","")));
        }

        Collections.sort(sortedItemPrices);

        Assert.assertEquals(doubleItemPrices,sortedItemPrices);//displayed low price to high






    }
}
