package Pages;

import cucumber.api.DataTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class US_06_Content extends _Parent {

    public US_06_Content() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'DISCOUNT.TITLE.DESCRIPTION')])[2]//input")
    private WebElement description;
    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD.INTEGRATION_CODE')])//input")
    private WebElement integrationCode;
    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD.PRIORITY')])//input")
    private WebElement Priority;
    @FindBy(xpath = "//ms-dialog-content//div[@class='mat-slide-toggle-thumb']")
    private WebElement activeButton;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;
    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;
    @FindBy(xpath = "//div[@class='ng-star-inserted']/button[1]")
    private WebElement deleteYesButton;
    @FindBy(xpath = "//ms-dialog-content//div[contains(@id,'mat-select-value')]//span")
    private WebElement stageInput;
    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    private WebElement descriptionDoInput;
    @FindBy(xpath = "//div[@class='cdk-overlay-connected-position-bounding-box']")
    private WebElement dialogContainerHeader;
    @FindBy(xpath = "//div/h3[text()='  Document Types ']")
    private WebElement documentTypesPage;
    @FindBy(xpath = "//ms-browse-search//input")
    private WebElement searchName;
    @FindBy(css = "button[mat-raised-button]")
    private WebElement searchButton;


    //contains olabilir


    /********************** WEBELEMENTLIST *************************/
    @FindAll({
            @FindBy(xpath = "//mat-pseudo-checkbox")
    })
    public List<WebElement> stageCheckBoxes;

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
    public List<WebElement> nameList;

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
            case "description":
                myElement = description;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "Priority":
                myElement = Priority;
                break;
            case "activeButton":
                myElement = activeButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "msjContainer":
                myElement = msjContainer;
                break;
            case "yesButton":
                myElement = yesButton;
            case "nameInput":
                myElement = nameInput;
                break;
            case "descriptionDoInput":
                myElement = descriptionDoInput;
                break;

            case "stageInput":
                myElement = stageInput;
                break;
            case "dialogContainerHeader":
                myElement = dialogContainerHeader;
                break;
            case "deleteYesButton":
                myElement = deleteYesButton;
                break;
            case "documentTypesPage":
                myElement = documentTypesPage;
                break;
            case "searchName":
                myElement = searchName;
                break;
            case "searchButton":
                myElement = searchButton;
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
            case "stageCheckBoxes":
                myElementList = stageCheckBoxes;
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

    public void findElementAndClickFunctionWithoutWaiting(String element) {
        findWebElement(element).click();
    }

    /**
     * Finds the WebElement named as parameter and sends the value parameter to the selected WebElement.
     *
     * @param element
     * @param value
     */
    public void findElementAndSendKeysFunction(String element, String value) {
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
        //  selectOptionByString(findWebElementList(listName), secenek);
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

    public void usingElementsInTheDataTableAndSendKeysSelectOptions(DataTable elements, String listName) {
        List<String> elementsName = elements.asList(String.class);
        for (int i = 0; i < elementsName.size(); i++) {
            findElementAndClickFunction(elementsName.get(i));
            i++;
            findElementAndSelectOption(listName, elementsName.get(i));
        }
    }

    public void clickNThElementFromList(String list, DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        //for (int i = 0; i < elementsNameAndValue.size(); i++) {
        findWebElementList(list);

        findElementAndSendKeysFunction(elementsNameAndValue.get(0).get(0), elementsNameAndValue.get(0).get(1));
        // }


        findElementAndClickFunction("stageInput");

        clickFunction(findWebElementList(list).get(Integer.parseInt(elementsNameAndValue.get(1).get(1))));
    }


    //deneme calisti
    public void editExistingElementFromAList(String searchedText) {


        findWebElementList("nameList");
        findWebElementList("editButtonList");

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(searchedText)) {
                editButtonList.get(i).click();
                break;
            }
        }
        Assert.assertFalse(nameList.contains("searchedText"));

    }

    public void deleteExistingElement(String searchedText) {
        findWebElementList("nameList");
        findWebElementList("deleteButtonList");
        for (int i = 0; i < nameList.size(); i++) {


            if (nameList.get(i).getText().equalsIgnoreCase(searchedText)) {
                deleteButtonList.get(i).click();
                break;
            }
        }

    }
}

