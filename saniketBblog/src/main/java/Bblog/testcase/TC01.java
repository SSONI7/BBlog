package Bblog.testcase;


import org.testng.annotations.Test;

import Bblog.basepage.Bblog_FirstMain_Page;
import Bblog.basepage.Bblog_SignIn_Page;



public class TC01 extends CommonClass {

	public static String website;
	 
  @Test
  public void BblogTestCase(){
	
	  
	  Bblog_SignIn_Page signin = new  Bblog_SignIn_Page(driver);
	  Bblog_FirstMain_Page mainpage = new Bblog_FirstMain_Page(driver);
	  
	  
      signin.open();
	  signin.SignInMethod();
	  mainpage.NewPostLink();
	  mainpage.CreatePost();
	  mainpage.EditPost();
	  mainpage.ScrollDown();
	  mainpage.VerifingTag();
	  mainpage.Scrollup();
	  mainpage.NameLink();
	  mainpage.FavouriteClick();
	  mainpage.FavouriteSection();
	  mainpage.VerifingArticle();
	  mainpage.DeleteArticle();
	 
  }



}
