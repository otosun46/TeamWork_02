/*
 * @Author:Group_2 Tarih :03/12/2020
 */
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class LoginContent extends _Parent {
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindBy(id = "cookieconsent")
    public WebElement cookieConsent;

    @FindBy(xpath = "//h3['Dashboard']")
    private WebElement dashboard;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    public List<WebElement> gotItBtns;

    /**
     * Parametre olarak ismi girilen WebElementi bulur ve dondurur.
     *
     * @param webElementName
     * @return
     */
    public WebElement findWebElement(String webElementName) {
        switch (webElementName) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "gotItBtn":
                myElement = gotItBtn;
                break;
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;

            case "dashboard":
                myElement = dashboard;
                break;
        }
        return myElement;
    }


    /**
     * Bu metod steps classtan calistirilacak parametre olarak string olarak tiklanacak WebElementin ismini alir.
     *
     * @param element
     */
    public void findElementAndClickFunction(String element) {
        clickFunction(findWebElement(element));
    }

    /**
     * Parametre olarak ismi gonderilen WebElementi bulur ve value parametresini secilen WebElemente gonderir.
     *
     * @param element
     * @param value
     */
    public void findElementAndSendKeysFunction(String element, String value) {
        sendKeysFunction(findWebElement(element), value);
    }

    /**
     * Parametre olarak ismi gonderilen WebElementi bulur ve gorundugunu dogrular.
     *
     * @param elementName
     */
    public void findElementAndVerifyDisplayed(String elementName) {
        isMyTextDisplayed(findWebElement(elementName));
    }

    /**
     * Parametre olarak ismi gonderilen WebElementi bulur ve
     * parametre olarak giriilen msg nin WebElementin textinde bulundugunu dogrular.
     *
     * @param elementName
     * @param msg
     */
    public void findElementAndVerifyContainsText(String elementName, String msg) {
        verifyElementContainsText(findWebElement(elementName), msg);
    }
}
