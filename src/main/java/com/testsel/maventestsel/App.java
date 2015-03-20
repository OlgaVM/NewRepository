package com.testsel.maventestsel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
     wd.get("https://github.com/login");
     wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     PageTest pt = new PageTest(wd);
     User u = new User("OlgaVM", "OL2979489Ja");
     
     pt.loginUserSuccess(u);
     
//     WebElement login = wd.findElement(By.id("login_field"));
//     WebElement password = wd.findElement(By.id("password"));
//     WebElement submit = wd.findElement(By.name("commit"));  
//       
//   
//     login.sendKeys("OlgaVM");
//     password.sendKeys("OL2979489Ja");
//     submit.click();
//     
//     wd.get("https://github.com/new");
//      wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//     WebElement rname = wd.findElement(By.id("repository_name"));
//     WebElement description = wd.findElement(By.id("repository_description"));
//     
//     rname.sendKeys("NewRepository");
//     description.sendKeys("Hi, GitHub");
//   //  WebElement create = wd.findElement(By.)
//    WebElement create = wd.findElement(By.xpath("//button[@type=\"submit\"]"));
//     create.click();
//     wd.get("https://github.com/" + "OlgaVM" + "/" + "NewRepository" + "/settings");
//    WebElement delete =wd.findElement(By.xpath("//a[@href=\"#delete_repo_confirm\"]"));
//     delete.click();
        
     
         
    }
}
