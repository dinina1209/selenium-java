package introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SmallIntroduction {

	public static void main(String[] args) {
		// Invoking Browser - chromedriver.exe
		//ChromeDriver driver = new ChromeDriver();
		
		// Chromedriver.exe -> Chrome Browser
		// step to invoke chrome driver = Selenium Manager
		
		System.setProperty("webdriver.chrome.driver","C:/Users/dna975/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}
