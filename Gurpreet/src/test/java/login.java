import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class login {
	
	
	
	@Test	
	public void Login()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium_Software\\geckodriver.exe");  
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://localhost:100/");
	    driver.findElement(By.name("user_name")).clear();
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).clear();
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	    driver.findElement(By.name("Login")).click();
	}
	
	

}
