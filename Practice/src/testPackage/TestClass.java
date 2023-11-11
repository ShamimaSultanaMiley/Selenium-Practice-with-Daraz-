package testPackage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","J:\\driver\\chromedriver.exe");
	    ChromeOptions chromeOptions = new ChromeOptions();
	    
	    chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
	    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
	    chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
	    
	    WebDriver driver = new ChromeDriver(chromeOptions);
	    
//	    driver.get("https://www.daraz.com.bd/");
	    driver.navigate().to("https://www.daraz.com.bd/");
	    driver.manage().window().maximize();
	    //Thread.sleep(10000);
	    
	    WebElement searchBox = driver.findElement(By.cssSelector("input#q"));
	    searchBox.sendKeys("camera");
	    WebElement searchButton = driver.findElement(By.cssSelector("button.search-box__button--1oH7"));
	    searchButton.click();
	    
//	    driver.manage().window().maximize(); 
	    
//	    List<WebElement> serviceList =  driver.findElements(By.cssSelector("div.filter-list--Ycia_ div.filter-panel--ghwYA:nth-child(4) label[class*='checkbox--tqPns ant-checkbox-wrapper']"));
	   List<WebElement> brandList = driver.findElements(By.cssSelector("div.filter-list--Ycia_ div.filter-panel--ghwYA:nth-child(4) label[class*='wrapper']"));

	    System.out.println("The size of service list is = "+ brandList.size());
	
	    
	    
	    
		/*
		 * //click on 2,3,5 no.checkbox under the service list for(WebElement service :
		 * serviceList) { //service.findElement(By.xpath(".//input")); if(service ==
		 * (serviceList.get(serviceList.size()-13)) || service ==
		 * (serviceList.get(serviceList.size()-12)) || service ==
		 * (serviceList.get(serviceList.size()-10))) {
		 * service.findElement(By.cssSelector(".input.ant-checkbox-input")).click(); }
		 * 
		 * }
		 */
	    
	    

	    // Click on checkboxes at indices 2, 3, and 5 under the brandList
    for (int i = 0; i < brandList.size(); i++) {
        int index = i + 1; // Adjust for 1-based indexing
        
	        if (index == 2 || index == 3 || index == 5) {
	            // serviceList.get(i).findElement(By.cssSelector(".input.ant-checkbox-input")).click();
	        	brandList.get(i).findElement(By.xpath(".//input")).click();
	        }
	    }

	    
//	    driver.close();
//	    driver.quit();

	}

}
