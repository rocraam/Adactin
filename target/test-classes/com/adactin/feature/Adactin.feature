Feature: Hotel Booking In Adactin Site
@smokeTest
Scenario Outline:
Given user Get The Adactin Site
When user Enter "<Username>" in Username Field
And user Enter "<Password>" in Password Field
Then user Click The Login Button To The Hotel Booking
Examples:
|Username|Password|
|raamkumar7|ramku7@|

@sanityTest
Scenario:

When user Select The Location
And user Select The Hotels
And user Select The Room Type
And user Select The No Of Rooms
And user Enter Check In Date
And user Enter Check Out Date
And user Enter For No Of Adult Per Rooms
And user Enter For No Of Children Per Rooms
Then user Click The Search Button For Search Hotels


@sanityTest
Scenario:

When user Select The Hotel For Booking
Then user Click On The Continue Button To Navigate The Booking Section
@sanityTest
Scenario:

When user Enter Here Firstname
And user Enter Here lastname
And user Enter The Address Proff
And user Enter The  Credit Card Number
And user Select The Credit Card Type
And user Enter The Expiry Date In Card
And user Enter The Expiry Year In Card
And user Enter The  Credit Card Cvv Number
Then user Click The Booknow Button To Book The Hotel

@resgressionTest
Scenario:

When user Click On The Logout Button To Home