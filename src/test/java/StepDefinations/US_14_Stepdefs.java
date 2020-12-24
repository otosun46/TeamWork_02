package StepDefinations;

import Pages.NavbarContent;
import Pages.US_08_Content;
import Pages.US_14_Content;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US_14_Stepdefs {

    NavbarContent navbarContent = new NavbarContent();
    US_14_Content us14Content = new US_14_Content();
    String temp = "";

    //human setup dismis

    @When("^Create a Dismissial Articles as \"([^\"]*)\"$")
    public void createADismissialArticlesAs(String arg0) {

//      navbarContent.findElementAndClickFunction("humanResources");
//      navbarContent.findElementAndClickFunction("hR_Setup"); //ana sayfada herkesi ilgilendirenler burda
//      us14Content.findElementAndClickFunction("dismissal");
        us14Content.findElementAndClickFunction("addButton");
        us14Content.findElementAndSendKeysFunction("nameInput", arg0);
        us14Content.findElementAndSendKeysFunction("nameDescription", "bir");
        us14Content.findElementAndClickFunction("saveButton");
           // us14Content.beklet(750);
    }

    @Given("^Navigate to Dismissial Articles page$")
    public void navigateToDismissialArticlesPage() {
        navbarContent.findElementAndClickFunction("humanResources");
        navbarContent.findElementAndClickFunction("hR_Setup"); //ana sayfada herkesi ilgilendirenler burda
        us14Content.findElementAndClickFunction("dismissal");
    }

    @When("^Edit the \"([^\"]*)\" to \"([^\"]*)\"\\.$")
    public void editTheTo(String arg0, String arg1) {

        us14Content.scrollToElement(us14Content.findWebElement("searchName"));
        us14Content.findElementAndSendKeysFunction("searchName", arg0);
        us14Content.findElementAndClickFunction("searchButton");
        //temp = arg0;
       // us14Content.findElementAndClickFunction("EditButton");
        us14Content.editAndDeleteFunction(arg0,"edit");
        us14Content.findElementAndSendKeysFunction("nameInput", arg1);
        us14Content.findElementAndClickFunction("saveButton");

    }

    @When("^Delete the \"([^\"]*)\"\\.$")
    public void deleteThe(String arg0) {
        us14Content.findElementAndSendKeysFunction("searchName", arg0);
        us14Content.findElementAndClickFunction("searchButton");
        us14Content.editAndDeleteFunction(arg0, "delete");
        us14Content.findElementAndClickFunction("yesButton");

    }

    @Then("^Success message should be diplayed\\.$")
    public void successMessageShouldBeDiplayed() {
        us14Content.findElementAndVerifyContainsText("feeMsgText", "successfully");
    }
}
