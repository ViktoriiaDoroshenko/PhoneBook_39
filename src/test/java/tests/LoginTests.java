package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
/*    @Test
    public void loginPositiveTest(){

        // open login form
       // wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        app.getHelperUser().openLoginRegistrationForm();
        // fill login form
        // WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        //emailInput.click();
        //emailInput.clear();
        //emailInput.sendKeys("kira20@gmail.com");
       // WebElement passInput = wd.findElement(By.xpath("//input[2]"));
       // passInput.click();
       // passInput.clear();
       //passInput.sendKeys("2008Kira!");
        app.getHelperUser().fillLoginRegistrationForm("kira20@gmail.com", "2008Kira!");
        // click on button login
       //wd.findElement(By.xpath("//button[1]")).click();
        app.getHelperUser().submitLogin();
       // assert
        app.getHelperUser().pause(3000);
        //Assert.assertTrue(wd.findElements(By.tagName("button")).size()>0);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
    }
  @Test
    public void loginNegativeTestWrongEmail(){
        // open login form
        //wd.findElement(By.xpath("//*[.='LOGIN']")).click();
      app.getHelperUser().openLoginRegistrationForm();
        // fill login form
        //*WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        //emailInput.click();
        //emailInput.clear();
        //emailInput.sendKeys("kira20gmail.com");
       // WebElement passInput = wd.findElement(By.xpath("//input[2]"));
       // passInput.click();
        //passInput.clear();
       // passInput.sendKeys("2008Kira!");
      app.getHelperUser().fillLoginRegistrationForm("kira20gmail.com", "2008Kira!");
        // click on button login
        //wd.findElement(By.xpath("//button[1]")).click();
      app.getHelperUser().submitLogin();
        // assert
        //pause(3000);
      app.getHelperUser().pause(3000);
      Assert.assertTrue(app.getHelperUser().isAlertPresent());

    }
    @Test
    public void loginNegativeTestWrongPassword(){
        // open login form
        //wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        app.getHelperUser().openLoginRegistrationForm();
        // fill login form
        //WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        //emailInput.click();
        //emailInput.clear();
        //emailInput.sendKeys("kira20@gmail.com");
        //WebElement passInput = wd.findElement(By.xpath("//input[2]"));
        //passInput.click();
        //passInput.clear();
        //passInput.sendKeys("2008Kira");
        app.getHelperUser().fillLoginRegistrationForm("kira20@gmail.com", "2008Kira");
        // click on button login
        //wd.findElement(By.xpath("//button[1]")).click();
        app.getHelperUser().submitLogin();
        // assert
        //pause(3000);
        //Assert.assertTrue(isAlertPresent());
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isAlertPresent());

    }*/
}
