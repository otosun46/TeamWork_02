/*
 * @Author:Group_2 Tarih :03/12/2020
 */
package StepDefinations;

import Pages.NavbarContent;

import Pages.US_06_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


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

    @When("^User should be able to create a new Document$")
    public void userShouldBeAbleToCreateANewDiscount() {
        navbarContent.findElementAndClickFunction("setupOne");
        navbarContent.findElementAndClickFunction("parameters");
        navbarContent.findElementAndClickFunction("documentTypes");
        us_06_content.findElementAndClickFunction("addButton");
        us_06_content.findElementAndSendKeysFunction("nameInput", "meton");
        us_06_content.findElementAndClickFunction("stageInput");
        us_06_content.clickNThElementFromList("stageCheckBoxes",5);
        us_06_content.invisibleElementClick("saveButton");
    }

    @And("^successMessageShouldBeDisplayedOnDocumentsPage$")
    public void successmessageshouldbedisplayed() {
        us_06_content.findElementAndVerifyContainsText("msjContainer", "successfully");

    }

    @When("^User should be able to update an existing Document$")
    public void userShouldBeAbleToUpdateAnExistantDiscount() {
        us_06_content.editExistingElementFromAList("meton");
        us_06_content.findElementAndSendKeysFunction("nameInput", "yenimi");
        us_06_content.findElementAndClickFunction("saveButton");
    }

    @When("^User should be able to delete an existing Document$")
    public void userShouldBeAbleToDeleteAnExistantDiscount() {
        us_06_content.deleteExistingElement(("yenimi"));
        us_06_content.findElementAndClickFunction("deleteYesButton");
        us_06_content.findElementAndVerifyContainsText("msjContainer", "successfully");


    }


}


