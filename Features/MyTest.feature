Feature: Go-CleanAs a customer, I want to order Go-Clean, So that I can get helper for cleaning my house
Scenario: User can order Go-Clean

Given User clicks Go-Clean service
When User choose service Peralatan Go-Clean 
And User choose duration 1 Jam
And User choose service preferences wanita 
And User clicks button Lanjut
Then User go to order confirmation page
And User already booked go-clean