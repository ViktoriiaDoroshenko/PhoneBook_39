package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void registrationPositiveTest(){
        // open login form
        //wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        app.getHelperUser().openLoginRegistrationForm();
        // fill login form
        //int i = (int)(System.currentTimeMillis()/1000)%3600;
        //WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        //emailInput.click();
        //emailInput.clear();
        //emailInput.sendKeys("kira"+i+"@gmail.com");
        //WebElement passInput = wd.findElement(By.xpath("//input[2]"));
        //passInput.click();
        //passInput.clear();
        //passInput.sendKeys("2008Kira!");
        app.getHelperUser().fillLoginRegistrationForm("rena30@gmail.com", "2020rena!");
        // click on button registration
        //wd.findElement(By.xpath("//button[2]")).click();
        app.getHelperUser().submitRegistration();
        // assert
        //pause(3000);
        app.getHelperUser().pause(3000);
        //Assert.assertTrue(wd.findElements(By.tagName("button")).size()>0);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
    }
  @Test
    public void registrationNegativeTestWrongEmail(){
        // open login form
        //wd.findElement(By.xpath("//*[.='LOGIN']")).click();
      app.getHelperUser().openLoginRegistrationForm();
        // fill login form
        //WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        //emailInput.click();
        //emailInput.clear();
        //emailInput.sendKeys("kiragmail.com");
        //WebElement passInput = wd.findElement(By.xpath("//input[2]"));
       // passInput.click();
       //passInput.clear();
       // passInput.sendKeys("2009Kira!");
      app.getHelperUser().fillLoginRegistrationForm("rena30gmail.com", "2020rena!");
        // click on button registration
        //wd.findElement(By.xpath("//button[2]")).click();
      app.getHelperUser().submitRegistration();
        // assert
        //pause(3000);
      app.getHelperUser().pause(3000);
        //Assert.assertTrue(isAlertPresent());
      Assert.assertTrue(app.getHelperUser().isAlertPresent());
    }

}
