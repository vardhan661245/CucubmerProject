Feature: Search Functionality 
 
 Background:
 Given user openn chrome Browserr 
 And user navigatee the urll ecom
 When user clickk on serachh field 
 
 
 Scenario: verify we are able to serach products 
 
 And user provided inputt as shirts
 And user clickkk on serachh btn 
 Then user cann see the shirts list
 
 Scenario: verify we are able to serach products 
 
 And user providedd inputtt as mobile 
 And user searchss with voiceee command 
 Then user can seee the mobiles list