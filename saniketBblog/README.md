This is the small testng framework design to Bblog website

In this project we have three packages given below:-

1. Bblog.Basepage
2  Bblog.Testcase
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
