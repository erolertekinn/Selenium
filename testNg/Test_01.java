package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test_01 {
  @Test
  public void test1() {
	  System.out.println("ilk test");
  }
  @Test
  public void test2() {
	  System.out.println("ikinci test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Metod'dan �nce");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Metod'dan sonra");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Test'den �nce");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Test'den sonra");
  }

}
