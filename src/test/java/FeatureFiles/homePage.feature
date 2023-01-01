@test
Feature: Verify Home Page is Opened


  @test
  Scenario: Verify Home Page is Opened
    Given  User Click on Register Link
    When User Register Successfully
    Then Verify User Registered Successfully
    And User Click Continue Button
    And User Click on Login Link
    And User Login Successfully
    Then Verify User is Logged in Successfully
    And User clicks on Books Link
    Then Verify Books Screen is Opened Successfully
    And User select Sort Type
    And User click on Add to Cart
    And User click on Shopping Cart Link
    Then Verify Shopping Cart Screen is Opened Successfully
    And User click on Terms Checkbox
    And User click on Checkout Button
    Then Verify User is Checked Out Successfully
    And User fill Billing Successfully
    And User Confirm The Order
    Then Verify Order has been Processed Successfully


