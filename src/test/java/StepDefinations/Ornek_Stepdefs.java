/*
 * @Author:Group_2 Tarih :31/10/2020
 */
package StepDefinations;

import Pages.Ornek_Content;
import Pages.NavbarContent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class Ornek_Stepdefs {

    NavbarContent navbarContent = new NavbarContent();
    Ornek_Content humanResourcesContent = new Ornek_Content();

    @Given("^Navigate to Position Salary page$")
    public void navigateToPositionSalaryPage() {
        navbarContent.findElementAndClickFunction("humanResources");
        navbarContent.findElementAndClickFunction("hR_Setup");
        navbarContent.findElementAndClickFunction("positionSalary");
    }

    @When("^Create a position salary as \"([^\"]*)\"$")
    public void createAPositionSalaryAs(String arg0) {
        humanResourcesContent.findElementAndClickFunction("addButton");
        humanResourcesContent.findElementAndSendKeysFunction("poSaName", arg0);
        humanResourcesContent.findElementAndClickFunction("saveButton");
    }


    @When("^Edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void editTheTo(String arg0, String arg1) {
        humanResourcesContent.findElementAndSendKeysFunction("poSaSearchName", arg0);
        humanResourcesContent.findElementAndClickFunction("searchButton");
        humanResourcesContent.editAndDeleteFunction(arg0, "edit");
        humanResourcesContent.findElementAndSendKeysFunction("poSaName", arg1);
        humanResourcesContent.findElementAndClickFunction("saveButton");
    }

    @When("^Delete the \"([^\"]*)\"$")
    public void deleteThe(String arg0) {
        humanResourcesContent.findElementAndSendKeysFunction("poSaSearchName", arg0);
        humanResourcesContent.findElementAndClickFunction("searchButton");

        humanResourcesContent.editAndDeleteFunction(arg0, "delete");
        humanResourcesContent.findElementAndClickFunction("yesButton");

    }


    @Given("^Navigate to Positions page$")
    public void navigateToPositionsPage() {
        navbarContent.findElementAndClickFunction("humanResources");
        navbarContent.findElementAndClickFunction("hR_Setup");
        navbarContent.findElementAndClickFunction("positions");
    }

    @When("^Create a positions as \"([^\"]*)\" short name \"([^\"]*)\"$")
    public void createAPositionsAs(String arg0, String arg1) {
        humanResourcesContent.findElementAndClickFunction("addButton");
        humanResourcesContent.findElementAndSendKeysFunction("poName", arg0);
        humanResourcesContent.findElementAndSendKeysFunction("shortName", arg1);
        humanResourcesContent.findElementAndClickFunction("saveButton");
    }


    @When("^Edit the \"([^\"]*)\" \"([^\"]*)\" to \"([^\"]*)\" \"([^\"]*)\"$")
    public void editTheTo(String arg0, String arg1, String arg2, String arg3) {
        humanResourcesContent.findElementAndSendKeysFunction("poSaSearchName", arg0);
        humanResourcesContent.findElementAndClickFunction("searchButton");
        humanResourcesContent.editAndDeleteFunction(arg0, "edit");
        humanResourcesContent.findElementAndSendKeysFunction("poName", arg2);
        humanResourcesContent.findElementAndSendKeysFunction("shortName", arg3);
        humanResourcesContent.findElementAndClickFunction("saveButton");
    }

    @Given("^Navigate to salary type page$")
    public void navigateToSalaryTypePage() {
        navbarContent.findElementAndClickFunction("humanResources");
        navbarContent.findElementAndClickFunction("hR_Setup");
        navbarContent.findElementAndClickFunction("hR_SalaryTypes");
    }


    @When("^Create a new salary type name as \"([^\"]*)\"$")
    public void createANewSalaryTypeNameAs(String arg0) {
        humanResourcesContent.findElementAndClickFunction("addButton");
        humanResourcesContent.findElementAndSendKeysFunction("poSaName", arg0);
    }

    @And("^Click and Select options form class$")
    public void clickAndSelectOptionsFormClass(DataTable elements) {
        humanResourcesContent.usingElementsInTheDataTableAndSendKeysSelectOptions(elements, "option");
        humanResourcesContent.findElementAndClickFunction("saveButton");
    }

    @When("^Edit the salary type \"([^\"]*)\" to \"([^\"]*)\"$")
    public void editTheSalaryTypeTo(String arg0, String arg1) {
        humanResourcesContent.findElementAndSendKeysFunction("poSaSearchName", arg0);
        humanResourcesContent.findElementAndClickFunction("saTypeSearch");
        humanResourcesContent.editAndDeleteFunction(arg0, "edit");
        humanResourcesContent.findElementAndSendKeysFunction("poSaName", arg1);
    }

    @And("^Click and edit options form class$")
    public void clickAndEditOptionsFormClass(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);
        for (int i = 0; i < elementsToClick.size(); i++) {
            System.out.println(elementsToClick.get(i));
            humanResourcesContent.findElementAndClickFunction(elementsToClick.get(i));
            humanResourcesContent.findElementAndClickFunction("userTypeCancel");
            i++;
            humanResourcesContent.findElementAndSelectOption("option", elementsToClick.get(i));
        }
        humanResourcesContent.findElementAndClickFunction("saveButton");
    }

    @When("^Delete the salary type \"([^\"]*)\"$")
    public void deleteTheSalaryType(String arg0) {
        humanResourcesContent.findElementAndSendKeysFunction("poSaSearchName", arg0);
        humanResourcesContent.findElementAndClickFunction("saTypeSearch");
        humanResourcesContent.editAndDeleteFunction(arg0, "delete");
        humanResourcesContent.findElementAndClickFunction("yesButton");
    }

    @Given("^Navigate to salary modifiers page$")
    public void navigateToSalaryModifiersPage() {
        navbarContent.findElementAndClickFunction("humanResources");
        navbarContent.findElementAndClickFunction("hR_Setup");
        navbarContent.findElementAndClickFunction("hR_SalaryModifiers");
    }

    @When("^Add new salary modifier and fill out the form$")
    public void addNewSalaryModifierAndFillOutTheForm(DataTable elements) {
        humanResourcesContent.findElementAndClickFunction("addButton");
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @And("^Click and Select options$")
    public void clickAndSelectOptions(DataTable elements) {
        humanResourcesContent.usingElementsInTheDataTableAndSendKeysSelectOptions(elements, "option");
    }

    @When("^Add new modifier variable and fill out the form$")
    public void addNewModifierVariableAndFillOutTheForm(DataTable elements) {
        humanResourcesContent.findElementAndClickFunction("saModVaAdd");
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @And("^Apply changes and save$")
    public void applyChangesAndSave() {
        humanResourcesContent.findElementAndClickFunction("saModVaApply");
        humanResourcesContent.findElementAndClickFunction("saModSave");
    }

    @When("^Delete the Salary Modifiers \"([^\"]*)\"$")
    public void deleteTheSalaryModifiers(String arg0) {
        humanResourcesContent.findElementAndSendKeysFunction("saModSearchDesc", arg0);
        humanResourcesContent.findElementAndClickFunction("saTypeSearch");
        humanResourcesContent.editAndDeleteFunction(arg0, "delete");
        humanResourcesContent.findElementAndClickFunction("yesButton");
    }

    @When("^Edit the Salary Modifier \"([^\"]*)\"$")
    public void editTheSalaryModifier(String arg0) {
        humanResourcesContent.findElementAndSendKeysFunction("saModSearchDesc", arg0);
        humanResourcesContent.findElementAndClickFunction("saTypeSearch");
        humanResourcesContent.editAndDeleteFunction(arg0, "edit");
    }

    @When("^Change the salary modifier information on the form$")
    public void changeTheSalaryModifierInformationOnTheForm(DataTable elements) {
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
        humanResourcesContent.invisibleElementClick("saveButton");
    }

    @Given("^Navigate to Salary Costants page$")
    public void navigateToSalaryCostantsPage() {
        navbarContent.findElementAndClickFunction("humanResources");
        navbarContent.findElementAndClickFunction("hR_Setup");
        navbarContent.findElementAndClickFunction("hR_SalaryConstants");
    }

    @When("^Add new Salary Costant and fill out the form$")
    public void addNewSalaryCostantAndFillOutTheForm(DataTable elements) {
        humanResourcesContent.findElementAndClickFunction("addButton");
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @When("^Click \"([^\"]*)\" and send Date \"([^\"]*)\"$")
    public void clickAndSendDate(String arg0, String arg1) {
        humanResourcesContent.findElementAndClickFunction(arg0);
        humanResourcesContent.findElementAndSendKeysFunction(arg0, arg1);
        humanResourcesContent.findElementAndSelectOption("dayOfMonth", "1");
        humanResourcesContent.findElementAndClickFunction("saveButton");
    }

    @When("^Edit the Salary Constants \"([^\"]*)\"$")
    public void editTheSalaryConstants(String arg0) {
        humanResourcesContent.findElementAndSendKeysFunction("saModSearchDesc", arg0);
        humanResourcesContent.findElementAndClickFunction("saTypeSearch");
        humanResourcesContent.editAndDeleteFunction(arg0, "edit");
    }

    @When("^Edit the Salary Costant and fill out the form$")
    public void editTheSalaryCostantAndFillOutTheForm(DataTable elements) {
        humanResourcesContent.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @When("^Delete the Salary Constants \"([^\"]*)\"$")
    public void deleteTheSalaryConstants(String arg0) {
        humanResourcesContent.findElementAndSendKeysFunction("saModSearchDesc", arg0);
        humanResourcesContent.findElementAndClickFunction("saTypeSearch");
        humanResourcesContent.editAndDeleteFunction(arg0, "delete");
        humanResourcesContent.findElementAndClickFunction("yesButton");
    }

    @And("^Save form$")
    public void saveForm() {
        humanResourcesContent.findElementAndClickFunction("saveButton");
    }
}
