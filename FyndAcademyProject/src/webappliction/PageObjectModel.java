package webappliction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModel {
	@FindBy (xpath="//*[text()= 'Football']") WebElement Football;
	@FindBy (xpath="//*[text()= 'Kriket']") WebElement Cricket;
	@FindBy (xpath="//*[text()='Home']") WebElement Home;
	@FindBy (xpath="/html/body/header/div/ul/li[3]/a") WebElement BasketBall;
	@FindBy (xpath="//*[text()='Cibersport']") WebElement cyberSport;

}
