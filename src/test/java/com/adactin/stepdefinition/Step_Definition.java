package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.properties.File_Reader;
import com.adactin.runner.Runner_Class;

import baseclass.Base_Class;
import baseclass.Pom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class{
	public static WebDriver driver=Runner_Class.driver;
	public static Pom p=new Pom(driver);
	
	@Given("^user Get The Adactin Site$")
	public void user_Get_The_Adactin_Site() throws Throwable {
		String url = File_Reader.getinstance().getCR().getUrl();
	   getUrl(url);
	   wait(2000);
	}

	@When("^user Enter \"([^\"]*)\" in Username Field$")
	public void user_Enter_in_Username_Field(String user) throws Throwable {
	    send(p.getH().getUser(),user);
	}

	@When("^user Enter \"([^\"]*)\" in Password Field$")
	public void user_Enter_in_Password_Field(String pass) throws Throwable {
		send(p.getH().getPass(),pass);
		wait(1000);
	}


	@Then("^user Click The Login Button To The Hotel Booking$")
	public void user_Click_The_Login_Button_To_The_Hotel_Booking() throws Throwable {
		clickon(p.getH().getLogin());
		wait(1000);
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		Dropdown(p.getS().getLocation(),"value","Brisbane");
		wait(1000);
	}

	
	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		Dropdown(p.getS().getHotels(),"value","Hotel Hervey");
		wait(1000);
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		Dropdown(p.getS().getRoom_type(),"value","Double");
		wait(1000);
	}

	@When("^user Select The No Of Rooms$")
	public void user_Select_The_No_Of_Rooms() throws Throwable {
		Dropdown(p.getS().getRoom_nos(),"value","1");
		wait(1000); 
	}

	@When("^user Enter Check In Date$")
	public void user_Enter_Check_In_Date() throws Throwable {
	   send(p.getS().getDatepick_in(),"08/12/2021");
	   wait(1000); 
	}

	@When("^user Enter Check Out Date$")
	public void user_Enter_Check_Out_Date() throws Throwable {
	   send(p.getS().getDatepick_out(),"10/12/2021"); 
	   wait(1000);
	}

	@When("^user Enter For No Of Adult Per Rooms$")
	public void user_Enter_For_No_Of_Adult_Per_Rooms() throws Throwable {
	   Dropdown(p.getS().getAdult_room(),"value","2");
	   wait(1000);
	}

	@When("^user Enter For No Of Children Per Rooms$")
	public void user_Enter_For_No_Of_Children_Per_Rooms() throws Throwable {
		 Dropdown(p.getS().getChild_room(),"value","2");
		 wait(1000);
	}

	

	@Then("^user Click The Search Button For Search Hotels$")
	public void user_Click_The_Search_Button_For_Search_Hotels() throws Throwable {
	    
	    clickon(p.getS().getSubmit());
	}


	@When("^user Select The Hotel For Booking$")
	public void user_Select_The_Hotel_For_Booking() throws Throwable {
	   clickon(p.getSh().getSelect_hotel());
	   wait(1000);
	}

	@Then("^user Click On The Continue Button To Navigate The Booking Section$")
	public void user_Click_On_The_Continue_Button_To_Navigate_The_Booking_Section() throws Throwable {
	    clickon(p.getSh().getContinu());
	    wait(1000);
	}


	@When("^user Enter Here Firstname$")
	public void user_Enter_Here_Firstname() throws Throwable {
		send(p.getB().getFirst_name(),"raam");
		 wait(1000); 
	}

	@When("^user Enter Here lastname$")
	public void user_Enter_Here_lastname() throws Throwable {
		send(p.getB().getLast_name(),"kumar");
		 wait(1000);  
	}

	@When("^user Enter The Address Proff$")
	public void user_Enter_The_Address_Proff() throws Throwable {
		send(p.getB().getAddress(),"chennai");
		 wait(1000);  
	}

	@When("^user Enter The  Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
	   send(p.getB().getCredit(),"7894561233216549"); 
	   wait(1000); 
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
	   Dropdown(p.getB().getCredit_type(),"value","VISA");
		wait(1000); 
	}

	@When("^user Enter The Expiry Date In Card$")
	public void user_Enter_The_Expiry_Date_In_Card() throws Throwable {
	   Dropdown(p.getB().getMonth(),"value","3");
		wait(1000);
	}

	@When("^user Enter The Expiry Year In Card$")
	public void user_Enter_The_Expiry_Year_In_Card() throws Throwable {
		Dropdown(p.getB().getYear(),"value","2022");
		wait(1000);  
	}

	@When("^user Enter The  Credit Card Cvv Number$")
	public void user_Enter_The_Credit_Card_Cvv_Number() throws Throwable {
	    send(p.getB().getCvv_no(),"123");
		wait(1000);
	}

	@Then("^user Click The Booknow Button To Book The Hotel$")
	public void user_Click_The_Booknow_Button_To_Book_The_Hotel() throws Throwable {
	   clickon(p.getB().getBook_btn());	
	   wait(1000);
	}


	@When("^user Click On The Logout Button To Home$")
	public void user_Click_On_The_Logout_Button_To_Home() throws Throwable {
	   clickon(p.getC().getLogout()); 
	   wait(1000);
	}

}
