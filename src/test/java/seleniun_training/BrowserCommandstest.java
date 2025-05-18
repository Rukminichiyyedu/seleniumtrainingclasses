package seleniun_training;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserCommandstest {
	WebDriver driver;
		
public void setup() {	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
	@Test
	public void testbrowsercommands() {
		
	String title = driver.getTitle();
	System.out.println("page title:" + title); 
	Assert.assertEquals(title, "Netflix New Zealand - watch TV shows online, watch movies online");
	
	String currenturl = driver.getCurrentUrl();
	System.out.println("CurrentUrl:" + currenturl);
	
	String pagesource = driver.getPageSource();
	System.out.println("PageSource:" + pagesource);
	
	}

 public void teardown() {
	 if(driver!=null){
	 driver.quit();
	 }
 }

}
