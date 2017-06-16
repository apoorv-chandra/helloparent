package hellopackagetest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	 public static void main(String[] args) {
	         //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    	 //driver = new FirefoxDriver();
		  	 System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
	    	 WebDriver driver1 = new ChromeDriver();
	         String baseUrl = "https://beta-helloparent.azurewebsites.net/Account/Login";
	         String expectedTitle = "School Parent Communication in the easiest way";
	         String actualTitle = "";
	         // launch Fire fox and direct it to the Base URL
	         driver1.get(baseUrl);
	         // Enter school_id
     	     driver1.findElement(By.id("Email")).sendKeys("apoorv@gmail.com");
	         // Enter mobile_number
	         driver1.findElement(By.id("Password")).sendKeys("asdf1234");
	         //Enter password
	         //driver1.findElement(By.id("send_password")).sendKeys("asdf1234");
	         // Click on 'Sign In' button
	        // driver1.findElement(By.id("register")).click();
	         // Wait For Page To Load
	        driver1.findElement(By.xpath("//button[@type='submit']")).click();
	          driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         // Click on the image icon present in the top right navigational Bar
	         //driver1.findElement(By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a")).click();
	         //Click on 'Logout' Button
	         //driver1.findElement(By.xpath("//*[@id='gb_71']")).click();
	         //Close the browser.
	        //driver1.close();
	         // get the actual value of the title
	         actualTitle = driver1.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close chrome
	       driver1.close();
	       
	        // exit the program explicitly
	        System.exit(0);
	    }

}
