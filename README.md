# BBlog

This is the small testng framework design to Bblog website

In this project we have three packages given below:-

1. Bblog.Basepage
2. Bblog.Testcase
3. Bblog.Util

in Util package i have created the class for browser selection this package is for common utilities used in the framework.
after that we have basepage package in which i used PageFactory(POM) design for pages to identify all the web element.
and also created the methods used on that page which further used in the testcases.
Now last is testcase package. In this package i have created the testcases and common class. In common class TestNG annontations are used so that
we can easly know which method is going to run next and its easy for the compiler to identify the errors.
i extend the testcase class with the common class and we create the object of the basepages too. So that we can call the method from the basepage.
i have also created some folder like lib in which i have put the chomredriver.exe file and respoitory folder conatins all the jar files used in the framework.
if by mistake any jar file is missed so we can get it from that folder. TestNg.xml file is created so that we can create the testcase suit and run it.
i have created only one test case so i am using this testNG.xml file to run and generate the testNG report.
For that we have to run the testcase by testNG.xml file and after run the testcase refersh the project and go to test-output>>emailable-report.html.
Double click on the file to open the report.At the end we have have POM.xml file which contains all the dependencies which is used in the framework.

NOTE:- Please run this automated script on chorme beacuse i didnt configure for other browser right now.

Steps to import the project:-

1.Click File > Import.

2.In the Import wizard:

   a. Click Git > Projects from Git and then click Next.

   b. Click Clone URI and click Next.    

   c. In the Source Git Repository window, in the URI field, enter an existing Git repository URL and click Next.
   
   d. In the Branch Selection window, Select Master from the remote repository and click Next.
   
   e. In the Local Destination window, ensure that the directory that you want to set as the local storage location for the repository is selected in the Directory field. Or, click Browse to select the location.

   f. The Cloning from <GitHub_repository> window shows the progress of the cloning process.

   g. In the Select a wizard to use for importing projects window, Import as general project is selected by default. Click Next.

   h. In the Import Projects window, ensure that the Directory field shows the path to the directory where you want to import the projects and click Finish. Result: The imported project is listed in the Project Explorer view. The cloned repository of the remote Git repository is now located in the local file system.
