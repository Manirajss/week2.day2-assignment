package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();
		//driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("310");
		driver.findElement(By.name("phoneNumber")).sendKeys("9361476192");
		//driver.findElement(By.xpath("//button[contains(text(),'Find Contacts')]")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//WebElement LeadID = driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=10066'])[2]"));
		//System.out.println(LeadID);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=10827'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9361476192");
		String Text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(Text);
		driver.close();
		/*WebElement LeadID = driver.findElement(By.linkText("DemoCustomer"));
		System.out.println(LeadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.DELETE).perform();
		driver.findElement(By.className("selected")).click();*/
		
		
		
		
		

	}

}
