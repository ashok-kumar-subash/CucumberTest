package stepdef;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.ListIterator;


public class RestapiTest {

    @Given("^I get request for employee id \"([^\"]*)\"$")
    public void iGetRequestForEmployeeId(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should get response code as \"([^\"]*)\"$")
    public void iShouldGetResponseCodeAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be able to see all the details in response$")
    public void iShouldBeAbleToSeeAllTheDetailsInResponse(DataTable table) throws Throwable {
        //Initialize table
        List<List<String>> data = table.raw();


        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
