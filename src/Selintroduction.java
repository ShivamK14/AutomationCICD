import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Selintroduction {
	public static void main(String[] args) throws InterruptedException {
		
		
		String[] Item = {"iphone X"};
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivakar\\OneDrive - AMDOCS\\Backup Folders\\Desktop\\Java Selenium\\Selenium\\Introduction\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
//		Assert.assertEquals(driver.findElement(By.id("checkBoxOption1")).isSelected(), true);
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		//		Assert.assertEquals(driver.findElement(By.id("checkBoxOption1")).isSelected(), false);
//		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.className("signInBtn")).click();
//		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card.h-100")));
		List<WebElement> items = driver.findElements(By.cssSelector(".card.h-100"));
		GetElement(driver,items,Item);
		
		
		
	}
	
	public static void GetElement(WebDriver driver,List<WebElement> Items,String[] Item) {
		
		int j = 0;
			List ItemNeded = Arrays.asList(Item);
			System.out.print(ItemNeded);
			for (int i = 0;i<Items.size();i++) {
				
				
				System.out.print(Items.get(i).getText());
				
				if (ItemNeded.contains(Items.get(i).getText())) {
					driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
					System.out.print(driver.findElements(By.cssSelector(".btn.btn-info")).get(i));
//					driver.findElements(By.cssSelector(".btn"))
					j++;
					if (j==ItemNeded.size()) {
						break;
					}
					
					
				}
			
			
			
		}
		
		
		
		
	}
		
		
		
//		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		
//		for(WebElement option:options) {
//			if (option.getText().equalsIgnoreCase("India")) {
//				option.click();
//				break;
//			}
//			
//		}
//		Thread.sleep(1000);
//		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		import java.util.Arrays;
//
//		import java.util.List;
//
//		import java.util.concurrent.TimeUnit;
//
//
//
//		import org.openqa.selenium.By;
//
//		import org.openqa.selenium.WebDriver;
//
//		import org.openqa.selenium.WebElement;
//
//		import org.openqa.selenium.chrome.ChromeDriver;
//
//		import org.openqa.selenium.support.ui.ExpectedConditions;
//
//		import org.openqa.selenium.support.ui.WebDriverWait;
//
//
//
//		public class base {
//
//
//
//		public static void main(String[] args) throws InterruptedException {
//
//		// TODO Auto-generated method stub
//
//		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//
//
//
//		WebDriver driver=new ChromeDriver();
//
//
//
//		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
//
//
//
//
//
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//
//		Thread.sleep(3000);
//
//		addItems(driver,itemsNeeded);
//
//		}
//
//		public static  void addItems(WebDriver driver,String[] itemsNeeded)
//
//		{
//
//		int j=0;
//
//		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
//
//		for(int i=0;i<products.size();i++)
//
//		{
//
//		//Brocolli - 1 Kg
//
//		//Brocolli,    1 kg
//
//		String[] name=products.get(i).getText().split("-");
//
//		String formattedName=name[0].trim();
//
//		//format it to get actual vegetable name
//
//		//convert array into array list for easy search
//
//		//  check whether name you extracted is present in arrayList or not-
//
//		List itemsNeededList = Arrays.asList(itemsNeeded);
//
//		if(itemsNeededList.contains(formattedName))
//
//		{
//
//		j++;
//
//		//click on Add to cart
//
//		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//
//		if(j==itemsNeeded.length)
//
//		{
//
//		break;
//
//		}
//
//		}
//
//		}
//
//		}
//
//
//
//		}
		
	
}
