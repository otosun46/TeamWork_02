package Pages;

import cucumber.api.DataTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class US_11_Content extends _Parent {

    /********************** WEBELEMENT *************************/

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup2;
    @FindBy(xpath = "//span[text()='Notation Keys']")
    private WebElement notationKeys;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'.ADD')]//button")
    private WebElement addButton;
    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement namebox;
    @FindBy(xpath = "//input[@name='shortName']")
    private WebElement shortnamebox;
    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement formnamebox;
    @FindBy(xpath = "//input[@name='multiplier']")
    private WebElement multiplerbox;
    @FindBy(xpath = "//ms-button/button/span[1]/span")
    private WebElement applyButton;

    @FindBy(xpath = "//input[@id='mat-input-4']")
    private WebElement nameSearch;


    @FindBy(xpath = "//h3[text()='  Timesheet Notation Keys ']")
    private WebElement notationKeysconfirm;


    @FindBy(xpath = "//ms-browse-search/div/div/button")
    private WebElement searchButton;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "(//button[@class='mat-focus-indicator mat-tooltip-trigger mat-button mat-icon-button mat-button-base'])[2]")
    private WebElement closeButton;

    @FindBy(css = "div#toast-container")
    private WebElement message;

    /********************** WEBELEMENTLIST *************************/

    @FindAll({@FindBy(css = "div#toast-container")})
    private List<WebElement> messageList;
    @FindAll({@FindBy(css = "ms-delete-button.ng-star-inserted")})
    private List<WebElement> deleteButtonList;
    @FindAll({@FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")})
    private List<WebElement> editButtonList;
    @FindAll({@FindBy(css = "tbody>tr>td:nth-child(2)")})
    private List<WebElement> nameList;


    @FindBy(css = "button[type='submit']")
    private WebElement yesButton;

    /********************** METHODS *************************/

    public WebElement findWebElement(String webElementName) {
        switch (webElementName) {
            case "humanResources":
                myElement = humanResources;
                break;
            case "setup2":
                myElement = setup2;
                break;
            case "notationKeys":
                myElement = notationKeys;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "namebox":
                myElement = namebox;
                break;
            case "shortnamebox":
                myElement = shortnamebox;
                break;
            case "formnamebox":
                myElement = formnamebox;
                break;
            case "multiplerbox":
                myElement = multiplerbox;
                break;
            case "applyButton":
                myElement = applyButton;
                break;
            case "nameSearch":
                myElement = nameSearch;
                break;
            case "notationKeysconfirm":
                myElement = notationKeysconfirm;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "closeButton":
                myElement = closeButton;
                break;
            case "message":
                myElement = message;
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
            case "messageList":
                myElementList = messageList;
                break;
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

    /**
     * This method is called from the steps class.
     * It takes the name of the WebElementList with options as parameters and the selection criteria as a string.
     * If the selection parameter is a number, it is evaluated as an index and the WebElement with that index is selected.
     * If the parameter is not a number, it is compared with the text of the WebElement and the enclosing WebElement is selected.
     *
     * @param listName
     * @param secenek
     */
    public void findElementAndSelectOption(String listName, String secenek) {
        selectOptionByString(findWebElementList(listName), secenek);
    }

    /**
     * Finds the WebElement named as parameter and verifies that it appears.
     *
     * @param elementName
     */
    public void findElementAndVerifyDisplayed(String elementName) {
        verifyMyElementIsDisplayed(findWebElement(elementName));
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

    public void editAndDeleteFunction(String countryName, String editOrDelete) {
        waitUntilClickable(searchButton);
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

    public void switchToFrame() {
        driver.switchTo().parentFrame();
    }
    //metin
    public void switchToFrame(String frame) {
        driver.switchTo().frame(findWebElement(frame));
    }


    public void invisibleElementClick(String element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", findWebElement(element));
    }

    public void usingElementsInTheDataTableAndSendKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    public void usingElementsInTheDataTableAndSelectOptions(DataTable elements, String listName) {
        List<String> elementsName = elements.asList(String.class);
        for (int i = 0; i < elementsName.size(); i++) {
            findElementAndClickFunction(elementsName.get(i));
            i++;
            beklet(250);
            findElementAndSelectOption(listName, elementsName.get(i));
        }
    }
    public void writeInPElements( ){
        scrollToElement(findWebElement("emailBody"));

        System.out.println("meto");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].textContent = arguments[1];", findWebElement("emailBody"), "This is a test");
    }

    public void writeInPElements(DataTable elements){
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            scrollToElement(findWebElement(elementsNameAndValue.get(i).get(0)));
            executor.executeScript("arguments[0].textContent = arguments[1];", findWebElement(elementsNameAndValue.get(i).get(0)), elementsNameAndValue.get(i).get(1));
        }}

    public void isMyElementDisable(WebElement element){
        Assert.assertFalse(element.isEnabled());
    }

    public void findElementAndVerifyDisabled(String elementName) {
        isMyElementDisable(findWebElement(elementName));
    }
    public void findElementAndCheckIfEqual(String text) {
        Assert.assertEquals(nameList.get(0).getText(), text);
    }
}
