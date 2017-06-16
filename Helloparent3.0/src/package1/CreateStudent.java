package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
