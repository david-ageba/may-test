package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
    WebDriver driver = null;
    @Given("^I am on google search page$")
    public void i_am_on_google_search_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("user.dir", System.getProperty("\\driver\\chromedriver.exe"));
        // System.setProperty("webdriver.chrome.driver","C:\\Users\\DavidAgeba\\JATTrainingOne\\ACUKJATTrainingOne\\driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        // System.setProperty("webdriver.firefox.marionette","C:\\Users\\DavidAgeba\\JATTrainingOne\\ACUKJATTrainingOne\\driver\\geckodriver.exe");
        // WebDriver driver = new FirefoxDriver();
         driver.get ("https://www.googlo.co.uk");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println( "Second step" );
    }

    @Then("^the first line on the result page should contain \"([^\"]*)\"$")
    public void the_first_line_on_the_result_page_should_contain(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println( "Third step" );

    }

}
