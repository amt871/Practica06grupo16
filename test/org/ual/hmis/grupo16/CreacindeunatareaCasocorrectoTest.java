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
public class CreacindeunatareaCasocorrectoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
private JavascriptExecutor js;
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
  public void creacindeunatareaCasocorrecto() {
    // Test name: Creación de una tarea (Caso correcto)
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://dotnetappsqldb-amt871.azurewebsites.net//");
    // 2 | setWindowSize | 1936x1056 | 
    driver.manage().window().setSize(new Dimension(1936, 1056));
    // 3 | click | linkText=Create New | 
    driver.findElement(By.linkText("Create New")).click();
    // 4 | click | id=Description | 
    driver.findElement(By.id("Description")).click();
    // 5 | type | id=Description | Correcto
    driver.findElement(By.id("Description")).sendKeys("Correcto");
    // 6 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 7 | click | css=body | 
    driver.findElement(By.cssSelector("body")).click();
    // 8 | executeScript | return window.document.body.innerText.includes('Correcto'); | Prueba
    vars.put("Prueba", js.executeScript("return window.document.body.innerText.includes(\'Correcto\');"));
    // 9 | assert | Prueba | true
    assertEquals(vars.get("Prueba").toString(), "true");
  }
}
