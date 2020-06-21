package Bblog.basepage;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Bblog.util.CommonMethods;
import Bblog.util.PropertiesFiles;



public class Bblog_FirstMain_Page {
	
	
	static WebDriver driver;

	Properties testdata = PropertiesFiles.readPropertiesFiles();

	
	  public Bblog_FirstMain_Page(WebDriver driver){ 
		  
       Bblog_FirstMain_Page.driver = driver;
	   PageFactory.initElements(driver, this);
	  
	  }
	  
	  CommonMethods CMethod = new CommonMethods(driver);

	@FindBy(xpath = "/html/body/app-root/app-navbar/nav/div/ul/li[2]")
	WebElement SignIn;
	
	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	WebElement SignUp;
	

	@FindBy(xpath = "//a[contains(text(),'New Post')]")
	WebElement NewPost;
	
	@FindBy(xpath = "//input[@placeholder='Article Title']")
	WebElement ArticleTitle;
	
	@FindBy(xpath = "//input[@placeholder=\"What's this article about?\"]")
	WebElement AboutArticle;
	
	@FindBy(xpath = "//textarea[@placeholder='Write your article (in markdown)']")
	WebElement Article;
	
	@FindBy(xpath = "//input[@placeholder='Enter Tags']")
	WebElement Tags;
	
	@FindBy(xpath = "//button[@class='btn btn-lg pull-xs-right btn-primary']")
	WebElement PublishArticle;
	
	@FindBy(xpath = "//div[@class='article-actions']//a[@class='btn btn-sm btn-outline-secondary'][contains(text(),'Edit Article')]")
	WebElement PostEdit;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement HomeLink;
	
	@FindBy(xpath = "//a[contains(text(),'Avengers')]")
	WebElement PopularTag;
	
	@FindBy(xpath = "//a[contains(text(),'saniket')]")
	WebElement SaniketLink;
	
	@FindBy(xpath = "//button[@class='btn btn-sm pull-xs-right btn-outline-primary']")
	WebElement favoriteButton;
	
	@FindBy(xpath = "//a[contains(text(),'Favorited Articles')]")
	WebElement favouriteSectionLink;
	
	@FindBy(xpath = "//h1[contains(text(),'Avengers assembleEdited')]")
	WebElement ArticleAddToFavourite;
	
	@FindBy(xpath = "//div[@class='article-actions']//button[@class='btn btn-sm btn-outline-danger'][contains(text(),'Delete Article')]")
	WebElement DeleteButton;
	
	
	
	public void SignInLink() {
		CMethod.waitAndClick(SignIn, 20);
		//SignIn.click(); 
	}
	
	public void SignUpLink() {
		CMethod.waitAndClick(SignUp, 20);
	//	SignUp.click();
	}
	
	public void NewPostLink() {
		
		try {
			
			Thread.sleep(5000);
			NewPost.click();
			System.out.println("Clicked on New post to publish");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(" InterruptedException is handled");
		}
		
		
	}
	
	public void CreatePost() {
		
		try {
			Thread.sleep(2000);
			
			String title = testdata.getProperty("article_title");
			String about = testdata.getProperty("about_article");
			String body = testdata.getProperty("article_body");
			String tags = testdata.getProperty("tag");
			
			ArticleTitle.sendKeys(title);
			AboutArticle.sendKeys(about);
			Article.sendKeys(body);
			Tags.sendKeys(tags);
			Thread.sleep(2000);
			PublishArticle.click();
			
			System.out.println("Article is published");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(" InterruptedException is handled");
		}
		
		
	}
	
	public void EditPost() {
		
		try {
			
		    Thread.sleep(2000);
			PostEdit.click();
			Thread.sleep(2000);
			System.out.println("Editing the published post");
			ArticleTitle.sendKeys("".concat("Edited"));
			System.out.println("Title of the article is edited");
			PublishArticle.click();
			Thread.sleep(2000);
			System.out.println("Article is re-published after edit");
			HomeLink.click();
			
			}catch( InterruptedException e) {
				
				System.out.println(" InterruptedExceptio is handled");
			}
			
	}
	
	
	   public void ScrollDown() {
		
			try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,7000)");
			Thread.sleep(2000);
			}catch( InterruptedException e) {
				
				System.out.println("InterruptedException is handled");
		
		}
	
	
	}
	
      public void Scrollup() {
		
			try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(7000,0)");
			Thread.sleep(2000);
			}catch( InterruptedException e) {
				System.out.println(" InterruptedException is handled");
	
	}
	
	
	}
	
	public  void VerifingTag() {
		
		String ExpectedTag = "Avengers";
		String ActualTag = PopularTag.getText();
		//System.out.println(ActualTag);
		
		if(ExpectedTag.equals(ActualTag)) {
			System.out.println("Verified:- Avenger Tag is added to the Popular Tags");
		}else {
			System.out.println("Failed:- Tag Not Found");
		}
		
	}
	
		public void NameLink() {
			SaniketLink.click();
			System.out.println("Click on Name:- saniket link");
		}
	
		
		public void FavouriteClick() {
			try {
				Thread.sleep(2000);
				favoriteButton.click();
				Thread.sleep(2000);
				System.out.println("Clicked on Favourite button");
			}catch(InterruptedException e) {
				System.out.println("InterruptedException is handled");
			}
			
		}
		
		public void FavouriteSection() {
			
			try {
				favouriteSectionLink.click();
				Thread.sleep(2000);
				System.out.println("Click On Favourite section");
			}catch(InterruptedException e) {
				System.out.println("InterruptedException is handled");
			}
			
		}
		
		public void VerifingArticle() {
			
			String ExpectedText = "Avengers assembleEdited";
			String ActualText = ArticleAddToFavourite.getText();
			
			if (ExpectedText.equals(ActualText)) {
				System.out.println("Article added to favourite section");
			}else {
				System.out.println("Article is not added to the favourite section");
			}
			
			
		}
		
		public void DeleteArticle() {
			
			try {
				Thread.sleep(2000);
				ArticleAddToFavourite.click();
				Thread.sleep(2000);
				DeleteButton.click();
				System.out.println("OOps!!!!!  Article Deleted at the end");
			}catch(InterruptedException e) {
				System.out.println("InterruptedException is handled");
			}
			
		}
	
			
}
