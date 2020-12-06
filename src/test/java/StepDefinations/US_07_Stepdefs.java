/**
 * @Author:Otosun Tarih :04/12/2020
 */
package StepDefinations;

import Pages.NavbarContent;
import Pages.US_07_Content;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US_07_Stepdefs {
    NavbarContent navbarContent = new NavbarContent();
    US_07_Content us07Content = new US_07_Content();
    String temp = "";

    @Given("^Navigate to Notifications page$")
    public void navigateToNotificationsPage() {
        navbarContent.findElementAndClickFunction("messaging");
        navbarContent.findElementAndClickFunction("notifications");
    }

    @When("^User should be able to view Notifications Page$")
    public void userShouldBeAbleToViewNotificationsPage() {
        us07Content.findElementAndVerifyDisplayed("notificationsPage");
        System.out.println("sayfaya girildigi dogrulandi");
    }

    @Then("^User  should be able to create new Notification in \"([^\"]*)\" type$")
    public void userShouldBeAbleToCreateNewNotificationInType(String arg0, DataTable elements) {
        us07Content.findElementAndClickFunction("addButton");
        us07Content.findElementAndClickFunction("type");
        us07Content.findElementAndSelectOption("option", arg0);
        us07Content.usingElementsInTheDataTableAndSendKeys(elements);
    }

    @And("^Notification should be activated and able to select SMS$")
    public void notificationShouldBeActivatedAndAbleToSelectSMS() {
        //us07Content.findElementAndClickFunction("slideActive");
        us07Content.findElementAndClickFunction("tabSMS");
        us07Content.findElementAndClickFunction("slideSendSMSorEmail");
    }

    @And("^Notification should be activated and able to select mail$")
    public void notificationShouldBeActivatedAndAbleToSelectEmail() {
        //us07Content.findElementAndClickFunction("slideActive");
        us07Content.findElementAndClickFunction("tabEmail");
        us07Content.beklet(1000);
        us07Content.findElementAndClickFunction("slideSendSMSorEmail");

       // us07Content.switchToFrame();

      //  us07Content.findElementAndClickFunction("emailFrame");

        us07Content.beklet(500);
    }

    @Then("^Notification fields should be filled in and saved$")
    public void notificationFieldsShouldBeFilledInAndSaved(DataTable elements) {
        us07Content.usingElementsInTheDataTableAndSendKeys(elements);
        us07Content.findElementAndClickFunction("saveButton");
    }

    @And("^User should be able to view the verification message successfully$")
    public void userShouldBeAbleToViewTheVerificationMessageSuccessfully() {
        us07Content.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @And("^When searching by  \"([^\"]*)\", the results should be matched the search terms\\.$")
    public void whenSearchingByTheResultsShouldBeMatchedTheSearchTerms(String arg0) {
        us07Content.findElementAndSendKeysFunction("searchName", arg0);
        us07Content.findElementAndClickFunction("searchButton");
        temp = arg0;
    }

    @Then("^User  should be able to edit the Notification$")
    public void userShouldBeAbleToEditTheNotification(DataTable elements) {
        us07Content.editAndDeleteFunction(temp, "edit");
        us07Content.usingElementsInTheDataTableAndSendKeys(elements);
        us07Content.findElementAndClickFunction("saveButton");
        temp = "";
    }

    @Then("^User  should be able to delete the Notification$")
    public void userShouldBeAbleToDeleteTheNotification() {
        us07Content.editAndDeleteFunction(temp, "delete");
        us07Content.findElementAndClickFunction("yesButton");
        temp = "";
    }
}
