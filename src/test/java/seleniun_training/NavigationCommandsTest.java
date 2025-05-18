package seleniun_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommandsTest {
	WebDriver driver;
	
public void setup() {	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
@Test	
public void testNavigationCommands() {
	driver.get("https://www.netflix.com/nz/");
	Navigation navigation = driver.navigate();
	navigation.to("https://www.google.com");
	navigation.back();
	navigation.forward();
	navigation.refresh();
}
		
public void teardown() {
if(driver!=null){
driver.quit();
 }
}

}


