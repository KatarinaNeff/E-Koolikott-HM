package ee.hm.dop.components;

import org.openqa.selenium.By;
import ee.hm.dop.helpers.PageHelpers;
import ee.hm.dop.page.MyMaterialsPage;


public class ChoosePortfolioChapterModal extends PageComponent {
private By clickToCheckChapter = By.xpath("(//button[@ng-click='addMaterialsToChapter(chapter, selectedPortfolio)'])");
	
	public MyMaterialsPage choosePortfolioChapter() {
		getDriver().findElement(clickToCheckChapter).click();
		PageHelpers.waitForSeconds(2500);
		return new MyMaterialsPage();
	}

}
