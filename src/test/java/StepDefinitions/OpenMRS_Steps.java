package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenMRS_Steps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @Given("Navigate to OpenMRS")
    public void navigateToOpenMRS() {
        System.out.println("Siteye gidildi");
        GWD.getDriver().get("https://openmrs.org/");
    }

    @When("Click the Demo button")
    public void clickTheDemoButton() {
        dc.demoButton.click();

    }

    @Then("Click the Explore OpenMRS{int} button")
    public void clickTheExploreOpenMRSButton(int arg0) {
        dc.exploreOpenMRS2Button.click();
    }

    @And("Click the Enter the OpenMRS{int} Demo button")
    public void clickTheEnterTheOpenMRSDemoButton(int arg0) {
        dc.enterExploreOpenMRS2Button.click();
    }

    @And("Enter username and password")
    public void enterUsernameAndPassword() {
        dc.usernameInputField.sendKeys("admin");
        dc.passwordInputField.sendKeys("Admin123");
    }

    @And("click Inpatient Ward button and login button")
    public void clickInpatientWardButtonAndLoginButton() {
        dc.locations.click();
        dc.logInButtonnn.click();
    }
}
