package MyTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class My_NewTest2 {
	public WebDriver driver;
  @Test
  public void googletest() {
	  driver.get("http://www.fb.com");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "H:\\New folder\\driver\\chrome\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
