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
public class ModificacindeunatareacasosincorrectosTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void nombreenblanco() {
    // Test name: Nombre en blanco
    // Step # | name | target | value
    // 1 | open | https://dotnetappsqldb-amt871.azurewebsites.net/ | 
    driver.get("https://dotnetappsqldb-amt871.azurewebsites.net/");
    // 2 | setWindowSize | 1042x554 | 
    driver.manage().window().setSize(new Dimension(1042, 554));
    // 3 | click | linkText=Edit | 
    driver.findElement(By.linkText("Edit")).click();
    // 4 | click | css=.form-group:nth-child(4) | 
    driver.findElement(By.cssSelector(".form-group:nth-child(4)")).click();
    // 5 | executeScript | window.document.getElementById('Description').value = ''; |  
    vars.put(" ", js.executeScript("window.document.getElementById(\'Description\').value = \'\';"));
    // 6 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 7 | assert | css=tr:nth-child(2) > td:nth-child(1) | null
    assertEquals(vars.get("css=tr:nth-child(2) > td:nth-child(1)").toString(), "null");
  }
  @Test
  public void errorenlafechapordetrsde1753() {
    // Test name: Error en la fecha por detrás de 1753
    // Step # | name | target | value
    // 1 | open | https://dotnetappsqldb-amt871.azurewebsites.net/ | 
    driver.get("https://dotnetappsqldb-amt871.azurewebsites.net/");
    // 2 | setWindowSize | 1042x554 | 
    driver.manage().window().setSize(new Dimension(1042, 554));
    // 3 | click | linkText=Edit | 
    driver.findElement(By.linkText("Edit")).click();
    // 4 | click | id=CreatedDate | 
    driver.findElement(By.id("CreatedDate")).click();
    // 5 | click | id=CreatedDate | 
    driver.findElement(By.id("CreatedDate")).click();
    // 6 | click | id=CreatedDate | 
    driver.findElement(By.id("CreatedDate")).click();
    // 7 | type | id=CreatedDate | 0001-06-01
    driver.findElement(By.id("CreatedDate")).sendKeys("0001-06-01");
    // 8 | type | id=CreatedDate | 0015-06-01
    driver.findElement(By.id("CreatedDate")).sendKeys("0015-06-01");
    // 9 | type | id=CreatedDate | 0150-06-01
    driver.findElement(By.id("CreatedDate")).sendKeys("0150-06-01");
    // 10 | type | id=CreatedDate | 1500-06-01
    driver.findElement(By.id("CreatedDate")).sendKeys("1500-06-01");
    // 11 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
  }
  @Test
  public void intentodemodificarunatareaeliminadaporotrousuario() {
    // Test name: Intento de modificar una tarea eliminada por otro usuario
    // Step # | name | target | value
    // 1 | open | https://dotnetappsqldb-amt871.azurewebsites.net/ | 
    driver.get("https://dotnetappsqldb-amt871.azurewebsites.net/");
    // 2 | setWindowSize | 1042x554 | 
    driver.manage().window().setSize(new Dimension(1042, 554));
    // 3 | click | css=tr:nth-child(4) a:nth-child(1) | 
    driver.findElement(By.cssSelector("tr:nth-child(4) a:nth-child(1)")).click();
    // 4 | click | css=body | 
    driver.findElement(By.cssSelector("body")).click();
  }
}
