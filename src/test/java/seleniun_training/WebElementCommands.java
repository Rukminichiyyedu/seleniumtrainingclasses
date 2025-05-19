package seleniun_training;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementCommands {
	WebDriver driver;
@BeforeMethod	
public void setup() {	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
@Test
	public void webelementCommandsTest() {
		driver.get("https://github.com/login");
		WebElement UsernameTxtBx = driver.findElement(By.id("login_field"));
		
		if(UsernameTxtBx.isDisplayed() && UsernameTxtBx.isEnabled()) {
		UsernameTxtBx.clear();
		UsernameTxtBx.sendKeys("abc.gmail.com");
		System.out.println(UsernameTxtBx.getTagName());
		System.out.println(UsernameTxtBx.getDomAttribute("autofocus"));
		
		Dimension dim = UsernameTxtBx.getSize();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		Point p=UsernameTxtBx.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Rectangle r = UsernameTxtBx.getRect();
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getX());
		System.out.println(r.getY());
		
		System.out.println(UsernameTxtBx.getCssValue("background-colour"));
		
		WebElement ele = driver.findElement(By.tagName("h1"));
		System.out.println(ele.getText());
		}
		
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.className("btn-primary")).click();

  }

public void teardown() {
	 if(driver!=null){
	 driver.quit();
	 }
}
}
