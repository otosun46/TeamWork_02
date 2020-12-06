/*
 * @Author:Group_2 Tarih :03/12/2020
 */
package Pages;

import cucumber.api.DataTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class US_07_Content extends _Parent {
    /********************** WEBELEMENT *************************/

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement name;

    @FindBy(css = "mat-select[formcontrolname='type']")
    private WebElement type;

    @FindBy(xpath = "//div/h3[text()='  Notifications ']")
    private WebElement notificationsPage;

    @FindBy(xpath = "(//div[@role='tab'])[1]")
    private WebElement tabSMS;

    @FindBy(xpath = "(//div[@role='tab'])[2]")
    private WebElement tabEmail;

    @FindBy(css = "mat-slide-toggle[formcontrolname='active']")
    private WebElement slideActive;

    @FindBy(xpath = "(//mat-slide-toggle[@formcontrolname])[2]")
    private WebElement slideSendSMSorEmail;

    @FindBy(xpath = "(//ms-integer-field[@formcontrolname])/input")
    private WebElement daysBefore;

    @FindBy(xpath = "(//textarea[@formcontrolname])[1]")
    private WebElement description;

    @FindBy(xpath = "(//textarea[@formcontrolname])[2]")
    private WebElement textSMS;

    @FindBy(xpath = "//iframe")
    private WebElement emailFrame;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-delete-button/button")
    private WebElement deleteButton;

    @FindBy(xpath = "//ms-browse-search//input")
    private WebElement searchName;

    @FindBy(css = "button[mat-raised-button]")
    private WebElement searchButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    /********************** WEBELEMENTLIST *************************/
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

    @FindAll({
            @FindBy(xpath = "//mat-month-view//tr[@role='row']//td[@role='gridcell']")
    })
    private List<WebElement> dayOfMonth;

    /********************** METHODS *************************/
    /**
     * Finds and returns the WebElement whose name is entered as a parameter.
     *
     * @param webElementName
     * @return
     */
    public WebElement findWebElement(String webElementName) {
        switch (webElementName) {
            case "addButton":
                myElement = addButton;
                break;
            case "name":
                myElement = name;
                break;
            case "type":
                myElement = type;
                break;
            case "notificationsPage":
                myElement = notificationsPage;
                break;
            case "tabSMS":
                myElement = tabSMS;
                break;
            case "tabEmail":
                myElement = tabEmail;
                break;
            case "slideActive":
                myElement = slideActive;
                break;
            case "slideSendSMSorEmail":
                myElement = slideSendSMSorEmail;
                break;
            case "daysBefore":
                myElement = daysBefore;
                break;
            case "description":
                myElement = description;
                break;
            case "textSMS":
                myElement = textSMS;
                break;
            case "emailFrame":
                myElement = emailFrame;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "msjContainer":
                myElement = msjContainer;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "searchName":
                myElement = searchName;
                break;
            case "yesButton":
                myElement = yesButton;
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
            case "userTypeAllOptions":
                myElementList = userTypeAllOptions;
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
            case "option":
                myElementList = option;
                break;
            case "dayOfMonth":
                myElementList = dayOfMonth;
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

}
