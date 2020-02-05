package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HandleTextBox extends Thread 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samarpan.DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		System.out.println("Opening");
		//Case1
		driver.findElement(By.xpath("//*[@class=\"_2zrpKA _1dBPDZ\"]")).sendKeys("9751****");
		driver.findElement(By.xpath("//*[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]")).sendKeys("******");
		driver.findElement(By.xpath("//*[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
		System.out.println("Logged in");
		Actions act = new Actions(driver);
		WebElement web = driver.findElement(By.xpath("//input[@type='text']"));
		act.moveToElement(web);
		try {
			
			//Case2
			act.click().build().perform();	
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Hovers");
		//Case3
		driver.findElement(By.xpath("//*[@class=\"LM6RPg\"]")).sendKeys("Apple");
		//Case4
		driver.findElement(By.xpath("//*[@class=\"vh79eN\"]")).click();
		//Case5
		driver.findElement(By.xpath("(//*[@class=\"_3wU53n\"])[1]")).click();	
	}

}
