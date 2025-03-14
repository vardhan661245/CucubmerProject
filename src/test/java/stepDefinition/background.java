package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class background 
{
	@Given("user openn chrome Browserr")
	public void user_open_chrome_browserr() 
	{
		System.out.println("open chrome");
	}

	@Given("user navigatee the urll ecom")
	public void user_navigate_the_urll_ecom() 
	{
		System.out.println("enter the url");
	}

	@When("user clickk on serachh field")
	public void user_click_on_serachh_field() 
	{
		System.out.println("search on button");
	}

	@When("user provided inputt as shirts")
	public void user_provided_inputt_as_flower() 
	{
		System.out.println("search the shirts");
	}

	@When("user clickkk on serachh btn")
	public void user_click_on_serachh_btn() 
	{
		System.out.println("click on the search button");
	}

	@Then("user cann see the shirts list")
	public void user_can_see_the_shirts_list()
	{
		System.out.println("see the shirts list");
	}

	@When("user providedd inputtt as mobile")
	public void user_provided_inputtt_as_mobile() 
	{
		System.out.println("see the input as mobile");
	}

	@When("user searchss with voiceee command")
	public void user_searchs_with_voiceee_command() 
	{
		System.out.println("search with voice command");
	}

	@Then("user can seee the mobiles list")
	public void user_can_see_the_mobiles_list() 
	{
		System.out.println("see the mobile list");
	}




}
