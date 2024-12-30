package browser;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Apple {

	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("weddriver.Chrome.driver"."chromedriver-win64/.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/in/");
		Thread.sleep(5000);
         //scroll by
		//classname referance variable=new classname();
		Actions actions=new Actions(driver);
		actions.scrollByAmount(0,3000).perform();
		//radio Button click
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("sex")).click();
			WebElement maleRadiobutton=driver.findElement(By.xpath("//input[@value=male]"));
			if(maleRadiobutton.isSelected())
			{
				System.out.println("display male radio button is selected");
			}
			else
			{
				System.out.println("display female & custom radio buttons are unselected");
			}
			
			}
	}


