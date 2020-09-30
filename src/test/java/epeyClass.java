import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebEngine;
import jdk.internal.instrumentation.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class epeyClass {

   WebDriver driver;


   private By login = By.id("uye_panel");
   private By username = By.id("uye_posta1");
   private By password = By.id("uye_parola1");
   private By login2 = By.id("adg845");
   private By seach = By.cssSelector("[class='arama genel_arama']");
   private By seach1 = By.cssSelector("[class='ara']");
   private By comparison = By.cssSelector("[class='kiyasla kiyasla407688']");
   private By comparison2 = By.cssSelector("[class='kiyasla kiyasla413329']");
   private By button = By.cssSelector("[class='button']");



   @BeforeSuite
   public void beforeSuite() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\ILBER ORTAYLI\\Desktop\\Optiim\\forestRegisterTest-master\\automation_tutorial\\drivers\\chromedriver.exe");
      this.driver = new ChromeDriver();
      this.driver.manage().window().maximize();
   }


   @Test
   void tittleControl () throws Exception{
      driver.get("https://epey.com");

      login();
      login2();
      goTo();
      comparison();
      goTo2();
      comparison2();
      button();
   }
   public void login() throws  Exception{
     this.driver.findElement(this.login).click();

   }
   public void login2() throws Exception {
      this.driver.findElement(username).sendKeys("cgty.dk@gmail.com");
      this.driver.findElement(password).sendKeys("123456789a");
      this.driver.findElement(login2).click();

      Thread.sleep(3000);

   }
   public void goTo() throws InterruptedException {
      this.driver.findElement(seach).sendKeys("xiaomi mi 10");
      this.driver.findElement(seach1).click();
      Thread.sleep(3000);

   }
   public void comparison() throws InterruptedException {
      this.driver.findElement(comparison).click();
      Thread.sleep(2000);

   }
   public void goTo2()throws InterruptedException {
      this.driver.findElement(seach).sendKeys("Huawei P40 Pro");
      this.driver.findElement(seach1).click();
      Thread.sleep(3000);

   }
   public void comparison2() throws InterruptedException {
      this.driver.findElement(comparison2).click();
      Thread.sleep(3000);
   }
   public void button() throws InterruptedException, InstantiationException {
      this.driver.findElement(button).click();

      Thread.sleep(3000);
      wdown();


   }
   public void wdown() throws  InstantiationException{

      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1150)");
   }

   

}
