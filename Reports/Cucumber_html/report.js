$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Site",
  "description": "",
  "id": "hotel-booking-in-adactin-site",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-site;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Get The Adactin Site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter \"\u003cUsername\u003e\" in Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"\u003cPassword\u003e\" in Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button To The Hotel Booking",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-site;;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactin-site;;;1"
    },
    {
      "cells": [
        "raamkumar7",
        "ramku7@"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-site;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-site;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Get The Adactin Site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter \"raamkumar7\" in Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"ramku7@\" in Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button To The Hotel Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Get_The_Adactin_Site()"
});
formatter.result({
  "duration": 5699844400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "raamkumar7",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_in_Username_Field(String)"
});
formatter.result({
  "duration": 487615400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ramku7@",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_in_Password_Field(String)"
});
formatter.result({
  "duration": 1173002600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_To_The_Hotel_Booking()"
});
formatter.result({
  "duration": 2039000100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-site;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user Select The Hotels",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The No Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Enter Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Enter Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter For No Of Adult Per Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter For No Of Children Per Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Click The Search Button For Search Hotels",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location()"
});
formatter.result({
  "duration": 1444973800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotels()"
});
formatter.result({
  "duration": 1517442700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 1204978900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_No_Of_Rooms()"
});
formatter.result({
  "duration": 1163015800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Check_In_Date()"
});
formatter.result({
  "duration": 1142025900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Check_Out_Date()"
});
formatter.result({
  "duration": 1138188800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_For_No_Of_Adult_Per_Rooms()"
});
formatter.result({
  "duration": 1180908300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_For_No_Of_Children_Per_Rooms()"
});
formatter.result({
  "duration": 1183800000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_Button_For_Search_Hotels()"
});
formatter.result({
  "duration": 799720000,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-site;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Select The Hotel For Booking",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Click On The Continue Button To Navigate The Booking Section",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_For_Booking()"
});
formatter.result({
  "duration": 1114159500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Continue_Button_To_Navigate_The_Booking_Section()"
});
formatter.result({
  "duration": 1782156900,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-site;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user Enter Here Firstname",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user Enter Here lastname",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Address Proff",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The  Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter The Expiry Date In Card",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Expiry Year In Card",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter The  Credit Card Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Click The Booknow Button To Book The Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_Here_Firstname()"
});
formatter.result({
  "duration": 1204080100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Here_lastname()"
});
formatter.result({
  "duration": 1150904200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Address_Proff()"
});
formatter.result({
  "duration": 1145324800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number()"
});
formatter.result({
  "duration": 1162164200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 1183723300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Expiry_Date_In_Card()"
});
formatter.result({
  "duration": 1227210600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Expiry_Year_In_Card()"
});
formatter.result({
  "duration": 1178582400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Cvv_Number()"
});
formatter.result({
  "duration": 1138591600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Booknow_Button_To_Book_The_Hotel()"
});
formatter.result({
  "duration": 1154772400,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-site;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@resgressionTest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user Click On The Logout Button To Home",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Logout_Button_To_Home()"
});
formatter.result({
  "duration": 1528581100,
  "status": "passed"
});
});