Feature: Feedback

  Scenario: Send feedback form with valid data
    Given that the user is on the Note It Feedback page
    When on the Feedback page a firstname "Hiltsje" is entered
    And on the Feedback page an email "hiltsje@dummy.com" is entered
    And on the Feedback page a feedback "Hai, playing around with Cucumber and Selenide is so much fun." is entered
    Then on the Feedback page click on the Send Feedback button