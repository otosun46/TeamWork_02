package StepDefinations;

import Pages.NavbarContent;
import Pages.Ornek_Content;
import Pages.US_04_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class US_04_Stepdefs {

    NavbarContent navbarContent = new NavbarContent();
    US_04_Content us_04_content = new US_04_Content();

    @When("^User should be able to create a new Discount$")
    public void userShouldBeAbleToCreateANewDiscount() {
        navbarContent.findElementAndClickFunction("setupOne");
        navbarContent.findElementAndClickFunction("parameters");
        navbarContent.findElementAndClickFunction("discounts");
        us_04_content.findElementAndClickFunction("addButton");
        us_04_content.findElementAndSendKeysFunction("description", "dame");
        us_04_content.findElementAndSendKeysFunction("integrationCode", "350");
        us_04_content.findElementAndSendKeysFunction("Priority", "1");
        //us_04_content.findElementAndClickFunction("activeButton");
        us_04_content.findElementAndClickFunction("saveButton");


    }

    @And("^successMessageShouldBeDisplayed$")
    public void successmessageshouldbedisplayed() {
        us_04_content.findElementAndVerifyContainsText("msjContainer", "successfully");

    }
    @When("^User should be able to update an existant Discount$")
    public void userShouldBeAbleToUpdateAnExistantDiscount() {
    }

    @When("^User should be able to delete an existant Discount$")
    public void userShouldBeAbleToDeleteAnExistantDiscount() {
    }

}
