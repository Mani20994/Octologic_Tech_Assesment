package Test_Assesment_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Minimals_Management {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(options);
		   
		driver.manage().window().maximize();
		
		driver.get("https://minimals.cc/");
		Thread.sleep(4000);
		
		
	//Login button
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/a[2]")).click();
		Thread.sleep(2000);
		
		// Email address
		driver.findElement(By.name("email")).sendKeys("demo@minimals.cc");
		Thread.sleep(2000);
		
		//Password
		driver.findElement(By.name("password")).sendKeys("demo1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Login
		driver.findElement(By.id(":r2a:")).click();
		Thread.sleep(4000);
		
		
		//User
		driver.findElement(By.xpath("//span[contains(text(),'user')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Account
		driver.findElement(By.xpath("//span[contains(text(),'account')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Billing
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//drop down
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[3]/div[3]")).click();
		Thread.sleep(3000);
		
		//drop down
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[5]/div[2]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[3]/div[1]")).click();
		Thread.sleep(10000);
		
		
		//Order
		driver.findElement(By.xpath("//span[contains(text(),'order')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//List
		driver.findElement(By.xpath("//span[contains(text(),'list')]")).click();
		Thread.sleep(10000);
		
		
		//jobs
		driver.findElement(By.xpath("//span[contains(text(),'job')]")).click();
		Thread.sleep(4000);
		
		//List
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/a[1]/div[1]")).click();
		Thread.sleep(3000);
		
		
		//filters
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(3000);
		
		//On demand check box
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[3]/span[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//close icon 
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click on chat
		driver.findElement(By.xpath("//span[contains(text(),'chat')]")).click();
		Thread.sleep(5000);
		
		//select the person
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h6[1]")).click();
		Thread.sleep(3000);
		
		//enter message
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys("Hello, How are you?");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
		
		
		//File Manager 
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//select check box
		//driver.findElement(By.xpath("//thead/tr[1]/th[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/input[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Delete button
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/button[2]/*[1]")).click();
		Thread.sleep(4000);
		
		//confirm on delete button
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		
		driver.close();
		
}}

