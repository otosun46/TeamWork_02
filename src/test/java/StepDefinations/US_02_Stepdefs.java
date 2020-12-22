package StepDefinations;

import Pages.NavbarContent;
import Pages.US_02_Content;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class US_02_Stepdefs {

    NavbarContent navbarContent=new NavbarContent();
    US_02_Content us_02_content= new US_02_Content();


    @When("^User should be able to create new Nationalites \"([^\"]*)\"$")
    public void userShouldBeAbleToCreateNewNationalites(String arg0){
        navbarContent.findElementAndClickFunction("setupOne");
        navbarContent.findElementAndClickFunction("parameters");
        navbarContent.findElementAndClickFunction("nationality");
        us_02_content.findElementAndClickFunction("addButton");
        us_02_content.findElementAndSendKeysFunction("nameInput",arg0);
        us_02_content.findElementAndClickFunction("saveButton");

    }
    @When("^Success message sould be displayed$")
    public void successMessageSouldBeDisplayed() {
        us_02_content.findElementAndVerifyContainsText("msjContainer","successfully");
    }


    @When("^User should be able from \"([^\"]*)\" to \"([^\"]*)\" update an existant Nationality$")
    public void userShouldBeAbleFromToUpdateAnExistantNationality(String arg0, String arg1){
        us_02_content.scrollToElement(us_02_content.findWebElement("searchName"));
        us_02_content.findElementAndSendKeysFunction("searchName",arg0);
        us_02_content.findElementAndClickFunction("searchButton");
        us_02_content.editAndDeleteFunction(arg0,"edit");
        us_02_content.findElementAndSendKeysFunction("nameInput",arg1);
        us_02_content.findElementAndClickFunction("saveButton");

    }

    @When("^User should be able to delete an existant Nationality$")
    public void userShouldBeAbleToDeleteAnExistantNationality() {

    }

    @And("^User should not be able to create a Nationality that is exists with similar name$")
    public void userShouldNotBeAbleToCreateANationalityThatIsExistsWithSimilarName() {
        us_02_content.findElementAndClickFunction("addButton");
        us_02_content.findElementAndSendKeysFunction("nameInput","Neda");
        us_02_content.findElementAndClickFunction("saveButton");
        us_02_content.findElementAndVerifyContainsText("msjContainer","Error");
        us_02_content.findElementAndClickFunction("closeDialog");
    }


    @When("^User should be able to delete an existant Nationality \"([^\"]*)\"$")
    public void userShouldBeAbleToDeleteAnExistantNationality(String arg0)  {
        us_02_content.findElementAndSendKeysFunction("searchName",arg0);
        us_02_content.findElementAndClickFunction("searchButton");
        us_02_content.editAndDeleteFunction(arg0,"delete");
        us_02_content.findElementAndClickFunction("yesButton");

    }
}
