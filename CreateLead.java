package selenium.learning;

import java.util.concurrent.TimeUnit;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","./driver/chromedriver_88.exe");
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
		driver.findElementByLinkText("Create Lead").click();
	    driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
	    driver.findElementById("createLeadForm_firstName").sendKeys("Saheel");
	    driver.findElementById("createLeadForm_lastName").sendKeys("Khan");
	    driver.findElementByClassName("smallSubmit").click();
	    driver.close();
	}

}
