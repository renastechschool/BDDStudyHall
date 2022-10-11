package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;
import renastech.utils.Driver;

public class GoogleSearchPage extends BrowserUtils {
    public GoogleSearchPage() {
        PageFactory.initElements(driver,this); }

        @FindBy(name = "q")
        private WebElement searchBox;
        @FindBy(name = "btnK")
        private WebElement searchButton;


    public void VerificationOfHomePage(){
        String expectedTitle="Google";
        String actualTitle= Driver.driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


       public void setSearchBox(){
        searchBox.sendKeys("Renastech");
    }

    public void setSearchButton(){
        searchButton.click();
    }

    public void verifyTextTitle(){
        String expectedTitle="Renastech";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.startsWith(expectedTitle));
    }






}
