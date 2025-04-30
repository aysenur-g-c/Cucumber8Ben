package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to country")
    public void navigateToCountry() {
    ln.myClick(ln.setup);
    ln.myClick(ln.parameters);
    ln.myClick(ln.countries);
    }

    @When("Create a country")
    public void createACountry() {
    String ulkeAdi= RandomStringUtils.randomAlphanumeric(6); //6 harf
    String ulkeKodu=RandomStringUtils.randomNumeric(3); //3 sayı

    dc.myClick(dc.addButton);
    dc.mySendKeys(dc.nameInput, ulkeAdi);
    dc.mySendKeys(dc.codeInput, ulkeKodu);
    dc.myClick(dc.saveButton);

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText(dc.successMessage, "successfully");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String ulkeAd, String ulkeKod) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, ulkeAd);
        dc.mySendKeys(dc.codeInput, ulkeKod);
        dc.myClick(dc.saveButton);
    }
}
