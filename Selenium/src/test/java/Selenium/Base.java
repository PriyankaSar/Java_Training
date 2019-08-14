package Selenium;
import org.testng.annotations.AfterSuite;
import static Selenium.Test1.driver;

public class Base {

	public static void main(String[] args) {
		
	}
		// TODO Auto-generated method stub
		@AfterSuite(alwaysRun = true)
		public static void afterSuite() {
		driver.quit();
}
}