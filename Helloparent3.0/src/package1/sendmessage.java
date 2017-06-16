package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sendmessage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://beta-helloparent.azurewebsites.net");
		//institute login tab click
		driver.findElement(By.xpath(".//*[@id='page-top']/header/nav/div/div[2]/ul/li[7]/a/b")).click();
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("apoorv@gmail.com");
		driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("asdf1234");
		//institute login button click
		driver.findElement(By.xpath(".//*[@id='app']/div/div[2]/form/button")).click();
	/*	//messages tab click
		driver.findElement(By.xpath(".//*[@id='navbar-3']/ul/li[4]/a/span")).click();
		//new message button click
		driver.findElement(By.xpath(".//*[@id='view']/div/div/div[3]/div/div[2]/a")).click();
		//subject of message
		driver.findElement(By.xpath(".//*[@id='Subject']")).sendKeys("Automating messages");
		Select s = new Select(driver.findElement(By.id("StudentIds")));
        s.selectByValue("591ea2c83d820c047cba276e");
        driver.findElement(By.xpath(".//*[@id='view']/div/div/div/div/div[3]/form/button")).click();
		//wait till sent message button appears
        WebDriverWait d1 = new WebDriverWait(driver,7);
	    d1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='inbox-menu']/div/div/a[2]")));
	    driver.findElement(By.xpath(".//*[@id='inbox-menu']/div/div/a[2]")).click();
	 */
	   // hover over classes tab
		Actions actions = new Actions(driver);
	    actions.moveToElement(driver.findElement(By.xpath(".//*[@id='navbar-3']/ul/li[1]/a"))).build().perform();
	    // click on classes after hover
	    driver.findElement(By.xpath(".//*[@id='navbar-3']/ul/li[1]/ul/a[1]/li")).click();
	    //click on add new class button
	    driver.findElement(By.xpath(".//*[@id='view']/div[1]/div/div[2]/div/div[2]/a")).click();
	    //input for class name
	    driver.findElement(By.id("Name")).sendKeys("Class Automation");
	    
	 /*   String[] class_teacher = {"Apoo", "Te", "For"};
	    for(int i=0; i<class_teacher.length;i++){
	    driver.findElement(By.xpath(".//*[@id='view']/div/div/div/div[3]/form/div[3]/div/span[1]/span[1]/span")).sendKeys(class_teacher[i], Keys.ENTER);
	    }
	*/		
	    //Select multiple teachers
	    driver.findElement(By.xpath(".//*[@id='view']/div/div/div/div[3]/form/div[3]/div/span[1]/span[1]/span")).sendKeys("Apoo", Keys.ENTER, "For", Keys.ENTER,"Te", Keys.ENTER, "Apoo", Keys.ENTER);
       // click save class
	    driver.findElement(By.xpath(".//*[@id='view']/div/div/div/div[3]/form/div[4]/div/button")).click();
	  
	    //Click on students tab
	    driver.findElement(By.xpath(".//*[@id='navbar-3']/ul/li[2]/a/span")).click();
	    //click on add student button
	    driver.findElement(By.xpath(".//*[@id='view']/div[1]/div/div[2]/div/div[2]/a")).click();
	     //click on generate ID button and wait till text appears
	    driver.findElement(By.xpath(".//*[@id='generateIdentifier']")).click();
	    WebDriverWait d1 = new WebDriverWait(driver,5);
	    d1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='Identifier']")));
	    //click on dropdown for class
	    driver.findElement(By.xpath(".//*[@id='frmUnique']/div[2]/div/span[1]/span[1]/span/span[2]")).click();
	    //click on class name
	    driver.findElement(By.xpath("html/body/span/span/span[1]/input")).sendKeys("class 5", Keys.ENTER);  
	    //name of student
	    driver.findElement(By.xpath(".//*[@id='Name']")).sendKeys("Automate student");
	    //select date of birth first clear input
	    driver.findElement(By.xpath(".//*[@id='DateOfBirth']")).clear();
	    //now input date of birth
	    driver.findElement(By.xpath(".//*[@id='DateOfBirth']")).sendKeys("05 Oct 1992");
	    //select blood grp
	    driver.findElement(By.xpath(".//*[@id='frmUnique']/div[5]/div/span[1]/span[1]/span/span[2]")).click();
	    //enter blood grp in text field
	    driver.findElement(By.xpath("html/body/span/span/span[1]/input")).sendKeys("O-", Keys.ENTER);
	    //select gender using radio button
	    
	    
	    //input father's name
	    driver.findElement(By.xpath(".//*[@id='FatherName']")).sendKeys("Gautam Chaddha");
	    //enter father contact no.
	    driver.findElement(By.xpath(".//*[@id='FatherContactNo']")).sendKeys("7503139118");
	    //enter mothers name
	    driver.findElement(By.id("MotherName")).sendKeys("gautami chaddha");
	    //enter mother mobile
	    driver.findElement(By.id("MotherContactNo")).sendKeys("7503139118");
	    //enter address
	    driver.findElement(By.id("Line1")).sendKeys("New delhi");
	    //enter joining date
	    driver.findElement(By.id("JoiningDate")).clear();
	    driver.findElement(By.id("JoiningDate")).sendKeys("19 Jun 2017");
	    //select Fee frequency
	    Select s = new Select(driver.findElement(By.id("FeeFrequency")));
        s.selectByValue("HalfYearly");
        //click on create button
        driver.findElement(By.xpath(".//*[@id='frmUnique']/div[26]/div/button")).click();
	    
	    
	    
	    
	    //driver.quit();
	}

}
