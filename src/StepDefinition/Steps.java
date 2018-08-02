package StepDefinition;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;	
import cucumber.api.java.en.And;	

public class Steps {				

     
    @Given("^User clicks Go-Clean service$")					
    public void user_click() throws Throwable
    {
    	System.out.println("User clicks Go-Clean service");
    }
    
    @When("^User choose service Peralatan Go-Clean$")
    public void user_choose_service() throws Throwable
    {
    	System.out.println("User choose service Peralatan Go-Clean");
    }

    @And("^User choose duration 1 Jam$")
    public void user_choose_duration() throws Throwable
    {
    	System.out.println("User choose duration 1 Jam");
    }
    
    @And("^User choose service preferences wanita$")
    public void user_choose_service_gender() throws Throwable
    {
    	System.out.println("And User choose service preferences Wanita");
    }

    
    @And("^User clicks button Lanjut$")
    public void user_click_next() throws Throwable
    {
    	System.out.println("User clicks button Lanjut");
    }
    
    @Then("^User go to order confirmation page$")
    public void user_goto_order_confirmation() throws Throwable
    {
    	System.out.println("User go to order confirmation page");
    }
    
    @And("^User already booked go-clean$")
    public void user_already_booked() throws Throwable
    {
    	System.out.println("User already booked go-clean");
    }

}