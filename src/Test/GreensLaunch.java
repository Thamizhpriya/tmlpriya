package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\priya\\java\\eclipse-workspace\\Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement createTxt= driver.findElement(By.xpath("//span[contains(text(),'Greens Technologys')]"));
		String text=createTxt.getText();
		System.out.println(text);
		String ti = driver.getTitle();
		System.out.println(ti);
		String url=driver.getCurrentUrl();
		System.out.println("url");
	}
}
