package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", "E:\\QA automation\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	
	public void openLoginPage(){
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=71zIZnTyrPU&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiNzF6SVpuVHlyUFUiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1NDI3NjgwMSwiaWF0IjoxNjU0Mjc1NjAxLCJqdGkiOiI5OTYzY2E5My0zMzlmLTRlNjMtOWY0Yy1hNjI2NDE1Nzc4OTMiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.oQPBGp9Nb6ODs_Hc1oykzuEOR0pfCk3i0AvUZhrvgDIpmGfTf-j5jUmsWoOcvAmu_k3xLGmrN00q_Ar_mOhq8Y-gkwarxPIUrnM7WPVkqRXnrMRVwapqS7yElGthk0iZSEliM32MKRZ3Y359PQKxyWRAjFd61OfyrJD1UZQi0mKMXF25z9dOPbNDYndk8h5_6hLLb6tapuVGnh5rbQtY6VhU1K9aFTnvuA-vDcOnLBHEAFaPRMokWs8ACJlRBthWuifxdFl_u-uZ8u0u0VNJEXbxcdjS34JI1PtP7sAWxca465p6KwxxTNCRo6dVgzdBzdNO2BKUjdaug9iSUlD7Ig&preferred_environment=");
	
	}
	
	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
		
	}

	public void closeBrowse(){
		driver.quit();
	}
	
	public void login(String a, String b) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
		
	}
	
	public void clickOnLoginButton() throws InterruptedException{
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);	
	}
	
	
	public String readErr() {
		
		String actualError = driver.findElement(By.xpath("/html/body/div/div/main/div/div[1]/h1")).getText();
		System.out.println(actualError);
		return actualError;
		
		
	}
}
