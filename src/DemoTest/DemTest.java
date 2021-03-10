package DemoTest;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\LearnAutomation\\Test\\src\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		
		
		
		//mouseover
		
		WebElement ele1 = driver.findElement(By.linkText("SwitchTo"));
		
		
		
		Actions action = new Actions(driver);
		action.moveToElement(ele1).build().perform();
		driver.findElement(By.linkText("Alerts")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class = 'btn btn-danger']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		//driver.findElement(By.xpath(".//*[@id='msdd']")).click();
	//	driver.findElement(By.linkText("Arabic")).click();
		
		/*
		 * Select select1 = new
		 * Select(driver.findElement(By.xpath(".//*[@id='msdd']")));
		 * 
		 * select1.selectByVisibleText("Arabic").c;
		 */
		
	/*
	 * WebElement webElement1 = driver.findElement(By.xpath(".//*[@id='msdd']"));
	 * 
	 * //webElement1.click();
	 * 
	 * Select select = new Select(webElement1); select.selectByValue("Arabic");
	 */
		
		/*
		 * driver.findElement(By.
		 * xpath("//input[@type='text'and @placeholder ='First Name']")).sendKeys(
		 * "Yogesh"); driver.findElement(By.
		 * xpath("//input[@type='text' and @placeholder='Last Name']")).sendKeys("Tepox"
		 * );
		 * driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Atria Grande"
		 * ); driver.findElement(By.xpath("//input[@type='email']")).sendKeys(
		 * "abc@gmail.com");
		 * driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9898989898");
		 * driver.findElement(By.xpath("//input[@value='Male']")).click();
		 * driver.findElement(By.xpath("//input[@id='checkbox1'and @value='Cricket']")).
		 * click();
		 * driver.findElement(By.xpath("//input[@id='checkbox2'and @value='Movies']")).
		 * click(); // driver.findElement(By.xpath("//div[@class=\"col-sm-2 col-md-2
		 * col-xs-2 // hidden-xs\"]")).click();
		 * driver.findElement(By.xpath("//select[@type='text'and @id='Skills']")).click(
		 * ); Thread.sleep(5000);
		 */
		//driver.close();

		// driver.findElement(By.xpath("By.xpath(\"//div[@class
		// ='ui-autocomplete-multiselect ui-state-default
		// ui-widget']")).sendKeys("Arabic");
		// Select sel1=new Select(driver.findElement(By.xpath("//div[@class
		// ='ui-autocomplete-multiselect ui-state-default ui-widget']")));

	}

}
