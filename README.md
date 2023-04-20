# Web-Application-Testing-and-Quality-Assurance
This is a web application testing and quality assurance project, which involves performing various tasks such as user story analysis, test scenario development, automation test script preparation and execution, bug finding, and bug reporting.  
# Task 1: User Story Analysis and Test Scenario Development
User Story
User Story 0001: Add About us link option in footer of the application

Description: The scope of this US is to provide ‘About us’ link so that users can click on the link and get all the details about the organization vision and mission.

Acceptance Criteria:

Users should be able to click on the ‘About us’ link
‘About us’ link should be displayed in footer part (as per the mock-up)
When user click on the ‘About us’ link system will navigate to new page which display the Organization Vision and Mission.
‘About us’ link should be available for all the tabs (Home, Cricket, Football, Basketball and Ciber Sports)
# Task 2: Prepare Automation Test Script and also perform the test execution
Automation Testing Scenario:
Launch the application: https://test-nf.com/english.html
Verify the availability of each tab(Home, Cricket, Football, Basketball and Ciber Sports)
Verify URL of each tab contains the tab name.
Store all the current URL in excel sheet.
Note: Implement Page Object model, Assertion for Validation, Excel Sheet Integration for passing System properties and application URL.

# Task 3: Bug finding and bug reporting
Here is the list of bugs found in the different sections of the web application. The priority and severity of each bug are also mentioned.

# Homepage
In the header section, the spellings of Basketball, Cricket, and Cybersport are incorrect. (Priority: Low, Severity: Low)
In the header section, the orange background highlight of the football menu does not cover the full border length. (Priority: Low, Severity: Low)
On hovering over the "Basketball" tab, the text of Basketball disappears. (Priority: Medium, Severity: Low)
The layout of the images is not uniform. (Priority: Low, Severity: Low)
The image of Lionel Messi is incorrect. (Priority: High, Severity: Medium)
The ads overlap with the navigation bar while scrolling the homepage. (Priority: Medium, Severity: Low)
In the body section, if we click on the learn more button of Michael Jordon, we are unable to view any information. It's blank. (Priority: High, Severity: High)
In the body section, if we click on learn more on Michael Jordan, we are unable to close the information box. The icon is not visible. (Priority: Low, Severity: Low)
The social media handles in the footer are not clickable. (Priority: Medium, Severity: Low)
On clicking the "About us" link, it navigates to a new page which is holding a 404 error. (Priority: High, Severity: High)
On clicking the "Click here" button in ads, it only refreshes the page. (Priority: Low, Severity: Low)
On clicking "TESTERS" and "Apply Now" buttons, both are navigated to the same page. (Priority: Low, Severity: Low)
In the body section, the learn more information text is overlapped with ads. (Priority: Medium, Severity: Low)
In the header section, the titles are not symmetric and not properly aligned. (Priority: Low, Severity: Low)
# FOOTBALL
Bug Title: Incorrect Image on Football Page
Bug Priority: Low
Bug Severity: Minor

Bug Title: Text not fully visible in first story article on Football Page
Bug Priority: Medium
Bug Severity: Major

# BASKETBALL
Bug Title: Misspelling of "Basketball"
Bug Priority: Low
Bug Severity: Minor

Bug Title: Texts not fully visible in articles on Basketball Page
Bug Priority: Medium
Bug Severity: Major

Bug Title: Image not loading in second story article on Basketball Page
Bug Priority: High
Bug Severity: Minor

# CRICKET
Bug Title: Misspelling of "Cricket"
Bug Priority: Low
Bug Severity: Minor

Bug Title: Texts not fully visible in both story articles on Cricket Page
Bug Priority: Medium
Bug Severity: Major

Bug Title: French language used in second story article on Cricket Page
Bug Priority: High
Bug Severity: Major

# CIBERSPORT
Bug Title: Misspelling of "Cybersport"
Bug Priority: Low
Bug Severity: Minor

Bug Title: Text not fully visible in first story article on Cibersport Page
Bug Priority: Medium
Bug Severity: Major

Bug Title: Text not fully visible in second story article on Cibersport Page
Bug Priority: Medium
Bug Severity: Major

#Tools and Technologies Used
Automation Testing Tool: Selenium
Programming Language: Java
Testing Framework: TestNG
Build Tool: Maven
IDE: Eclipse
Excel Sheet Integration: Apache POI
Contributors
Name- Farhan Javaid
Email- magreyfarhan123@gmail.com
