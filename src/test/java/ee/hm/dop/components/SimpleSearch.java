package ee.hm.dop.components;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import ee.hm.dop.helpers.PageHelpers;
import ee.hm.dop.page.LandingPage;
import ee.hm.dop.page.SearchResultsPage;

public class SimpleSearch extends PageComponent {
	
	private By simpleSearch = By.id("header-simple-search-input");
	private By autocompleteSelecton = By.cssSelector("span.highlight");

	
	
	public LandingPage insertSearchCriteriaAndSearch(String criteria) {
		getDriver().findElement(simpleSearch).sendKeys(criteria);
		getDriver().findElement(simpleSearch).sendKeys(Keys.ENTER);
		PageHelpers.waitForSeconds(1500);
		return new LandingPage();
	}
	
	public LandingPage insertSearchCriteriaWithAutocomplete(String criteria) {
		getDriver().findElement(simpleSearch).sendKeys(criteria);
		PageHelpers.waitForVisibility(autocompleteSelecton);
		getDriver().findElement(autocompleteSelecton).click();
		PageHelpers.waitForSeconds(1500);
		return new LandingPage();
	}
	
	public LandingPage insertSearchCriteriaInRussian() {
		getDriver().findElement(simpleSearch).sendKeys("Катарина");
		getDriver().findElement(simpleSearch).click();
		PageHelpers.pressEsc();
		PageHelpers.waitForSeconds(2500);
		return new LandingPage();
	}
	
	public SearchResultsPage insertSearchCriteriaAndSearch1() {
		PageHelpers.waitForVisibility(simpleSearch);
		getDriver().findElement(simpleSearch).sendKeys("tag:" + PageHelpers.getDate(0, "dd/MM/yyyy"));
		PageHelpers.waitForSeconds(2500);
		return new SearchResultsPage();
	}

}
