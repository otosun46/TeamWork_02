package StepDefinations;

import Pages.NavbarContent;
import Pages.US_03_Content;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.poi.ss.usermodel.DataFormat;

import java.util.List;

public class US_03_Stepdefs {

    NavbarContent navbarContent = new NavbarContent();
    US_03_Content us_03_content = new US_03_Content();

    String feeName="";

    @Given("^Click on the element to navigate to fee page$")
    public void clickOnTheElementToNavigateToFeePage(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {
            navbarContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^User should be able to create a new Fee Type and name as$")
    public void userShouldBeAbleToCreateANewFeeTypeAndNameAs(DataTable elements) {
        us_03_content.findElementAndClickFunction("addButton");
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            elementsNameAndValue.get(i).get(0);
            elementsNameAndValue.get(i).get(1);
            us_03_content.findElementAndClickFunction(elementsNameAndValue.get(i).get(0));
            us_03_content.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
            feeName=elementsNameAndValue.get(i).get(1);
        }
        us_03_content.findElementAndClickFunction("saveButton");
    }

    @And("^User should be able to saved and displayed the successfully message$")
    public void userShouldBeAbleToSavedAndDisplayedTheSuccessfullyMessage() {
        us_03_content.findElementAndVerifyContainsText("feeMsgText", "successfully");

    }


    @When("^When User should be able to search Fee Type and name as$")
    public void whenUserShouldBeAbleToSearchFeeTypeAndNameAs(DataTable elements)  {

        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            elementsNameAndValue.get(i).get(0);
            elementsNameAndValue.get(i).get(1);
            us_03_content.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
        us_03_content.findElementAndClickFunction("feeSearchButton");
    }

    @When("^User should be able to update an existent Fee Type named$")
    public void userShouldBeAbleToUpdateAnExistentFeeTypeNamed(DataTable elements) {
        //us_03_content.findElementAndClickFunction("feeEditButton");
        us_03_content.editAndDeleteFunction("Toll_Fee1","edit");


        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            elementsNameAndValue.get(i).get(0);
            elementsNameAndValue.get(i).get(1);
            us_03_content.findElementAndClickFunction(elementsNameAndValue.get(i).get(0));
            us_03_content.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));

        }
        us_03_content.findElementAndClickFunction("saveButton");
        us_03_content.findElementAndVerifyContainsText("feeMsgText", "successfully");
    }


    @When("^User should be able to delete an existent Fee Type named$")
    public void userShouldBeAbleToDeleteAnExistentFeeTypeNamed (DataTable elements)  {

        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            elementsNameAndValue.get(i).get(0);
            elementsNameAndValue.get(i).get(1);
            us_03_content.findElementAndClickFunction(elementsNameAndValue.get(i).get(0));
            us_03_content.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));

        }
        us_03_content.findElementAndClickFunction("feeDeleteButton");
        us_03_content.findElementAndClickFunction("feeYesButton");
        us_03_content.findElementAndVerifyContainsText("feeMsgText", "successfully");

    }

}








