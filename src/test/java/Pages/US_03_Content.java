/*
 * @Author:Group_2 Tarih :03/12/2020
 */
package Pages;

import cucumber.api.DataTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US_03_Content extends _Parent{

    public US_03_Content() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement feeYesButton;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']/button)[1]")
    private WebElement feeDeleteButton;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement feeSearchButton;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input)[1]")
    private WebElement feeSearchName;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE']/input)[1]")
    private WebElement feeSearchCode;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']/button")
    private WebElement feeEditButton;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input)[2]")
    private WebElement feeName;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE']/input)[2]")
    private WebElement feeCodeInput;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.INTEGRATION_CODE']/input")
    private WebElement feeIntegrationCode;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.PRIORITY']/input)[2]")
    private WebElement feePriority;

    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement feeMsgText;



    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement poSaName;

    @FindBy(xpath = "//ms-browse-search//input")
    private WebElement poSaSearchName;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input)[2]")
    private WebElement poName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(css = "input[placeholder='User Type']")
    private WebElement userType;

    @FindBy(css = "button[mat-raised-button]")
    private WebElement saTypeSearch;

    @FindBy(xpath = "//mat-icon[text()='cancel']")
    private WebElement userTypeCancel;

    @FindBy(css = "input[formcontrolname='description']")
    private WebElement saModDescription;

    @FindBy(css = "input[formcontrolname='variable']")
    private WebElement saModVariable;

    @FindBy(css = "mat-select[formcontrolname='modifierType']")
    private WebElement saModifierType;

    @FindBy(css = "input[formcontrolname='integrationCode']")
    private WebElement saModIntegrationCode;

    @FindBy(css = "mat-select[formcontrolname='valueType']")
    private WebElement saModValueType;

    @FindBy(css = "input[formcontrolname='priority']")
    private WebElement saModPriority;

    @FindBy(css = "ms-currency-field[formcontrolname='amount']>input")
    private WebElement saModAmount;

    @FindBy(css = "ms-add-button[tooltip='SALARY_MODIFIER.TITLE.NEW_MODIFIER_VARIABLE']")
    private WebElement saModVaAdd;

    @FindBy(css = "input[formcontrolname='name']")
    private WebElement saModVaName;

    @FindBy(xpath = "(//input[@formcontrolname='variable'])[2]")
    private WebElement saModFormulaVariable;

    @FindBy(css = "mat-select[formcontrolname='type']")
    private WebElement saModVaType;

    @FindBy(css = "ms-button[caption='GENERAL.BUTTON.APPLY']")
    private WebElement saModVaApply;

    @FindBy(css = "ms-save-button")
    private WebElement saModSave;

    @FindBy(css = "input[matinput]")
    private WebElement saModSearchDesc;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(css = "input[formcontrolname='name']")
    private WebElement saCoName;

    @FindBy(css = "input[data-placeholder='Valid From']")
    private WebElement saCoValidFrom;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='key']/input")
    private WebElement saCoKey;

    @FindBy(css = "ms-integer-field[formcontrolname='value']>input")
    private WebElement saCoValue;

    @FindBy(css = "input[name='datePickerControl']")
    private WebElement datepickerButton;

    @FindBy(css = "div[id='cdk-overlay-330']")
    private WebElement newSalaryConstantOverlay;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(css = "mat-select[formcontrolname='type']")
    private WebElement coCeType;

    @FindBy(css = "ms-text-field[formcontrolname='orderNo']>input")
    private WebElement coCeOrderNo;

    @FindBy(css = "mat-chip-list>div>input")
    private WebElement coCeExAcCoPrefixes;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'BUDGET_EXCEL_TEMPLATE.FIELD.ADD')]//button")
    private WebElement excTmpAddButton;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input)[2]")
    private WebElement ExcTmpName;

    @FindBy(css = "ms-integer-field[placeholder='BUDGET_EXCEL_TEMPLATE.FIELD.PERIOD_COUNT']>input")
    private WebElement ExcTmpPeriodCount;

    @FindBy(css = "button[aria-label='Close dialog']")
    private WebElement closeDiolog;

    @FindBy(css = "mat-select[formcontrolname='category']")
    private WebElement accountCategory;

    @FindBy(css = "mat-select[formcontrolname='subCategory']")
    private WebElement accountSubCategory;

    @FindBy(css = "mat-select[formcontrolname='type']")
    private WebElement accountYype;

    @FindBy(css = "mat-select[formcontrolname='balanceType']")
    private WebElement accountBalanceType;

    @FindBy(css = "mat-select[formcontrolname='currency']")
    private WebElement accountCurrency;

    @FindBy(css = "input[formcontrolname='parentAccountCode']")
    private WebElement parentAccountCode;

    @FindBy(css = "input[placeholder='Integration Codes']")
    private WebElement integrationCodes;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'.ADD')]//button")
    private WebElement accountAddButton;

    @FindBy(css = "button[mat-raised-button]")
    private WebElement searchButton;

    /********************** WEBELEMENTLIST *************************/
    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    public List<WebElement> userTypeAllOptions;

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

    @FindAll({
            @FindBy(xpath = "//mat-month-view//tr[@role='row']//td[@role='gridcell']")
    })
    public List<WebElement> dayOfMonth;

    ////////////////////////////////////////////////////////////

    public WebElement findWebElement(String webElementName) {
        switch (webElementName) {
            case "addButton":
                myElement = addButton;
                break;
            case "poSaName":
                myElement = poSaName;
                break;
            case "poSaSearchName":
                myElement = poSaSearchName;
                break;
            case "poName":
                myElement = poName;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "userType":
                myElement = userType;
                break;
            case "saTypeSearch":
                myElement = saTypeSearch;
                break;
            case "userTypeCancel":
                myElement = userTypeCancel;
                break;
            case "saModDescription":
                myElement = saModDescription;
                break;
            case "saModVariable":
                myElement = saModVariable;
                break;
            case "saModifierType":
                myElement = saModifierType;
                break;
            case "saModIntegrationCode":
                myElement = saModIntegrationCode;
                break;
            case "saModValueType":
                myElement = saModValueType;
                break;
            case "saModPriority":
                myElement = saModPriority;
                break;
            case "saModAmount":
                myElement = saModAmount;
                break;
            case "saModVaAdd":
                myElement = saModVaAdd;
                break;
            case "saModVaName":
                myElement = saModVaName;
                break;
            case "saModFormulaVariable":
                myElement = saModFormulaVariable;
                break;
            case "saModVaType":
                myElement = saModVaType;
                break;
            case "saModVaApply":
                myElement = saModVaApply;
                break;
            case "saModSave":
                myElement = saModSave;
                break;
            case "saModSearchDesc":
                myElement = saModSearchDesc;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "yesButton":
                myElement = yesButton;
                break;
            case "saCoName":
                myElement = saCoName;
                break;
            case "saCoValidFrom":
                myElement = saCoValidFrom;
                break;
            case "saCoKey":
                myElement = saCoKey;
                break;
            case "saCoValue":
                myElement = saCoValue;
                break;
            case "datepickerButton":
                myElement = datepickerButton;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "coCeType":
                myElement = coCeType;
                break;
            case "coCeOrderNo":
                myElement = coCeOrderNo;
                break;
            case "coCeExAcCoPrefixes":
                myElement = coCeExAcCoPrefixes;
                break;
            case "ExcTmpName":
                myElement = ExcTmpName;
                break;
            case "ExcTmpPeriodCount":
                myElement = ExcTmpPeriodCount;
                break;
            case "closeDiolog":
                myElement = closeDiolog;
                break;
            case "accountCategory":
                myElement = accountCategory;
                break;
            case "accountSubCategory":
                myElement = accountSubCategory;
                break;
            case "accountYype":
                myElement = accountYype;
                break;
            case "accountBalanceType":
                myElement = accountBalanceType;
                break;
            case "accountCurrency":
                myElement = accountCurrency;
                break;
            case "parentAccountCode":
                myElement = parentAccountCode;
                break;
            case "integrationCodes":
                myElement = integrationCodes;
                break;
            case "accountAddButton":
                myElement = accountAddButton;
                break;
            case "excTmpAddButton":
                myElement = excTmpAddButton;
                break;



            case "feeName":
                myElement = feeName;
                break;

            case "feeCodeInput":
                myElement = feeCodeInput;
                break;

            case "feeIntegrationCode":
                myElement = feeIntegrationCode;
                break;

            case "feePriority":
                myElement = feePriority;
                break;

            case "feeSearchName":
                myElement = feeSearchName;
                break;

            case "feeSearchCode":
                myElement = feeSearchCode;
                break;

            case "feeEditButton":
                myElement = feeEditButton;
                break;

            case "feeSearchButton":
                myElement = feeSearchButton;
                break;

            case "feeDeleteButton":
                myElement = feeDeleteButton;
                break;

            case "feeYesButton":
                myElement = feeYesButton;
                break;

            case "feeMsgText":
                myElement = feeMsgText;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
        }
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

    public void findElementAndClickFunction(String element)  {
        clickFunction(findWebElement(element));
    }


    public void findElementAndSendKeysFunction(String element, String value) {
        sendKeysFunction(findWebElement(element), value);
    }


    public void findElementAndSelectOption(String listName, String secenek)  {
        selectOptionByString(findWebElementList(listName), secenek);
    }


    public void findElementAndVerifyDisplayed(String elementName) {
        verifyMyElementIsDisplayed(findWebElement(elementName));
    }


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

    public void switchToFrame(){
        driver.switchTo().parentFrame();
    }

    public void invisibleElementClick(String element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", findWebElement(element));
    }

    public void usingElementsInTheDataTableAndSendKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }
    public void usingElementsInTheDataTableAndSendKeysSelectOptions(DataTable elements,String listName)  {
        List<String> elementsName = elements.asList(String.class);
        for (int i = 0; i < elementsName.size(); i++) {
            findElementAndClickFunction(elementsName.get(i));
            i++;
            findElementAndSelectOption(listName, elementsName.get(i));
        }
    }
}


