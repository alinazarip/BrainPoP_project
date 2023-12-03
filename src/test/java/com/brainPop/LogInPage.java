package com.brainPop;

import org.openqa.selenium.support.FindBy;

public class LogInPage {

    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@id='m_nli_login_button']")
    public WebElement logInButton;

    @FindBy(id="nli_grownup_button")
    public WebElement grownUpButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@id='password-input']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickLogInButton;

    @FindBy(id="search-input-_rtdiagqoi")
    public WebElement searchButton;

    @FindBy(xpath = "//div[contains(text(),'DNA')]")
    public WebElement dnaTopic;

}
