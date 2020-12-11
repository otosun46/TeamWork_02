package Pages;

import cucumber.api.DataTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_08_Content extends _Parent {
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    public WebElement gotItBtn;

    @FindBy(id = "cookieconsent")
    public WebElement cookieConsent;

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c103-22 ng-star-inserted']")
    private WebElement inventory;

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c103-23 ng-star-inserted'] ")
    private WebElement setUp;

    @FindBy(xpath = "(//span[@class='nav-link-title ng-star-inserted'])[54]")
    private WebElement itemCategories;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@id=\"mat-chip-list-input-4\"]")
    private WebElement userType;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-delete-button/button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
    private WebElement userTypeDropdown;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(css = "button[mat-raised-button]")
    private WebElement searchButton;


    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    private List<WebElement> userTypeAllOptions;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    private List<WebElement> deleteButtonList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    private List<WebElement> editButtonList;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    public List<WebElement> gotItBtns;

    @FindAll({
            @FindBy(css = "mat-option[role='option']")
    })
    private List<WebElement> option;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    private List<WebElement> nameList;

    public WebElement findWebElement(String webElementName) {
        switch (webElementName) {

            case "inventory":
                myElement = inventory;
                break;

            case "setUp":
                myElement = setUp;
                break;

            case "itemCategories":
                myElement = itemCategories;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;
            case "yesButton":
                myElement = yesButton;
                break;

            case "UserType":
                myElement = userType;
                break;
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;
            case "nameInput":
                myElement = nameInput;
                break;

            case "userTypeDropdown":
                myElement = userTypeDropdown;
                break;

            case "msjContainer":
                myElement = msjContainer;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

        }
        beklet(250);
        return myElement;
    }
    public List<WebElement> findWebElementList(String webElementListName) {
        switch (webElementListName) {
            case "userTypeAllOptions":
                myElementList = userTypeAllOptions;
                break;
            case "deleteButtonList":
                myElementList = deleteButtonList;
                break;
            case "editButtonList":
                myElementList= editButtonList;
                break;
            case "nameList":
                myElementList = nameList;
                break;
        }
        return myElementList;
    }
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
                break;
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



}