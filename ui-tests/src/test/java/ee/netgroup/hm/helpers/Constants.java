package ee.netgroup.hm.helpers;

import org.openqa.selenium.By;

public class Constants {
	

<<<<<<< HEAD
	public static String landingPage = "https://sitenamehidden/";
=======
	public static String landingPage = "https://sitenamehidden.com/";
>>>>>>> edf82b9f33966d063b12e82a302c71034ea4cbe4
	public static String materialWithCommentsUrl = "https://sitenamehidden/material?id=11632";
	
	// Users
	public static String admin = "https://sitenamehidden/dev/login/89898989898";
    public static String publisher = "https://sitenamehidden/dev/login/12345678900";
    public static String user = "https://sitenamehidden/dev/login/38202020234";
    public static String moderator = "https://sitenamehidden/dev/login/35012025932";
    public static String restricted = "https://sitenamehidden/dev/login/89898989890";
    
    public static String mobileIdCode = "11412090004";
    public static String mobilePhoneNumber = "+37200000766";
    public static String mobileIdUser = "Mary Änn O’connež-Šuslik";
    
    public static String eSchoolUser = "test.test";
    public static String eSchoolPswd = "test";
    public static String eSchoolUserName = "Test Test";
    
    public static String stuudiumUser = "Test";
    public static String stuudiumPswd = "meie test";
    
    public static By loginConfirmationText = By.xpath("//span[contains(text(), 'Oled sisse loginud')]");
    public static String logInModalTitleText = "Kõigepealt palun tuvasta enda isik.";
    
   // Search
    public static String searchTag = "epic"; 
    public static String searchPublisher = "Pegasus";

    // Notifications
    public static By toastText = By.cssSelector("span.md-toast-text");
    public static String reportedText = "Teade saadetud administraatorile";
    
    // Open first portfolio or material on the list
    public static By firstPortfolio = By.xpath("//dop-card-media[@data-learning-object='learningObject']");
    public static By firstMaterial = By.xpath("//dop-card-media[@data-learning-object='learningObject']");
    
    // Detail view 
    public static By actionsMenu = By.xpath("//md-icon[text()='more_vert']");
	public static String unreviewedBannerText = "See õppevara on üle vaatamata";
	public static Object deletedBannerText = "See õppevara on kustutatud";
	public static String changedLOBannerText = "Õppevara liigitus. Lisatud väärtus: Keel ja kirjandus";
	public static String commentText = "Automaattesti lisatud kommentaar";
    public static String systemTag = "keel ja ki";
    public static By bannerToolbar = By.xpath("//md-toolbar[@class='error-message _md _md-toolbar-transitions']");
    public static By bannerText = By.id("error-message-heading");
    
    // Materials
    public static String deletedMaterial = "https://www.gfycat.com/gifs/search/pug/detail/RingedWarpedCrayfish";
    public static String existingMaterial = "https://test.ee";
    
    

	

    
    
}
