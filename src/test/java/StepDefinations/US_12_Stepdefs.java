package StepDefinations;

import Pages.NavbarContent;
import Pages.US_02_Content;
import Pages.US_12_Content;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US_12_Stepdefs {

    NavbarContent navbarContent = new NavbarContent();
    US_12_Content us_12_content = new US_12_Content();


    @When("^User should be able to view Attestations page$")
    public void userShouldBeAbleToViewAttestationsPage() {
        navbarContent.findElementAndClickFunction("humanResources");
        navbarContent.findElementAndClickFunction("hR_Setup");
        us_12_content.findElementAndClickFunction("attestations");
    }

    @Then("^User  should be able to create an Attestation name as \"([^\"]*)\" and view  successfully validating the message$")
    public void userShouldBeAbleToCreateAnAttestationNameAsAndViewSuccessfullyValidatingTheMessage(String arg0)  {

        us_12_content.findElementAndClickFunction("addButton");
        us_12_content.findElementAndSendKeysFunction("nameInput", arg0);
        us_12_content.findElementAndClickFunction("saveButton");

    }
    @Then("^User  should be able to create an Attestation and view  successfully validating the message$")
    public void userShouldBeAbleToCreateAnAttestationAndViewSuccessfullyValidatingTheMessage() {
        us_12_content.findElementAndVerifyContainsText("msjContainer", "successfully");
    }


    @And("^User should  be able to edit Attestation update \"([^\"]*)\" to \"([^\"]*)\" and view  successfully validating the message$")
    public void userShouldBeAbleToEditAttestationUpdateToAndViewSuccessfullyValidatingTheMessage(String arg0, String arg1)  {

        us_12_content.scrollToElement(us_12_content.findWebElement("searchName"));
        us_12_content.findElementAndSendKeysFunction("searchName",arg0);
        us_12_content.findElementAndClickFunction("searchButton");
        us_12_content.editAndDeleteFunction(arg0,"edit");
        us_12_content.findElementAndSendKeysFunction("nameInput",arg1);
        us_12_content.findElementAndClickFunction("saveButton");

    }


    @And("^User should be able to delete \"([^\"]*)\"  Attestation and view  successfully validating the message$")
    public void userShouldBeAbleToDeleteAttestationAndViewSuccessfullyValidatingTheMessage(String arg0) {
        us_12_content.findElementAndSendKeysFunction("searchName",arg0);
        us_12_content.findElementAndClickFunction("searchButton");
        us_12_content.editAndDeleteFunction(arg0,"delete");
        us_12_content.findElementAndClickFunction("yesButton");
    }
}