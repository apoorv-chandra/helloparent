package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class QlesFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://qles-dev.herokuapp.com/");
		driver.findElement(By.xpath(".//*[@id='menu_nav']/ul/span[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='autocomplete']")).sendKeys("apoorv school");
		driver.findElement(By.xpath(".//*[@id='send_phone']")).sendKeys("9582170832");
		driver.findElement(By.xpath(".//*[@id='send_password']")).sendKeys("asdf1234");
		driver.findElement(By.id("register")).sendKeys(Keys.ENTER);
		
		
	}

}
