package StepDefinations;

import Pages.NavbarContent;
import Pages.US_05_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US_05_Stepdefs {
    NavbarContent navbarContent = new NavbarContent();
    US_05_Content us_05_content = new US_05_Content();

    @When("^User should be able to create a Grade Level$")
    public void userShouldBeAbleToCreateAGradeLevel() {
        navbarContent.findElementAndClickFunction("setupOne");
        navbarContent.findElementAndClickFunction("parameters");
        navbarContent.findElementAndClickFunction("gradeLevels");
        us_05_content.findElementAndClickFunction("addButton");
        us_05_content.findElementAndSendKeysFunction("nameInput","niva3");
        us_05_content.findElementAndSendKeysFunction("shortNameInput", "nv3");
        us_05_content.findElementAndSendKeysFunction("orderInput","12");
        us_05_content.findElementAndClickFunction("combo");
        //us_05_content.findElementAndClickFunction("option");
        us_05_content.findElementAndSelectOption("option","Techno1");
        us_05_content.findElementAndClickFunction("saveButton");
    }

    @Then("^User should be able to update an existant Grade Level$")
    public void userShouldBeAbleToUpdateAnExistantGradeLevel() {

    }

    @And("^User should be able to delete an existant Grade Level$")
    public void userShouldBeAbleToDeleteAnExistantGradeLevel() {

    }
}
