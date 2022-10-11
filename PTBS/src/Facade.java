import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	private int attribute6;

	public int login(Login login) {
		return login.login();
	}

	public void startFacade(){
		System.out.println("Facade ==>");
		UserType = login(new Login());
		System.out.println("User is : " + UserType);

		while(true){
			System.out.println("Select Product from following : \n 0. Meat Product \n 1. Produce Product");
			Scanner sn = new Scanner(System.in);
			String inp1 = sn.nextLine();
			if (inp1.equalsIgnoreCase("meat product") || inp1.equalsIgnoreCase("0")){
				nProductCategory = 0;
				break;
			}else if (inp1.equalsIgnoreCase("produce product") || inp1.equalsIgnoreCase("1")){
				nProductCategory = 1;
				break;
			}else {
				System.out.println("Wrong Input Selected, select again");

			}
			System.out.println("visitor pattern");
		}



	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remid() {

	}

	public void createUser(UserInfoItem userinfoItem) {

	}

	public void createProdocutList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
