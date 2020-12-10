package StepDefinations;

import Pages.US_01_Content;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class US_1_Stepdefs {
    US_01_Content citizenship = new US_01_Content();


    @Given("^Navigate to Citizenhip Page$")
    public void navigateToCitizenhipPage(DataTable elements) {

        List<String> clickElements = elements.asList(String.class);
        for (int i = 0; i < clickElements.size(); i++) {
            citizenship.findElementAndClickFunction(clickElements.get(i));
        }

    }

    @When("^User should be able to create new Citizenships$")
    public void createNewCitizenship(DataTable elements) {
        citizenship.waitUntilNeed("addButton");
        citizenship.findElementAndClickFunction("addButton");

        List<List<String>> sendKeysElements = elements.asLists(String.class);
        for (int i = 0; i < sendKeysElements.size(); i++) {

            citizenship.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

        }
        citizenship.findElementAndClickFunction("saveButton");

    }


    @And("^Check  control whether succesfully message displayed$")
    public void checkControlWhetherSuccesfullyMessageDisplayed() {
        citizenship.checkControl("succesAlert", "succes");

    }


    @And("^User should be able to update an existant Citizenships$")
    public void UpdateAnExistantCitizenships(DataTable elements) {
        citizenship.needToScroll("searchNameInput");

        List<List<String>> sendKeysElements = elements.asLists(String.class);

        int count = 0;
        for (int i = 0; i < sendKeysElements.size(); i++) {

            citizenship.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

            if (count == 1) {
                citizenship.findElementAndClickFunction("searchButton");
                //citizenship.waiting(500);
                citizenship.waitUntilNeed("editAfterSearch");
                citizenship.findElementAndClickFunction("editAfterSearch");
            }

            if (count == 3) {
                citizenship.findElementAndClickFunction("saveButton");
            }
        }
    }

    @And("^User should be able to delete an existant Citizenships$")
    public void DeleteAnExistantCitizenships(DataTable elements) {

        citizenship.needToScroll("searchNameInput");

        List<List<String>> sendKeysElements = elements.asLists(String.class);

        int count = 0;
        for (int i = 0; i < sendKeysElements.size(); i++) {

            citizenship.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

        }
        citizenship.findElementAndClickFunction("searchButton");
        //citizenship.waiting(500);
        citizenship.waitUntilNeed("afterSearchDelete");
        citizenship.findElementAndClickFunction("afterSearchDelete");
        citizenship.findElementAndClickFunction("yesButton");


    }
}
