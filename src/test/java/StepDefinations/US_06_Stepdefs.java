/*
 * @Author:Group_2 Tarih :03/12/2020
 */
package StepDefinations;

import Pages.NavbarContent;

import Pages.US_06_Content;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;


import Pages.NavbarContent;
import Pages.Ornek_Content;
import Pages.US_06_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_06_Stepdefs {
    NavbarContent navbarContent = new NavbarContent();
    US_06_Content us_06_content = new US_06_Content();
    String temp = "";

    @Given("^Navigate to Document Types Page$")
    public void navigateToDocumentTypesPage() {
        navbarContent.findElementAndClickFunction("setupOne");
        navbarContent.findElementAndClickFunction("parameters");
        navbarContent.findElementAndClickFunction("documentTypes");
    }
    @When("^User should be able to view Document Types Page$")
    public void userShouldBeAbleToViewDocumentTypesPage() {
        us_06_content.findElementAndVerifyDisplayed("documentTypesPage");
        System.out.println("seen succesfully");
    }
    @When("^User should be able to create new Document and view successfully validating the message$")
    public void userShouldBeAbleToCreateANewDocument(DataTable elements) {
        us_06_content.findElementAndClickFunction("addButton");
        us_06_content.clickNThElementFromList("stageCheckBoxes",elements);
        us_06_content.invisibleElementClick("saveButton");
        us_06_content.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @And("^When searching by  \"([^\"]*)\", the results should be matched the search terms$")
    public void whenSearchingByTheResultsShouldBeMatchedTheSearchTerms(String arg0) {
        us_06_content.findElementAndSendKeysFunction("searchName", arg0);
        us_06_content.findElementAndClickFunction("searchButton");

        temp = arg0;
    }

    @When("^User should be able to update an existing Document$")
    public void userShouldBeAbleToUpdateAnExistantDocument(DataTable elements) {
        us_06_content.findWebElementList("nameList");
        us_06_content.editExistingElementFromAList(temp);
        us_06_content.clickNThElementFromList("stageCheckBoxes",elements);
        us_06_content.invisibleElementClick("saveButton");
        us_06_content.findElementAndVerifyContainsText("msjContainer", "successfully");
        temp = "";
    }

    @When("^User should be able to delete an existing Document$")
    public void userShouldBeAbleToDeleteAnExistantDiscount() {
        //us_06_content.deleteExistingElement(("yenimi"));
        us_06_content.editAndDeleteFunction(temp, "delete");
        us_06_content.beklet(1000);
        us_06_content.invisibleElementClick("deleteYesButton");
        temp = "";
        us_06_content.findElementAndVerifyContainsText("msjContainer", "successfully");


    }


}


