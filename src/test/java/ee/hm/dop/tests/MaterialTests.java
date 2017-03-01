package ee.hm.dop.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.FixMethodOrder;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Test;
import org.junit.runners.MethodSorters;

import ee.hm.dop.page.MaterialPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class MaterialTests {

	@Test
	public void createMaterialAsSmallPublisher() {

		String creatorName = goToLandingPage()
				.chooseUserType("SmallPublisher")
				.getFabButton()
				.moveCursorToAddPortfolio()
				.moveCursorToAddMaterial()
				.clickAddMaterial()
				.setHyperLink()
				.setMaterialTitle()
				.uploadPhoto()
				.addDescription()
				.clickNextStep()
				.selectEducation()
				.selectSubjectArea()
				.selectTargetGroup()
				.clickAddMaterial()
				.getCreatorName();

		Assert.assertEquals("Lisaja: Publisher Publisher", creatorName);

	}
	
	@Test
	public void checkIfMaterialIsDeleted() {

		String validationError = goToLandingPage()
				.chooseUserType("SmallPublisher")
				.getFabButton()
				.moveCursorToAddPortfolio()
				.moveCursorToAddMaterial()
				.clickAddMaterial()
				.insertDeletedMaterialUrl()
				.getValidationError();

		Assert.assertEquals("Selline link on kustutatud materjalide nimekirjas", validationError);

	}
	
	@Test
	public void checkIfMaterialExists() {

		String existingMaterial = goToLandingPage()
				.chooseUserType("SmallPublisher")
				.getFabButton()
				.moveCursorToAddPortfolio()
				.moveCursorToAddMaterial()
				.clickAddMaterial()
				.insertExistingMaterialUrl()
				.getExistingMaterialValidationError();

		Assert.assertEquals("Selline materjal on juba olemas", existingMaterial);

	}
	
	@Test
	public void createMaterialThroughPortfolioAsAdmin() {

		boolean isMaterialBoxIsDisplayed = goToLandingPage()
				.chooseUserType("Admin")
				.getFabButton()
				.clickAddPortfolio()
				.uploadPhoto()
				.insertPortfolioTitle()
				.selectEducationalContext()
				.selectSubjectArea()
				.selectAgeGroup()
				.addDescription()
				.clickCreatePortfolioButton()
				.setChapterTitle()
				.clickAddMaterial()
				.setHyperLink()
				.setMaterialTitle()
				.addDescription()
				.clickNextStep()
				.clickNextStep()
				.insertAuthorsName()
				.insertAuthorsSurname()
				.insertPublishersName()
				.clickAddMaterial()
				.clickExitAndSave()
				.getPrivacyConfirmationPopup()
				.makePortfolioPublic()
				.isMaterialBoxIsDisplayed();

		assertTrue(isMaterialBoxIsDisplayed);

	}
	

	@Test
	public void selectAndAddMaterialToTheExistingPortfolio() {

		String successMessage = goToLandingPage()
				.chooseUserType("SmallPublisher")
				.getLeftMenu()
				.clickMyMaterials()
				.clickToSelectMaterial()
				.selectPortfolio()
				.selectChapter()
				.clickDone()
				.getSuccessMessage();

		Assert.assertEquals("Materjal(id) edukalt lisatud", successMessage);

	}
	
	@Test
	public void markMaterialAsPreferred() {

		String likesNumber = goToLandingPage()
				.chooseUserType("SmallPublisher")
				.getLeftMenu()
				.clickMyMaterials()
				.openMaterial()
				.likeMaterial()
				.getLikesNumber();

		Assert.assertEquals("1", likesNumber);

	}
	
	@Test
	public void addTagToMaterial() {

		MaterialPage tagsAmount = goToLandingPage()	
				.chooseUserType("SmallPublisher")
				.getFabButton()
				.moveCursorToAddPortfolio()
				.moveCursorToAddMaterial()
				.clickAddMaterial()
				.setHyperLink()
				.setMaterialTitle()
				.addDescription()
				.clickNextStep()
				.insertTagAndEnter()
				.selectEducation()
				.selectSubjectArea()
				.selectTargetGroup()
				.clickAddMaterial();
				
	int initialTagsAmount = tagsAmount.getTagsCount();
	    
	          tagsAmount = tagsAmount
	        		  
	            .selectActionFromMenu()
	            .clickEditMaterial()
	            .clickNextStep()
	            .insertTagAndEnter()
	            .clickUpdateMaterial();
	            
	int newTagsAmount = tagsAmount.getTagsCount();         
	            
			 
		assertTrue(initialTagsAmount + 1 == newTagsAmount);

	}
	

	@Test
	public void addMaterialToFavoritesAndRemoveFromFavorites() {
		
		boolean starIsSelected = goToLandingPage()
				.chooseUserType("Moderator")
				.getLeftMenu()
				.clickMyMaterials()
				.clickToSelectStar()
				.openMaterial()
				.starIsSelected();

		assertTrue(starIsSelected);
		
		boolean starIsUnselected = goToLandingPage()
				.chooseUserType("Moderator")
				.getLeftMenu()
				.clickMyMaterials()
				.openMaterial()
				.unselectStar()
				.starIsUnselected();

		assertTrue(starIsUnselected);

	}
	
	@Test
	public void showMoreButtonIsDisplayed() {

		boolean showMoreButtonIsDisplayed = goToLandingPage()
				.chooseUserType("SmallPublisher")
				.getLeftMenu()
				.clickMyMaterials()
				.openMaterial()
				.insertTags()
				.showMoreButtonIsDisplayed();
				
		assertTrue(showMoreButtonIsDisplayed);


	}
	


	

}