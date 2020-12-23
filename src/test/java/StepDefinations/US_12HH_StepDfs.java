package StepDefinations;

import Pages.NavbarContent;
import Pages.US_12HH_Content;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US_12HH_StepDfs {
    NavbarContent navbarContent=new NavbarContent();
    US_12HH_Content us_12HH_content=new US_12HH_Content();


    @When("^User should be able to view Attestations page_HH$")
    public void userShouldBeAbleToViewAttestationsPage() {

        navbarContent.findElementAndClickFunction("humanResources");
        navbarContent.findElementAndClickFunction("hR_Setup");
        us_12HH_content.scrollToElement(us_12HH_content.findWebElement("attestations"));
        us_12HH_content.findElementAndClickFunction("attestations");

    }

    @Then("^User  should be able to create an Attestation \"([^\"]*)\" and view  successfully validating the message_HH$")
    public void userShouldBeAbleToCreateAnAttestationAndViewSuccessfullyValidatingTheMessage(String arg0) {
        us_12HH_content.findElementAndClickFunction("addButton");
        us_12HH_content.findElementAndSendKeysFunction("nameInput",arg0);
        us_12HH_content.findElementAndClickFunction("saveButton");
        //us_12HH_content.findElementAndVerifyContainsText("msjContainer","successfully");

    }

    @Then("^User should  be able to edit \"([^\"]*)\" Attestation and view  successfully validating the message$")
    public void userShouldBeAbleToEditAttestationAndViewSuccessfullyValidatingTheMessage(String arg0,String arg1)  {


    }

    @And("^User should be able to delete \"([^\"]*)\"  Attestation and view  successfully validating the message_HH$")
    public void userShouldBeAbleToDeleteAttestationAndViewSuccessfullyValidatingTheMessage(String arg0)  {

        us_12HH_content.scrollToElement(us_12HH_content.findWebElement("searchName"));
        us_12HH_content.findElementAndSendKeysFunction("searchName",arg0);
        us_12HH_content.findElementAndClickFunction("searchButton");
        us_12HH_content.editAndDeleteFunction(arg0,"delete");
        us_12HH_content.findElementAndClickFunction("yesButton");

    }

    @And("^searching by  name , the results should be matched the search terms\\.$")
    public void searchingByNameTheResultsShouldBeMatchedTheSearchTerms() {
    }

    @Then("^User should  be able to edit from \"([^\"]*)\" to \"([^\"]*)\" Attestation and view  successfully validating the message_HH$")
    public void userShouldBeAbleToEditFromToAttestationAndViewSuccessfullyValidatingTheMessage(String arg0, String arg1) {
        us_12HH_content.scrollToElement(us_12HH_content.findWebElement("searchName"));
        us_12HH_content.findElementAndSendKeysFunction("searchName",arg0);
        us_12HH_content.beklet(250);
        us_12HH_content.findElementAndClickFunction("searchButton");
        us_12HH_content.editAndDeleteFunction(arg0,"edit");
        us_12HH_content.findElementAndSendKeysFunction("nameInput",arg1);
        us_12HH_content.findElementAndClickFunction("saveButton");


    }
}
