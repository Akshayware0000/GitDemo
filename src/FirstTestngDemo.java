import org.testng.annotations.Test;

public class FirstTestngDemo {
	@Test(priority = 3, description = "this test case will define login scenario")
	public void Login() {
		System.out.println("Login to Flipcart");
	}

	@Test
	public void selectItem() {
		System.out.println("Select item");
	}

	@Test(priority = 1)
	public void checkout() {
		System.out.println("check out");
	}

}
