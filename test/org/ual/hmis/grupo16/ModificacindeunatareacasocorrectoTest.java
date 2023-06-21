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
public class ModificacindeunatareacasocorrectoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    // Browser selector
    int browser= 0; // 0: firefox, 1: chrome,...
    Boolean headless = false;

    switch (browser) {
    case 0:  // firefox
    	// Firefox
    	// Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
    	// Descomprimir el archivo geckodriver.exe en la carpeta drivers

//    	System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
    	FirefoxOptions firefoxOptions = new FirefoxOptions();
    	if (headless) firefoxOptions.setHeadless(headless);
    	driver = new FirefoxDriver(firefoxOptions);

    	break;
    case 1: // chrome
    	// Chrome
    	// Descargar Chromedriver de https://chromedriver.chromium.org/downloads
    	// Descomprimir el archivo chromedriver.exe en la carpeta drivers

//    	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
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
  public void cambiarnombrecontodotipodecaracteres() {
    // Test name: Cambiar nombre con todo tipo de caracteres
    // Step # | name | target | value
    // 1 | open | https://dotnetappsqldb-amt871.azurewebsites.net/ | 
    driver.get("https://dotnetappsqldb-amt871.azurewebsites.net/");
    // 2 | setWindowSize | 1044x556 | 
    driver.manage().window().setSize(new Dimension(1044, 556));
    // 3 | click | linkText=Edit | 
    driver.findElement(By.linkText("Edit")).click();
    // 4 | click | id=Description | 
    driver.findElement(By.id("Description")).click();
    // 5 | type | id=Description | asf7h'´3p@
    driver.findElement(By.id("Description")).clear();
    driver.findElement(By.id("Description")).sendKeys("asf7h3p@");
    // 6 | assertValue | id=Description | asf7h'´3p@
    {
      String value = driver.findElement(By.id("Description")).getAttribute("value");
      assertThat(value, is("asf7h3p@"));
    }
    // 7 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 8 | assertText | css=tr:nth-child(2) > td:nth-child(1) | asf7h'´3p@
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).getText(), is("asf7h3p@"));
  }
  @Test
  public void cambiarnombresololetras() {
    // Test name: Cambiar nombre solo letras
    // Step # | name | target | value
    // 1 | open | https://dotnetappsqldb-amt871.azurewebsites.net/ | 
    driver.get("https://dotnetappsqldb-amt871.azurewebsites.net/");
    // 2 | setWindowSize | 1042x554 | 
    driver.manage().window().setSize(new Dimension(1042, 554));
    // 3 | click | linkText=Edit | 
    driver.findElement(By.linkText("Edit")).click();
    // 4 | click | css=.form-group:nth-child(4) | 
    driver.findElement(By.cssSelector(".form-group:nth-child(4)")).click();
    // 5 | type | id=Description | Efectivamente
    driver.findElement(By.id("Description")).clear();
    driver.findElement(By.id("Description")).sendKeys("Efectivamente");
    // 6 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 7 | assertText | css=tr:nth-child(2) > td:nth-child(1) | Efectivamente
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).getText(), is("Efectivamente"));
  }
  @Test
  public void cambiarnombreyfecha() {
    // Test name: Cambiar nombre y fecha
    // Step # | name | target | value
    // 1 | open | https://dotnetappsqldb-amt871.azurewebsites.net/ | 
    driver.get("https://dotnetappsqldb-amt871.azurewebsites.net/");
    // 2 | setWindowSize | 1042x554 | 
    driver.manage().window().setSize(new Dimension(1042, 554));
    // 3 | click | linkText=Edit | 
    driver.findElement(By.linkText("Edit")).click();
    // 4 | click | css=body | 
    driver.findElement(By.cssSelector("body")).click();
    // 5 | type | id=Description | Cambio de fecha
    driver.findElement(By.id("Description")).clear();
    driver.findElement(By.id("Description")).sendKeys("Cambio de fecha");
    // 6 | click | id=CreatedDate | 
    driver.findElement(By.id("CreatedDate")).click();
    // 7 | type | id=CreatedDate | 2023-06-03
//    driver.findElement(By.id("CreatedDate")).clear();
//    driver.findElement(By.id("CreatedDate")).sendKeys("03-06-2023");
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("document.getElementById('CreatedDate').value='2023-06-03';");
    // 8 | assertValue | id=CreatedDate | 2023-06-03
    {
      String value = driver.findElement(By.id("CreatedDate")).getAttribute("value");
      assertThat(value, is("2023-06-03"));
    }
    // 9 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 10 | assertText | css=tr:nth-child(2) > td:nth-child(1) | Cambio de fecha
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).getText(), is("Cambio de fecha"));
    // 11 | assertText | css=tr:nth-child(2) > td:nth-child(2) | 2023-06-03
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)")).getText(), is("2023-06-03"));
  }
}
