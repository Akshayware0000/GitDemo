package test1Practice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {
	// under Car loan suit we can write multiple test cases as methods like follows:
	@Test(groups = { "Smoke" })
	public void CarLoanLogIn() {
		System.out.println("car loan related code..");
	}

	@BeforeClass
	public void Bfrclass() {
		System.out.println("this is before class method");
	}

	@Parameters({ "URL" })
	@Test
	public void CarLoanTypes(String URLname) {
		// code
		System.out.println("car loan types related code..");
		System.out.println(URLname);
	}

	@AfterClass
	public void AftrClass() {
		System.out.println("This is aftr class method");
	}

	@Test
	public void UsedCarsLoan() {
		// code
		System.out.println("used car loan related code..");
		Assert.assertTrue(false);
		
	}

}