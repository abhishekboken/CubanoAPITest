package org.concordion.cubano.template.driver.ui.google;

import java.util.List;

import org.concordion.cubano.driver.BrowserBasedTest;
import org.concordion.cubano.template.AppConfig;
import org.concordion.cubano.template.driver.ui.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleSearchPage extends PageObject<GoogleSearchPage> {
    public GoogleSearchPage(BrowserBasedTest test) {
        super(test);
    }

    @FindBy(css = "#EditableFormStep_e7810 > h1")
	WebElement pageHeading;
	
	@FindBy(className = "even valNo")
	WebElement clickNoRadioButton;
	
	@FindBy(className = "odd valYes")
	WebElement clickYesRadioButton;	
	
	@FindBy(className = "step-button-next")
	WebElement clickNextButton;

    @Override
    public ExpectedCondition<?> pageIsLoaded(Object... params) {
        return ExpectedConditions.visibilityOf(pageHeading);
    }

    public static GoogleSearchPage open(BrowserBasedTest test) {
        test.getBrowser().getDriver().navigate().to(AppConfig.getInstance().getSearchUrl());

        return new GoogleSearchPage(test);
    }

    public String clickYesRadioButton() {
		clickYesRadioButton.click();
		return null;
	}

	public GoogleSearchPage clickNoRadioButton() {
		clickNoRadioButton.click();
		return this;
	}

	public GoogleSearchPage clickNextButton() {
		clickNextButton.click();
		return this;
	}
}
