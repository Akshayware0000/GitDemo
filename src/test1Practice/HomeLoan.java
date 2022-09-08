package test1Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeLoan {
	@Test(dataProvider="getData")
	public void HomeLoanLogIn(String usrnm,String passwrd) {
		System.out.println("home loan LogIN");
		System.out.print(usrnm +" ");
		System.out.println(passwrd);
	}

	@DataProvider
	public Object[][] getData() {
		Object [][]data =new Object[3][2];
		//If we want to run TC 3 times with 3 diff Username and password
		//columns: No. of data Types(1.Username, 2.Password)
		//Rows: How many Data types(How many users)
		data[0][0]= "1st Username";
		data[0][1]="1st Password";
				data[1][0]="2nd Username";
				data[1][1]="2nd Password";
					data[2][0]="3rd Username";
					data[2][1]="3rd Password";
		return data;
	}
	
	
	@BeforeSuite
	public void BfrSuit() {
		System.out.println("this is before suite....This will print before all classes");
	}

	@Test(groups = { "Smoke" })
	public void homeLoanTypes() {
		// code
		System.out.println("home loan types related code..");
	}

	@AfterMethod
	public void AftrMethd() {
		System.out.println("This is aftr method");
	}

	@Test
	public void HomeLoanInterests() {
		// code
		System.out.println("home loan interest related code..");
	}

}