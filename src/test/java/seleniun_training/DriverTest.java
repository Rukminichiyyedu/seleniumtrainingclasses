package seleniun_training;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverTest {
	
	@Test
	public void chromeTest() {
	ChromeDriver driver = new ChromeDriver();
		
	}
	@Test
	public void EdgeTest() {
	EdgeDriver driver = new EdgeDriver();
	}
	@Test
	public void FirefoxTest() {
    FirefoxDriver driver = new FirefoxDriver();
	}
	

}
