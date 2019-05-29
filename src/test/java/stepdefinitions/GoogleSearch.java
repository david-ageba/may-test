package stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GoogleSearch {
    public static WebDriver driver;
    @Given("^I am on google search page$")
    public static void i_am_on_google_search_page() throws Throwable {

        // EXPERT SETUP WITH OS AND RELATIVE PATH
        String os = System.getProperty("os.name").toLowerCase();
                driver = new ChromeDriver();
        if (os.contains("mac")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
    }

        // INTERMEDIATE SETUP WITH RELATIVE PATH
        // String path = System.getProperty("user.dir");
        // System.out.println(path);
        // System.setProperty("webdriver.chrome.driver", path+"\\driver\\chromedriver.exe");
        // driver = new ChromeDriver();

        // BASIC SETUP WITH ABSOLUTE PATH TO DRIVERS
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\DavidAgeba\\JATTrainingOne\\ACUKJATTrainingOne\\driver\\chromedriver.exe");
        // System.setProperty("webdriver.firefox.marionette","C:\\Users\\DavidAgeba\\JATTrainingOne\\ACUKJATTrainingOne\\driver\\geckodriver.exe");
        // WebDriver driver = new FirefoxDriver();

        // NAVIGATE TO TEST PAGE
        driver.get ("https://www.google.co.uk");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1)  {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(arg1);
        search.submit();
    }

    @Then("^the page title should contain \"([^\"]*)\"$")
    public void the_first_line_on_the_result_page_should_contain(String arg1)   {
        driver.getTitle().contains(arg1);
        //driver.close();
        driver.quit();

    }

    @Then("^the first line on the result page should contain \"([^\"]*)\"$")
    public void theFirstLineOnTheResultPageShouldContain(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement searchResult = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > h3"));
        String string = searchResult.getText();
        Assert.assertTrue(string.contains(arg0));
        driver.quit();
    }
}
