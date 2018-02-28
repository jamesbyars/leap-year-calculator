package com.ernesttech.example.leapyear.stepDefs;

import com.ernesttech.example.leapyear.LeapYearCalculator;
import com.ernesttech.example.leapyear.Year;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearStepDefs {

    private Year year;

    private LeapYearCalculator leapYearCalculator;


    @Before
    public void setUp() {
        leapYearCalculator = new LeapYearCalculator();
    }

    @After
    public void tearDown() {
        // Any tear-down happens here
    }

    @Given("^the year is (\\d+)$")
    public void theYearIs(int theYear) throws Throwable {
        year = new Year(theYear);
    }

    @When("^I check if the year is a leap year$")
    public void iCheckIfTheYearIsALeapYear() throws Throwable {
        leapYearCalculator.setYear(year);
    }

    @Then("^I should get a \"([^\"]*)\"$")
    public void iShouldGetA(String result) throws Throwable {
        assertThat(leapYearCalculator.isLeapYear(), is(result));
    }

}
