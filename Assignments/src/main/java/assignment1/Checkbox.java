package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base {
public void checkbox()
{
	driver.navigate().to("https://demoqa.com/checkbox");
	WebElement check1=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
	check1.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox checkbox=new Checkbox();
		checkbox.intializebrowser();
		checkbox.checkbox();
	}

}
