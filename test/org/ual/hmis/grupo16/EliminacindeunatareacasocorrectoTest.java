package org.ual.hmis.grupo16;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
public class EliminacindeunatareacasocorrectoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    // Browser selector
    int browser= 0; // 0: firefox, 1: chrome,...
    Boolean headless = true;

    switch (browser) {
    case 0:  // firefox
    	// Firefox
    	// Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
    	// Descomprimir el archivo geckodriver.exe en la carpeta drivers

    	System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
    	FirefoxOptions firefoxOptions = new FirefoxOptions();
    	if (headless) firefoxOptions.setHeadless(headless);
    	driver = new FirefoxDriver(firefoxOptions);

    	break;
    case 1: // chrome
    	// Chrome
    	// Descargar Chromedriver de https://chromedriver.chromium.org/downloads
    	// Descomprimir el archivo chromedriver.exe en la carpeta drivers

    	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	if (headless) chromeOptions.setHeadless(headless);
    	chromeOptions.addArguments("window-size=1920,1080");
    	driver = new ChromeDriver(chromeOptions);

    	break;

    default:
    	fail("Please select a browser");
    	break;
    }
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cancelareliminacin() {
    // Test name: Cancelar eliminación
    // Step # | name | target | value
    // 1 | open | https://dotnetappsqldb-amt871.azurewebsites.net/ | 
    driver.get("https://dotnetappsqldb-amt871.azurewebsites.net/");
    // 2 | setWindowSize | 1044x555 | 
    driver.manage().window().setSize(new Dimension(1044, 555));
    // 3 | click | css=tr:nth-child(3) a:nth-child(3) | 
    driver.findElement(By.cssSelector("tr:nth-child(3) a:nth-child(3)")).click();
    // 4 | click | linkText=Back to List | 
    driver.findElement(By.linkText("Back to List")).click();
  }
  @Test
  public void eliminacindeunatarea() {
    // Test name: Eliminación de una tarea
    // Step # | name | target | value
    // 1 | open | https://dotnetappsqldb-amt871.azurewebsites.net/ | 
    driver.get("https://dotnetappsqldb-amt871.azurewebsites.net/");
    // 2 | setWindowSize | 1042x554 | 
    driver.manage().window().setSize(new Dimension(1042, 554));
    // 3 | click | css=tr:nth-child(3) a:nth-child(3) | 
    driver.findElement(By.cssSelector("tr:nth-child(3) a:nth-child(3)")).click();
    // 4 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 5 | click | css=.body-content | 
    driver.findElement(By.cssSelector(".body-content")).click();
  }
}
