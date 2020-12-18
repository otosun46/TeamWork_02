/*
 * @Author:Group_2 Tarih :03/12/2020
 */
package StepDefinations;

import Pages.NavbarContent;
import Pages.US_06_Content;
import Pages.US_09_Content;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class US_09_Stepdefs {
    NavbarContent navbarContent = new NavbarContent();
    US_09_Content us_09_content = new US_09_Content();
    String temp = "";


    @When("^User should be able to view Budget Projects Page$")
    public void userShouldBeAbleToViewBudgetProjectsPage() {
        navbarContent.findElementAndClickFunction("budget");
        navbarContent.findElementAndClickFunction("budSetup");
        navbarContent.findElementAndClickFunction("budProjects");
        us_09_content.findElementAndVerifyDisplayed("budgetProjectsPage");
        System.out.println("seen succesfully");

    }

    @And("^User should not be able to add without Code$")
    public void userShouldNotBeAbleToCreateNewBudgetProjectWithoutCode(DataTable elements) {
        us_09_content.findElementAndClickFunction("addButton");
        us_09_content.findElementsAndSendKeysFromDataTable(elements);
        us_09_content.findElementsCheckIfDisabled("saveButton");

    }

    @And("^User should not be able to add without a True Code$")
    public void userShouldNotBeAbleToAddWithoutATrueCode(DataTable elements) {
        //us_09_content.findElementAndClickFunction("addButton");
        us_09_content.findElementsAndSendKeysFromDataTable(elements);
        us_09_content.invisibleElementClick("saveButton");
        //div[text()='Budget Account with code "1.1" does not exists']
        us_09_content.findElementAndVerifyContainsText("msjContainer", "Budget Account with code \"1.1\" does not exists");


    }

    @And("^User should be able to create new Budget Project and view successfully validating the message$")
    public void userShouldBeAbleToCreateNewBudgetProjectAndViewSuccessfullyValidatingTheMessage(DataTable elements) {
        //us_09_content.findElementAndClickFunction("addButton");
        us_09_content.beklet(3000);
        us_09_content.findElementsAndSendKeysFromDataTable(elements);
        us_09_content.invisibleElementClick("saveButton");
        us_09_content.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @And("^When searching by  \"([^\"]*)\", the results should be matched the search terms in Budget Projects Page$")
    public void whenSearchingByTheResultsShouldBeMatchedTheSearchTermsInBudgetProjectsPage(String arg0) throws Throwable {
        us_09_content.findElementAndSendKeysFunction("searchName", arg0);
        us_09_content.findElementAndClickFunction("searchButton");
        temp = arg0;
    }

    @And("^User should be able to update an existing Budget Project$")
    public void userShouldBeAbleToUpdateAnExistingBudgetProject(DataTable elements) {
        us_09_content.editAndDeleteFunction(temp, "edit");
        us_09_content.usingElementsInTheDataTableAndSendKeys(elements);
        us_09_content.findElementAndClickFunction("saveButton");
        temp = "";
        us_09_content.findElementAndVerifyContainsText("msjContainer", "successfully");

    }

    @And("^User should be able to delete an existing Budget Project$")
    public void userShouldBeAbleToDeleteAnExistingBudgetProject() {
        us_09_content.editAndDeleteFunction(temp, "delete");
        us_09_content.invisibleElementClick("deleteYesButton");

        temp = "";
        us_09_content.findElementAndVerifyContainsText("msjContainer", "successfully");

    }


}


