package StepDefinations;

import Pages.US_01_Content;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class US_1_Stepdefs {
    US_01_Content us_01_content = new US_01_Content();
    String temp = "";

    @Given("^Navigate to Citizenhip Page$")
    public void navigateToCitizenhipPage(DataTable elements) {
        List<String> clickElements = elements.asList(String.class);
        for (int i = 0; i < clickElements.size(); i++) {
            us_01_content.findElementAndClickFunction(clickElements.get(i));
        }
    }

    @When("^User should be able to create new Citizenships$")
    public void createNewCitizenship(DataTable elements) {
        us_01_content.findElementAndClickFunction("addButton");
        us_01_content.usingElementsInTheDataTableAndSendKeys(elements);
        us_01_content.findElementAndClickFunction("saveButton");

    }


    @And("^Check  control whether succesfully message displayed$")
    public void checkControlWhetherSuccesfullyMessageDisplayed() {
        us_01_content.findElementAndVerifyContainsText("msjContainer", "successfully");

    }


    @And("^User should be able to update an existant Citizenships$")
    public void UpdateAnExistantCitizenships(DataTable elements) {
        us_01_content.needToScroll("searchNameInput");
        us_01_content.editAndDeleteFunction(temp, "edit");
        us_01_content.usingElementsInTheDataTableAndSendKeys(elements);
        us_01_content.findElementAndClickFunction("saveButton");

    }

    @And("^User should be able to delete an existant Citizenships$")
    public void DeleteAnExistantCitizenships(DataTable elements) {
        userShouldBeAbleToSearchingCitizenships(elements);
        us_01_content.editAndDeleteFunction(temp, "delete");
        us_01_content.findElementAndClickFunction("yesButton");


    }

    @And("^User should be able to searching Citizenships$")
    public void userShouldBeAbleToSearchingCitizenships(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            us_01_content.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
        temp = elementsNameAndValue.get(0).get(1);
        //System.out.println("temp=" + temp);
        us_01_content.findElementAndClickFunction("searchButton");
    }
}
