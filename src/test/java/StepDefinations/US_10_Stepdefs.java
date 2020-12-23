/**
 * @Author:Otosun Tarih :23/12/2020
 */
package StepDefinations;

import Pages.NavbarContent;
import Pages.US_10_Content;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US_10_Stepdefs {
    NavbarContent navbarContent = new NavbarContent();
    US_10_Content us10Content = new US_10_Content();

    @Given("^Navigate to Budgets page$")
    public void navigateToBudgetsPage() {
        navbarContent.findElementAndClickFunction("budget");
        navbarContent.findElementAndClickFunction("budgets");
    }

    @When("^User should be able to view Budgets page$")
    public void userShouldBeAbleToViewBudgetsPage() {
        us10Content.findElementAndVerifyDisplayed("budgetsPage");
        us10Content.findElementAndClickFunction("addButton");
    }

    @Then("^User  should be able to create new Budgets \\(Budget Info\\)$")
    public void userShouldBeAbleToCreateNewBudgetsBudgetInfo(DataTable elements) {
        us10Content.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @And("^Click and Select options$")
    public void clickAndSelectOptions(DataTable elements) {
        us10Content.usingElementsInTheDataTableAndSelectOptions(elements,"option");
    }



    @Then("^Save created budgets$")
    public void saveCreatedBudgets() {
        us10Content.findElementAndClickFunction("saveButton");
    }

    @And("^User should verify that the budget is not saved$")
    public void userShouldVerifyThatTheBudgetIsNotSaved() {

    }
}
