/*
 * @Author:Group_2 Tarih :03/12/2020
 */
package StepDefinations;
import Pages.NavbarContent;
import Pages.Ornek_Content;
import Pages.US_07_Content;
import cucumber.api.java.en.When;

public class US_07_Stepdefs {

    NavbarContent navbarContent=new NavbarContent();
    US_07_Content us_07_content=new US_07_Content();

    @When("^User should be able to create a new Discount$")
    public void userShouldBeAbleToCreateANewDiscount() {
        navbarContent.findElementAndClickFunction("setupOne");
        navbarContent.findElementAndClickFunction("parameters");
        navbarContent.findElementAndClickFunction("discounts");
       // us_07_content.findElementAndClickFunction("addButton");

    }

    @When("^User should be able to update an existant Discount$")
    public void userShouldBeAbleToUpdateAnExistantDiscount() {
    }

    @When("^User should be able to delete an existant Discount$")
    public void userShouldBeAbleToDeleteAnExistantDiscount() {
    }
}
