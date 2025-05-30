package Pages;

import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css="[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath="//*[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath="//*[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath="//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="//*[@formcontrolname='shortName']//input")
    public WebElement shortName;

    @FindBy(xpath="//div[contains(text(),'already')]")
    public WebElement alreadyMessage;

    @FindBy(xpath="//ms-text-field/input[@placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath="//ms-search-button/div/button")
    public WebElement searchButton;

    @FindBy(xpath="//ms-delete-button//button")
    public WebElement deleteImageBtn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath="//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityCode;

    @FindBy(xpath="//tbody//tr//td[2]")
    public List<WebElement> nameList;

    //-------------------------------------------------------------

    @FindBy(xpath = "//*[@class='zak-button']")
    public WebElement demoButton;

    @FindBy(xpath = "(//*[@class='elementor-button-text'])[2]")
    public WebElement exploreOpenMRS2Button;

    @FindBy(xpath = "(//*[@class='elementor-button-text'])[4]")
    public WebElement enterExploreOpenMRS2Button;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameInputField;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//*[@id='sessionLocation']//li")
    public WebElement locations;

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement logInButtonnn;


    public void verifyMessageContainsText(WebElement element, String serchText){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(serchText.toLowerCase()));

        // mesaj html kodları gelene kadar bekle
        //wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        //Assert.assertTrue(successMessage.getAttribute("innerHTML").toLowerCase().contains(serchText.toLowerCase()));
        // gettext e ulaşılamdığından HTML (innerHTML)  kodlarında succesfully yazısı kontrol edildi

        //ekranda hata olduğunda ekranda kalan dialog kutusu kaptmak için konuldu.
        // aksi halde ekranda kaldığı için silme işlemine geçemiyor
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void deleteItem(String deleteName){
        GWD.getDriver().navigate().refresh(); // countrynin sistem/yazılım hatasından dolayı konuldu
        mySendKeys(searchInput,  deleteName);
        myClick(searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);
    }

    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {
            case "addButton" : return this.addButton;
            case "saveButton" : return this.saveButton;
            case "nameInput" : return this.nameInput;
            case "codeInput" : return this.codeInput;
            case "shortName" : return this.shortName;
            case "integrationCode": return this.integrationCode;
            case "priorityCode": return this.priorityCode;
        }

        return null;
    }


}
