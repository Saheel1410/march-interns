package selenium.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver_88.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		//driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@type=\"text\"])[30]").sendKeys("Saheel",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByLinkText("10421").click();
		driver.close();
	}

}
