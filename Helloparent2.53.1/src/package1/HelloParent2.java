package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://beta-helloparent.azurewebsites.net");
		driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=]/header/nav/div/div[2]/ul/li[7]/a/b")).click();
		driver.close();
	}

}
