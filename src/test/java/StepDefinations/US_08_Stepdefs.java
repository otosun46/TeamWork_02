package StepDefinations;

import Pages.NavbarContent;
import Pages.US_07_Content;
import Pages.US_08_Content;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US_08_Stepdefs {
    NavbarContent navbarContent = new NavbarContent();
    US_08_Content us08Content = new US_08_Content();
    String temp = "";

    @Given("^Navigate to Item Categories page$")
    public void navigateToItemCategoriesPage() {
        navbarContent.findElementAndClickFunction("inventory");
        navbarContent.findElementAndClickFunction("inventSetup");
        navbarContent.findElementAndClickFunction("ItemCategory");

    }

    @When("^Create a Item Categories as \"([^\"]*)\"$")
    public void createAItemCategoriesAs(String arg0)  {
        us08Content.findElementAndClickFunction("addButton");
        us08Content.findElementAndSendKeysFunction("nameInput", arg0); //name yerine isim yazdığımızda feature sayfasında istediğimiz isim değişikliğini yapabiliriz 'arg0' sayesinde
        us08Content.findElementAndClickFunction("userTypeDropdown");
        us08Content.findElementAndSelectOption("userTypeAllOptions","Student");
        us08Content.findElementAndClickFunction("saveButton");
    }

    @Then("^Success message should be diplayed$")
    public void successMessageShouldBeDiplayed() {
        us08Content.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @When("^Edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void editTheTo(String arg0, String arg1)  {
        us08Content.editAndDeleteFunction(arg0, "edit");
        us08Content.findElementAndSendKeysFunction("nameInput",arg1);
        us08Content.findElementAndClickFunction("saveButton");
        temp = "";
    }

    @When("^Delete the \"([^\"]*)\"$")
    public void deleteThe(String arg0)  {
        us08Content.editAndDeleteFunction(arg0, "delete");
        us08Content.findElementAndClickFunction("yesButton");
        temp = "";
    }
}
