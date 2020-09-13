Feature: Verfying the adactin hotel booking functionalities again once

Scenario Outline: Verifying the adactin hotel booking login details with Members details step3

Given user is on the again adactin hotel booking page
When user should enter the detail check the different aduld per room  "<username>","<password>","<location>","<hotels>","<roomtype>","<nor>","<checkind>","<checkoutd>","<apr>","<cpr>","<firstname>","<lastname>","<billingaddress>","<cardno>","<cardtype>","<exdatemonth>","<exdateyear>" and "<cvv>" 
And print the order number for different adult per room
Then user should click the again log out button  

Examples: 

     |username|password|location |hotels        |roomtype       |nor    |checkind  |checkoutd |apr      |cpr     |firstname|lastname|billingaddress  |cardno          |cardtype|exdatemonth|exdateyear|cvv |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double         |1 - One|23/08/2020|24/08/2020|4 - Four |0 - None|syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double         |2 - Two|23/08/2020|24/08/2020|2 - Two  |0 - None|syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double         |2 - Two|23/08/2020|24/08/2020|1 - One  |0 - None|syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double         |2 - Two|23/08/2020|24/08/2020|3 - Three|0 - None|syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |
   
Scenario Outline: Verifying the adactin hotel booking login details with Members details step4

Given user is on the adactin hotel booking page again
When user should enter the details and check the different child per room "<username>","<password>","<location>","<hotels>","<roomtype>","<nor>","<checkind>","<checkoutd>","<apr>","<cpr>","<firstname>","<lastname>","<billingaddress>","<cardno>","<cardtype>","<exdatemonth>","<exdateyear>" and "<cvv>" 
And print the order number for different child per room 
Then user should again click the log out button

Examples: 

     |username|password|location |hotels        |roomtype       |nor    |checkind  |checkoutd |apr      |cpr      |firstname|lastname|billingaddress  |cardno          |cardtype|exdatemonth|exdateyear|cvv |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double         |1 - One|23/08/2020|24/08/2020|4 - Four |3 - Three|syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double         |2 - Two|23/08/2020|24/08/2020|2 - Two  |0 - None |syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double         |2 - Two|23/08/2020|24/08/2020|2 - Two  |1 - One  |syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double         |2 - Two|23/08/2020|24/08/2020|2 - Two  |2 - Two  |syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double         |2 - Two|23/08/2020|24/08/2020|2 - Two  |4 - Four |syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |