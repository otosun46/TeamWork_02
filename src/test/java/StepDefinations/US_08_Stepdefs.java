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
        navbarContent.findElementAndClickFunction("setUp");
        navbarContent.findElementAndClickFunction("itemCategories");

    }

    @When("^Create a Item Categories as \"([^\"]*)\"$")
    public void createAItemCategoriesAs(String arg0)  {
        navbarContent.findElementAndClickFunction("addButton");
        navbarContent.findElementAndSendKeysFunction("nameInput", arg0); //name yerine isim yazdığımızda feature sayfasında istediğimiz isim değişikliğini yapabiliriz 'arg0' sayesinde
        navbarContent.findElementAndClickFunction("saveButton");
    }

    @Then("^Success message should be diplayed$")
    public void successMessageShouldBeDiplayed() {
        us08Content.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @When("^Edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void editTheTo(String arg0, String arg1)  {
        us08Content.editAndDeleteFunction(temp, "edit");
        us08Content.findElementAndSendKeysFunction("nameInput",arg1);
        us08Content.findElementAndClickFunction("saveButton");
        temp = "";
    }

    @When("^Delete the \"([^\"]*)\"$")
    public void deleteThe(String arg0)  {
        us08Content.editAndDeleteFunction(temp, "delete");
        us08Content.findElementAndClickFunction("yesButton");
        temp = "";
    }
}
