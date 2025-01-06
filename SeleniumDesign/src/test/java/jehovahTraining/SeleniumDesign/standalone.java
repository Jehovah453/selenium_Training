package jehovahTraining.SeleniumDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class standalone {
    public static void main(String[] args) throws InterruptedException {
        // Use WebDriverManager to set up ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
        
      driver.get("https://demoqa.com/browser-windows");
        
      System.out.println(driver.getCurrentUrl());  
      
      driver.findElement(By.xpath("//div[@class=\"header-wrapper\"]")).click();
      
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("//span[contains(text(),\"Text Box\")]")).click();
      
      System.out.println(driver.findElement(By.xpath("//h1[@class=\"text-center\"]")).getText());
        
        
}
    }