Feature: Hotel Booking in Adactin Application

@SmokeTest
Scenario Outline: Adactin
Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Passowrd Field
Then user Click On The Login Button And It Navigates To The Search Hotel

Examples:

|Username|Password|
|AAA|123|
|BBB|456|
|nithiyasekar2010|melijofi|


@SanityTest
Scenario:
When user Select The Location In The Location Field
And user Select The Hotel Name In The Hotel Name Field
And user Select The Room Type In The Room Type Field
And user Select The NUmber Of Rooms In The Number Of Rooms Field
And user Select The Number Of Rooms In The Adults Per Room Field
And user Select The Number Of Rooms In The  Per Children Room Field
Then user Click On The Search button And It Navigates To The Select Hotel

@SanityTest
Scenario:
When user Select The Radio Button In The Select field
Then user Select The Continue Button And It Navigates To The Book A Hotel

@SanityTest
Scenario:
When user Enter The First Name In The First Name Field
And  user Enter The Last Name In The Last Name Fiel
And  user enter The Address In The Billing Address Field 
And user Enter The Credit Card Number In The Credit Card No Field
And user Select The Credit Card Type In The Credit Card Type Field
And user Select The Expiry Month In the Select Month Field
And user Select The Expiry Year In The Select Year Field
And user select the CVV Number In The CVV Number Field
Then user Click The Book Now Button And It Naviagtes To The Booking Conformation

@SanityTest
Scenario:
Then user Click The My Itinerary Button And It Navigates To the Booked Itinerary

@RegressionTest
Scenario:
Then user Click The Logout Button To Logout from the Hotel Booking


