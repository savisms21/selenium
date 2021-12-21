Feature: Hotel Booking Functionality

Scenario: User login the adactin application
Given User Launch the adactin application
When User enter the "SavithaAlagar"valid user name 
And User enter the valid "7HGL4E"password
Then User validate the username and password

Scenario: User book the hotel
 Given User select the location
 When user select the hotels
 And user select the room type
 Then user search the hotel
 
 Scenario: user select the hotel
 Given user click the hotel name
 When user click the continue button
 
 Scenario: Book a hotel
 Given user has to enter the Firstname
 When user has to enter the Lastname
 Given user has to enter the billing address
 When user has to enter the credit cardno
 When user enter the credit cardtype
 And user has to select the expirydate
 And user has to enter the Cvvno
 Then user select the booknow
 
 Scenario: Booking confirmation page
 Then user select the itinerary
 
 Scenario: Booking logout page
 Then user click the logout button
 
 
 
 
 
 