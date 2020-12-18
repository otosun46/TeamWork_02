/*
 * @Author:Group_2 Tarih :31/11/2020
 */
package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavbarContent extends _Parent {

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Messaging']")
    private WebElement messaging;

    @FindBy(xpath = "//span[text()='Notifications']")
    private WebElement notifications;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenships;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationality;

    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement inventSetup;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement ItemCategory;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExams;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setup2;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExam2;

    @FindBy(xpath = "//span[text()='Student']")
    private WebElement student;

    @FindBy(xpath = "//span[text()='Students']")
    private WebElement students;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement hR_Setup;

    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private WebElement reports;

    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement repSetup;

    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement excelTemplate;

    @FindBy(xpath = "//span[text()='Salary Types']")
    private WebElement hR_SalaryTypes;

    @FindBy(xpath = "//span[text()='Salary Modifiers']")
    private WebElement hR_SalaryModifiers;

    @FindBy(xpath = "//span[text()='Salary Constants']")
    private WebElement hR_SalaryConstants;

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement budSetup;

    @FindBy(xpath = "//span[text()='Budget Accounts']")
    private WebElement budgetAccounts;

    @FindBy(xpath = "//span[text()='Cost Centers']")
    private WebElement costCenters;

    @FindBy(xpath = "//a[@href='/budget-projects/list']")
    private WebElement budProjects;


    public WebElement findWebElement(String webElementName) {
        switch (webElementName) {
            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;
            case "documentTypes":
                myElement = documentTypes;
                break;

            case "messaging":
                myElement = messaging;
                break;

            case "notifications":
                myElement = notifications;
                break;

            case "country":
                myElement = country;
                break;
            case "citizenships":
                myElement = citizenships;
                break;
            case "nationality":
                myElement = nationality;
                break;
            case "inventory":
                myElement = inventory;
                break;
            case "inventSetup":
                myElement = inventSetup;
                break;
            case "ItemCategory":
                myElement = ItemCategory;
                break;
            case "fees":
                myElement = fees;
                break;
            case "discounts":
                myElement = discounts;
                break;

            case "entranceExams":
                myElement = entranceExams;
                break;
            case "setup2":
                myElement = setup2;
                break;
            case "entranceExam2":
                myElement = entranceExam2;
                break;
            case "student":
                myElement = student;
                break;
            case "students":
                myElement = students;
                break;
            case "humanResources":
                myElement = humanResources;
                break;
            case "hR_Setup":
                myElement = hR_Setup;
                break;
            case "positionSalary":
                myElement = positionSalary;
                break;
            case "positions":
                myElement = positions;
                break;
            case "reports":
                myElement = reports;
                break;
            case "repSetup":
                myElement = repSetup;
                break;
            case "excelTemplate":
                myElement = excelTemplate;
                break;
            case "hR_SalaryTypes":
                myElement = hR_SalaryTypes;
                break;
            case "hR_SalaryModifiers":
                myElement = hR_SalaryModifiers;
                break;
            case "hR_SalaryConstants":
                myElement = hR_SalaryConstants;
                break;
            case "budget":
                myElement = budget;
                break;
            case "budSetup":
                myElement = budSetup;
                break;
            case "budgetAccounts":
                myElement = budgetAccounts;
                break;
            case "costCenters":
                myElement = costCenters;
                break;
            case "budProjects":
                myElement = budProjects;
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


}
