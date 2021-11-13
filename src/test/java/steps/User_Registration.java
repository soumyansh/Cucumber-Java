package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_Registration {

@Given("When user is on registration page")
public void when_user_is_on_registration_page() {
	System.out.println("On registration page");

}

@When("user enters following data")
public void user_enters_following_data(io.cucumber.datatable.DataTable dataTable) {
   List<List<String>>list=dataTable.asLists();
  System.out.println(list);

}

@Then("user registration is successfull")
public void user_registration_is_successfull() {
  System.out.println("Registration success");
}

@Given("When user is on login page")
public void when_user_is_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User on login page");
}

@When("user enters mapping data")
public void user_enters_mapping_data(io.cucumber.datatable.DataTable dataTable) {
List<Map<String,String>>list=dataTable.asMaps();
System.out.println("-------::::"+list.get(1).get("Name"));


}

@Then("user login is successfull")
public void user_login_is_successfull() {
System.out.println("User login success");

}



}
