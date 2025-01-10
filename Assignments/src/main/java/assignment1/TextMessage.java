package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextMessage extends Base {
	public void textMessage()
	{
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement text=driver.findElement(By.xpath("//input[@id='userName']"));
		text.sendKeys("Drisya");
		
	
	
		WebElement text2=driver.findElement(By.xpath("//input[@id='userEmail']"));
		text2.sendKeys("drisatheesh@gmail.com");
		WebElement text3=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		text3.sendKeys("malavilaveedu,Karamcodu po,Kollam");
		WebElement text4=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		text4.sendKeys("Malavilaveedu,Karamcode");
		
	
		WebElement text5=driver.findElement(By.xpath("//button[@id='submit']"));
		text5.click();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextMessage textmessage=new TextMessage();
		textmessage.intializebrowser();
		textmessage.textMessage();
		//textmessage.button();
		//textmessage.gmail();
		
	}

}
