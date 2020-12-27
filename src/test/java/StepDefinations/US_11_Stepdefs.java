package StepDefinations;


import Pages.NavbarContent;
import Pages.US_11_Content;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class US_11_Stepdefs {

    NavbarContent navbarContent = new NavbarContent();
    US_11_Content us_11_content = new US_11_Content();



    @And("^Userrr sending the keys$")
    public void userrrSendingTheKeys(DataTable elements) {

        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            us_11_content.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^Userrr should see \"([^\"]*)\" message$")
    public void userrrShouldSeeMessage(String message) {
        us_11_content.findElementAndVerifyContainsText("success/error", message);
    }


    @Then("^Userrr \"([^\"]*)\" \"([^\"]*)\"$")
    public void userrr(String editorDelete, String value) {
        us_11_content.editAndDeleteFunction(editorDelete, value);
    }


    @Then("^user should confirm \"([^\"]*)\" text$")
    public void userShouldConfirmText(String text) {
        us_11_content.findElementAndVerifyContainsText("notationKeysconfirm", text);
    }

    @Then("^\"([^\"]*)\" should be visible$")
    public void shouldBeVisible(String text) {
        us_11_content.findElementAndCheckIfEqual(text);
    }

    @When("^User clicks on the elements in Page$")
    public void userClicksOnTheElementsInPage(DataTable elements) {
        List<String> elementList = elements.asList(String.class);

        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i));
            us_11_content.findElementAndClickFunction(elementList.get(i));
        }
    }

}
