package tests;

import manager.NGListener;
import manager.ProviderData;
import models.Contact;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(NGListener.class)
public class LoginTests extends TestBase{

//    WebDriver wd;
//
//    @BeforeMethod
//    public void init(){
//        wd = new ChromeDriver();
//        wd.navigate().to("https://telranedu.web.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }

    @Test(groups = {"positive"})
    public void loginPositiveTest(){


        // open login form
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        app.getHelperUser().openLoginRegistrationForm();
        // fill login form
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("kira20@gmail.com");
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("2008Kira!");
        app.getHelperUser().fillLoginRegistrationForm("kira20@gmail.com", "2008Kira!");
        // click on button login
//        wd.findElement(By.xpath("//button[1]")).click();
        app.getHelperUser().submitLogin();
        // assert
        app.getHelperUser().pause(3000);
//        Assert.assertTrue(wd.findElements(By.tagName("button")).size() > 0);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
    }

    @Test(groups = {"positive"})
    public void loginPositiveTestModel(){

        User user = User.builder()
                .email("kira20@gmail.com")
                .password("2008Kira!")
                .build();
        // open login form
        app.getHelperUser().openLoginRegistrationForm();
        // fill login form
        app.getHelperUser().fillLoginRegistrationForm(user.getEmail(), user.getPassword());
        // click on button login
        app.getHelperUser().submitLogin();
        // assert
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
    }
    @Test(groups = {"positive"}, dataProvider = "userDTO", dataProviderClass = ProviderData.class)
    public void loginPositiveUserDTO(User user){

        // open login form
        app.getHelperUser().openLoginRegistrationForm();
        // fill login form
        app.getHelperUser().fillLoginRegistrationForm(user.getEmail(), user.getPassword());
        // click on button login
        app.getHelperUser().submitLogin();
        // assert
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
        app.getHelperUser().logout();
    }
    @Test(groups = {"negative","smoke"})
    public void loginNegativeTestWrongEmail(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("kira20gmail.com", "2008Kira!");
        app.getHelperUser().submitLogin();
        Assert.assertTrue(app.getHelperUser().isAlertPresent());
    }
    @Test(groups = {"positive"})
    public void loginPositiveTestProperties(){

        // open login form
        app.getHelperUser().openLoginRegistrationForm();
        // fill login form
        app.getHelperUser().fillLoginRegistrationForm(app.getEmail(), app.getPassword());
        // click on button login
        app.getHelperUser().submitLogin();
        // assert
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
    }
//    @Test
//    public void loginNegativeTestWrongEmail(){
//        // open login form
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//        // fill login form
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("kira20@gmail.com");
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("2008Kira!");
//
//        // click on button login
//        wd.findElement(By.xpath("//button[1]")).click();
//        // assert
//        pause(3000);
//        Assert.assertTrue(isAlertPresent());
//    }
//    @Test
//    public void loginNegativeTestWrongPassword(){
//        // open login form
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//        // fill login form
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("kira20@gmail.com");
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("2008Kira!");
//
//        // click on button login
//        wd.findElement(By.xpath("//button[1]")).click();
//        // assert
//        pause(3000);
//
//    }


//
//    public void pause(int millis){
//        try {
//            Thread.sleep(millis);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public boolean isAlertPresent(){
//        Alert alert = new WebDriverWait(wd, 5)
//                .until(ExpectedConditions.alertIsPresent());
//        if(alert == null) return false;
//        wd.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//        return true;
//    }
//

}
