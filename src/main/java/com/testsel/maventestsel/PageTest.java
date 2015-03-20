/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.testsel.maventestsel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author OlgaVM
 */
public class PageTest {
    private static String URL_MATCH = "login";
 
    private WebDriver wd;
 
    /**
     * Логин
     */
    @FindBy(id = "login_field")
    private WebElement login;
 
    /**
     * Пароль
     */
    @FindBy(id = "password")
    private WebElement password;

    
    @FindBy(id = "commit")
    private WebElement submitLogin;
 
    /**
     * Сообщение об ошибке
     */
//   
      public PageTest(WebDriver wd) {
        // проверить, что вы находитесь на верной странице
        if (!wd.getCurrentUrl().contains(URL_MATCH)) {
                    throw new IllegalStateException(
                        "This is not the page you are expected"
                        );
        }
 
        PageFactory.initElements(wd, this);
        this.wd = wd;
    }
 
    /**
     * Залогиниться
     * @param user - {@link User}
     */
    private void loginUser(User user) {
     System.out.println(wd.getTitle());
     login.sendKeys(user.login);
     password.sendKeys(user.password);
     
        submitLogin.click();
    }
 
    /**
     * Успешная регистрация пользователя
     * @param user - {@link User}
     * @return {@link HomePage}
     */
    public LoginPage loginUserSuccess(User user) {
        loginUser(user);
        return new LoginPage(wd);
    }
 
    /**
     * Неуспешная регистрация
     * @param user - {@link User}
     * @return {@link RegistrationPage}
     */
    public PageTest loginUserError(User user) {
        loginUser(user);
        return new PageTest(wd);
    }
 
    /**
     * Проверить сообщение об ошибке
     * @param user - {@link User}
     * @return {@link RegistrationPage}
     */
//    public RegistrationPage checkErrorMessage(String errorMessage) {
//        Assert.assertTrue("Error message should be present", 
//                        registerError.isDisplayed());
//        Assert.assertTrue("Error message should contains " + errorMessage, 
//                        registerError.getText().contains(errorMessage));
//        return this;
//    }
}
