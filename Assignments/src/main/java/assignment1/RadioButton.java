package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {
	
	public void radio()
	{
		driver.navigate().to("https://demoqa.com/radio-button");
		WebElement radio1=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		radio1.click();
		WebElement radio2=driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		radio2.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton radiobutton=new RadioButton();
		radiobutton.intializebrowser();
		radiobutton.radio();
	}

}
