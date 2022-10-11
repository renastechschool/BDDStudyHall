package renastech.StepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import renastech.utils.BrowserUtils;
import renastech.utils.Driver;

public class Hooks extends BrowserUtils {

    @Before
    public void setUp(){
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());

        }

    }

}
