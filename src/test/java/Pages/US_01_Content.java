package Pages;

import cucumber.api.DataTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class US_01_Content extends _Parent {
    WebElement myElement;

    public US_01_Content() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenships;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input") // if input,find a input tag
    private WebElement shortNameInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//ms-text-field/input)[1]")
    private WebElement searchNameInput;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    private WebElement searchShortNameInput;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    private WebElement editAfterSearch;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']/button)[1]")
    private WebElement afterSearchDelete;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//div[@role='alertdialog']")
    private WebElement succesAlert;

    @FindBy(xpath = "//div[@role='alertdialog']")
    private WebElement errorAlert;


    public void findElementAndClickFunction(String elementName) {
        switch (elementName) {
            case "addButton":
                myElement = addButton;
                break;

            case "afterSearchDelete":
                myElement = afterSearchDelete;
                break;

            case "editAfterSearch":
                myElement = editAfterSearch;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "citizenships":
                myElement = citizenships;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String webElementName,String value) {
        switch (webElementName) {
            case "nameInput":
                myElement = nameInput;
                break;

            case "shortNameInput":
                myElement = shortNameInput;
                break;

            case "searchNameInput":
                myElement = searchNameInput;
                break;

            case "searchShortNameInput":
                myElement = searchShortNameInput;
                break;
        }
        sendKeysFunction(myElement,value);
    }

    public void waitUntilNeed(String elementName){
        switch (elementName){
            case "afterSearchDelete":
                myElement=afterSearchDelete;
                break;

            case "editAfterSearch":
                myElement=editAfterSearch;
                break;

            case "addButton":
                myElement=addButton;
                break;
        }
        waitUntilVisible(myElement);
    }

    public  void needToScroll(String elementName) {
        switch (elementName) {
            case "searchNameInput":
                myElement=searchNameInput;
                break;
        }
        scrollToElement(myElement);
    }
    public void checkControl(String elementName,String Msg){
        switch (elementName){
            case "succesAlert":
                myElement=succesAlert;
                break;

            case "errorAlert" :
                myElement=errorAlert;
                break;
        }
        wait.until(ExpectedConditions.textToBePresentInElement(myElement,Msg));
        Assert.assertTrue(myElement.getText().toLowerCase().contains(Msg.toLowerCase()));
    }


}