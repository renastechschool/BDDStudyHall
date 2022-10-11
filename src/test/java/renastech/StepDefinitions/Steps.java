package renastech.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renastech.pages.GoogleSearchPage;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

public class Steps extends BrowserUtils {

    GoogleSearchPage googleSearchPage=new GoogleSearchPage();

    @Given("User wants to go google")
    public void user_wants_to_go_google() {
        Driver.getDriver();
        driver.get(ConfigurationsReader.getProperties("url"));

    }
    @Given("Verify that user is on google home page")
    public void verify_that_user_is_on_google_home_page() {

        googleSearchPage.VerificationOfHomePage();

    }
    @When("User enter a text on search box")
    public void user_enter_a_text_on_search_box() {
        googleSearchPage.setSearchBox();

    }
    @When("click to search button")
    public void click_to_search_button() {
        googleSearchPage.setSearchButton();

    }
    @Then("title matches with search text")
    public void title_matches_with_search_text() {
        googleSearchPage.verifyTextTitle();
    }



}
