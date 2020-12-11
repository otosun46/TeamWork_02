package Pages;

import cucumber.api.DataTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    private List<WebElement> deleteButtonList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    private List<WebElement> editButtonList;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    private List<WebElement> nameList;


    public WebElement findWebElement(String webElementName) {
        switch (webElementName) {
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
            case "msjContainer":
                myElement = msjContainer;
                break;
        }
        return myElement;
    }
    /**
     * Returns the WebElementList whose name is entered as a parameter.
     *
     * @param webElementListName
     * @return
     */
    public List<WebElement> findWebElementList(String webElementListName) {
        switch (webElementListName) {

            case "deleteButtonList":
                myElementList = deleteButtonList;
                break;
            case "editButtonList":
                myElementList = editButtonList;
                break;
            case "nameList":
                myElementList = nameList;
                break;
        }
        return myElementList;
    }

    public  void needToScroll(String elementName) {
        switch (elementName) {
            case "searchNameInput":
                myElement=searchNameInput;
                break;
        }
        scrollToElement(myElement);
    }

    public void usingElementsInTheDataTableAndSendKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }
    /**
     * Finds the WebElement whose name is sent as parameter and
     * verifies that msg entered as parameter exists in the text of the WebElement.
     *
     * @param elementName
     * @param msg
     */
    public void findElementAndVerifyContainsText(String elementName, String msg) {
        verifyElementContainsText(findWebElement(elementName), msg);
    }

    /**
     * This method takes the name of the WebElement to be executed from the steps class,
     * whose parameter will be clicked as a string.
     *
     * @param element
     */
    public void findElementAndClickFunction(String element) {
        clickFunction(findWebElement(element));
    }

    /**
     * Finds the WebElement named as parameter and sends the value parameter to the selected WebElement.
     *
     * @param element
     * @param value
     */
    public void findElementAndSendKeysFunction(String element, String value) {
        scrollToElement(findWebElement(element));
        sendKeysFunction(findWebElement(element), value);
    }

    public void editAndDeleteFunction(String countryName, String editOrDelete) {
        waitUntilClickable(searchButton);
        beklet(250);
        List<WebElement> btnList;
        if (editOrDelete.equalsIgnoreCase("delete")) {
            btnList = deleteButtonList;
        } else btnList = editButtonList;

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i).getText());
            if (nameList.get(i).getText().equalsIgnoreCase(countryName)) {
                clickFunction(btnList.get(i));
            }
        }
    }
}