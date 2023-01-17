package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
   @Test
   public void testCase1() {
	   System.out.println("This is the Mohan");
   }
   
   @AfterMethod
   public void afterMethod() {
	   System.out.println("This is the krishna");
   }
  
   @BeforeMethod
   public void beformethod() {
	   System.out.println("This is the Krish");
   }
   
   @AfterClass
   public void AfterMethod() {
	   System.out.println("This is the Mohan Krishna");
   }
   
   @BeforeClass 
   public void Beforeclass() {
	   System.out.println("This is the subbu");
   }
   
   @AfterTest
   public void AfterTest() {
	   System.out.println("This is Doctor");
   }
   
   @BeforeTest
   public void BeforTest() {
	   System.out.println("This is Babu");	   
   }
   
   @AfterSuite
   public void Aftersuite() {
	   System.out.println("This is the Doctor Babu");
   }
   
   @BeforeSuite
   public void Beforsuite() {
	   System.out.println("This is the Nagi Babu");
   }
   
   @BeforeGroups
   public void BeforeGroups() {
	   System.out.println("The is the Vasid");
   }
   
   @AfterGroups
   public void AfterGroups() {
	   System.out.println("This is the SubbuParvathi");
   }
   
}
