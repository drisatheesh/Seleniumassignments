package assignment1;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	WebDriver driver;
	 public void intializebrowser()
	 {
		 driver=new FirefoxDriver();
		 //driver.get("https://selenium.qabible.in/");//get launch
		 driver.manage().window().maximize();//for maximimizing
	 }
	 public void driverquitandclose()
	  {
		  driver.quit();
		  driver.close();
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Base home1=new Base();
        home1.intializebrowser();
        home1.driverquitandclose();
	}

}
