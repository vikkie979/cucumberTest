Feature: Registration Form Submission
  Scenario: Submit the registration form with valid details
    Given the user is on the registration page
    When the user enters first name "John"
    When the user enters last name "Doe"
    When the user selects gender "Male"
    When the user enters mobile number "1234567890"
    When the user selects hobbies "Sports" and "Music"
    When the user selects state "NCR" and city "Delhi"
    When the user submits the form
    Then the form should be submitted successfully