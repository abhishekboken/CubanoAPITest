package example.google;

import example.ConcordionFixture;

public class SearchForConcordionFixture extends ConcordionFixture {

    public String google(String term) {
        return workflow()
                .openSearch().
				clickNoRadioButton().clickNextButton().
				clickNoRadioButton().clickNextButton().
				clickNoRadioButton().clickNextButton().
				clickYesRadioButton();
    }
}
