package week2.day2;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _58mg')]")).sendKeys("Rajalakshmi");
		driver.findElement(By.name("lastname")).sendKeys("Maniraj");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following::input")).sendKeys("9361476192");
		driver.findElement(By.id("password_step_input")).sendKeys("rm123@fb");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement dropdown1 = driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[1]"));
		Select source1=new Select(dropdown1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//source1.selectByVisibleText("//option[text()='4']");
		source1.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select source2=new Select(dropdown2);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//source2.selectByVisibleText("//option[text()='Nov']");
		source2.selectByIndex(10);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select source3=new Select(dropdown3);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//source3.selectByVisibleText("//option[text()='1994']");
		source3.selectByIndex(28);
		driver.findElement(By.name("sex")).click();
		
		
	}

}
