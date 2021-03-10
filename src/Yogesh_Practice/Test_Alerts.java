package Yogesh_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Register.html");
		/*
		 * driver.navigate().refresh();//to refresh page driver.navigate().back();
		 * driver.navigate().forward();
		 */
		String url=driver.getCurrentUrl();
		System.out.println("cyrrent ULR of site is :-"+url);
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio buttons="+radios.size());
		System.out.println(radios.get(1).isEnabled());
		System.out.println(radios.get(0).isDisplayed());
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='radio']")));
		
		radios.get(1).click();
		List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total size of checkbox="+check.size());
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\ADMIN\\Desktop\\Selenium_File_Upload.txt");
				
		//driver.close();

		
		/*
		 * WebElement el1 = driver.findElement(By.linkText("SwitchTo")); Actions Act1 =
		 * new Actions(driver); Act1.moveToElement(el1).build().perform();
		 * Thread.sleep(2000); driver.findElement(By.linkText("Alerts")).click();
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("//button[@class ='btn btn-info']")).click();
		 * Thread.sleep(5000); driver.switchTo().alert().sendKeys("yogesh");
		 */
		/*
		 * driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button [@class='btn btn-primary']")).click();
		 * driver.switchTo().alert().dismiss();
		 */
	}

}
