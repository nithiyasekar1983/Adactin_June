package com.Adactin;

import java.awt.AWTException;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	 public	static WebDriver driver;
	 
	 
		public static WebDriver browserLaunch(String browser) {
			
			 if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\Project\\programs done by me\\Adactin\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("gecko", "E:\\Project\\programs done by me\\MiniProject\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}else {
				System.out.println("INVALID BROWSER");
			}
			 
			 driver.manage().window().maximize();
			 
			 return driver;

		}


		// close
		public static void closeCurrentPage() {
			
			driver.close();
		}
		
		//quit
		
		public static void quit() {
			
			driver.quit();
		}
		
		//get
		
		public static void getUrl(String str) {
			
			driver.get(str);
		}

		// navigate
		
		public static void navigateTo(String str) {
			
			driver.navigate().to(str);
			
			
		}
		
		// Web Element Methods
		//click - webelement
		
		public static void clickOnElement(WebElement element) {
			
			element.click();
		}
		
		// sendkeys - (webelement string)
		
		public static void enterValues(WebElement element , String str) {
			
			element.sendKeys(str);			

		}
		// single drop down
		public static void dropDown(WebElement element , String value) {
			
			Select s = new Select(element);
			
							
			if (value.equals("3")) {
				
				s.selectByIndex(Integer.parseInt(value));
				
			}else if (value.equals("standard")) {
				
				s.selectByValue(value);
				
			}else if (value.equals("Sydney")) {
				
				s.selectByVisibleText(value);					
			}				
			
		}
	public static void dropDown1(WebElement element , String value) {
			
			Select s = new Select(element);
			
							
			if (value.equals("2")) {
				
				s.selectByIndex(Integer.parseInt(value));
				
			}else if (value.equals("2")) {
				
				s.selectByValue(value);
				
			}else if (value.equals("Two")) {
				
				s.selectByVisibleText(value);					
			}				
			
		}
	public static void dropDown2(WebElement element , String value) {
		
		Select s = new Select(element);
		
						
		if (value.equals("2")) {
			
			s.selectByIndex(Integer.parseInt(value));
			
		}else if (value.equals("Hotel Creek")) {
			
			s.selectByValue(value);
			
		}else if (value.equals("Hotel Creek")) {
			
			s.selectByVisibleText(value);					
		}				
		
	}
public static void dropDown3(WebElement element , String value) {
		
		Select s = new Select(element);
		
						
		if (value.equals("5")) {
			
			s.selectByIndex(Integer.parseInt(value));
			
		}else if (value.equals("VISA")) {
			
			s.selectByValue(value);
			
		}else if (value.equals("May")) {
			
			s.selectByVisibleText(value);					
		}				
		
	}
		
		
		public static void getOptions(WebElement element,String value) {
			
			Select s = new Select(element);
			
			List<WebElement> options = s.getOptions();

			for (WebElement str : options) {
	
				if (value.equals(str.getText())) {
		
					s.deselectByVisibleText(value);
									
				}
	
			}			
			
}
		public static void navigateBack() {
			driver.navigate().back();
		}
		public static void navigateForward() {
			driver.navigate().forward();
		}
		public static void navigateRefresh() {
			driver.navigate().refresh();
		}
		
		public static void simpleAlert() {
			
			Alert alert = driver.switchTo().alert();
			
			alert.accept();

		}

		public static void conformAlert() {
			
			Alert alert = driver.switchTo().alert();
			
			alert.dismiss();

		}

		public static void promptAlert(String value) {
			
			Alert alert = driver.switchTo().alert();
			
			alert.sendKeys(value);
			
			alert.accept();

		}
		
		public static void clickAction(WebElement element) {
			Actions act = new Actions(driver);
			act.click(element).perform();
			
		}
		public static void contextClickAction(WebElement element) {
			Actions act = new Actions(driver);
			act.doubleClick(element).perform();
			
		}
		public static void doubleClick(WebElement element) {
			Actions act = new Actions(driver);
			act.contextClick(element).perform();
			
		}
		public static void moveToClickOption(WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
			
		}
		public static void dragAndDropAction(WebElement source,WebElement target ) {
			Actions act = new Actions(driver);
			act.dragAndDrop(source, target).perform();
			
		}
		public static void robotAction() throws AWTException {
			
			Robot rob =  new Robot();
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);

		}
		
		public static void frame(WebElement element) {
			
			driver.switchTo().frame(element);

		}
		public static void windowsHandling(String value) {
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			for (String str : windowHandles) {
				 
				String title = driver.switchTo().window(str).getTitle();
				
				System.out.println(title);
				
				if (title.equals(value)) {
					
					driver.switchTo().window(title);
					break;
					
				}
			}
			
		}
		
		
		public static void Displayed(WebElement element) {
		
			boolean displayed = element.isDisplayed();
			
			System.out.println(displayed);
		
		}	
		public static void Selected(WebElement element) {
		
			boolean selected = element.isSelected();
			
			System.out.println(selected);
		
	}	

		public static void Enabled(WebElement element) {

			boolean enabled = element.isEnabled();
			
			System.out.println(enabled);

		}	
		
		public static void title() {
			
			String currentUrl = driver.getCurrentUrl();
			
			System.out.println(currentUrl);

		}
		
		public static void pageSource() {
			
			String pageSource = driver.getPageSource();
			
			System.out.println(pageSource);
		}
		
		public static void getText(WebElement element) {
			
			String text = element.getText();
			
			System.out.println(text);			
			
		}
		
		public static void attribute(WebElement element,String value) {
			
			String attribute = element.getAttribute(value);
			
			System.out.println(attribute);
			
		}
		public static void implicitWait() {
			
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		}
		public static void explicitWait() {
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("xpath")));

		}
		public static void fluentWait() {
			
			FluentWait wait = new FluentWait(driver);
			
			wait.withTimeout(4, TimeUnit.SECONDS);
			
			wait.pollingEvery(1, TimeUnit.SECONDS);
			
			wait.ignoring(NoSuchElementException.class);

		}
		public static void screenShot() throws IOException {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("E:\\\\Project\\\\programs done by me\\\\MiniProject\\\\Screenshot\\\\shot6.png");
			
			FileUtils.copyFile(source, destination);

		}
		public static void screenShot1() throws IOException {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("E:\\\\Project\\\\programs done by me\\\\MiniProject\\\\Screenshot\\\\shot7.png");
			
			FileUtils.copyFile(source, destination);

		}
		public static void clickElementJava(WebElement element) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			
			js.executeScript("arguments[0].click();", element ); 

		}	
		public static void scrollElementJava(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].scrollIntoView();", element);

		}
		
		
		public static void scrollelement(WebElement element) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			
			js.executeScript("window.scrollBy(0, 1000);");

		}
		public static void multipleDropDown(WebElement element) {
			
			Select s = new Select(element);
			
			boolean multiple = s.isMultiple();
			
			System.out.println("Is multiple = " + multiple);
			
			s.selectByValue("value 1");
			
			s.selectByValue("value 2");
			
			s.selectByValue("value 3");
			
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			
			System.out.println(firstSelectedOption.getText());

		}
		public static void multipleGetAll(WebElement element) {
			
			Select s = new Select(element);
			
			boolean multiple = s.isMultiple();
			
			System.out.println("Is multiple = " + multiple);
			
			s.selectByValue("value 1");
			
			s.selectByValue("value 2");
			
			s.selectByValue("value 3");
			
			 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			
			 for (WebElement element1 : allSelectedOptions) {
				 
				 System.out.println(element1.getText());
				
			}
		}
		public static void checkBox(String value1,String value2) {
			
			Frame f = new Frame(value1);
			
			Checkbox c = new Checkbox(value2);
			
			c.setBounds(100, 100, 50, 50);
			
			f.add(c);
			
			f.setSize(400, 400);
			
			f.setLayout(null);
			
			f.setVisible(true);				
			

		}
	


}

