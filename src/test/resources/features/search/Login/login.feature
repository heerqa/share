@All @LoginTest

Feature: Login test
  
  
  The purpose of the feature
  is to make sure
  that user is able to login with valid user id and password

  @test1
  Scenario: Verify that Admin is able to Login to my account by clicking the login button
    Given user is on login page
    And user enter username "heer@heersoftware.com" and password as "Tester1234!" and click Login button
    Then home page is displayed

