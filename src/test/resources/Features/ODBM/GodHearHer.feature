Feature: validating the podcast and duration
  Background:
    Then User opens Url "https://www.odbm.org/"
  @God
  Scenario:
    Then User opens Url "https://www.odbm.org/"
    Given user hovering to Our Ministry title and click "God Hears Her" option
    When user validate and click the Podcast then enter any episode "Raising teens" option
    Then user validating the audio file whether it is able to play and pause

  @God1
  Scenario:
    Then User opens Url "https://www.odbm.org/"
    Given user hovering to Our Ministry title and click "God Hears Her" option
    When user validate and click the Podcast then enter any episode "Raising teens" option
    Then user should validate the clicking forward button at multiple times

  @God2
  Scenario:
    Then User opens Url "https://www.odbm.org/"
    Given user hovering to Our Ministry title and click "God Hears Her" option
    When user validate and click the Podcast then enter any episode "Raising teens" option
    Then user should validate the clicking forward button at multiple times
    And user should validate the clicking rewind button at multiple times

  @God3
  Scenario:
    Then User opens Url "https://www.odbm.org/"
    Given user hovering to Our Ministry title and click "God Hears Her" option
    When user validate and click the Podcast then enter any episode "Raising teens" option
    Then user should validate the clicking forward button at multiple times
    And user verify the playback speed "2" of the audio file

  @God4
  Scenario:  verify audio is playing
    Then User opens Url "https://www.odbm.org/"
    Given user hovering to Our Ministry title and click "God Hears Her" option
    When user validate and click the Podcast then enter any episode "Raising teens" option
    Then user verifying the audio is playing by checking initial and updated time

  @God5
  Scenario: verify the forward and rewind functionality in audio file
    Then User opens Url "https://www.odbm.org/"
    Given user hovering to Our Ministry title and click "God Hears Her" option
    When user validate and click the Podcast then enter any episode "Raising Teens" option
    Then user click the Forward button with fifteen seconds
    And also user verify the Rewind button with fifteen seconds of duration

