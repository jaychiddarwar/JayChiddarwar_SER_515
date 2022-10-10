public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProjecutList theProjectList;

	private Person thePerson;

	private int attribute6;

	public int login(Login login) {
		return login.login();
	}

	public void startFacade(){
		System.out.println("Facade ==>");
		UserType = login(new Login());
		System.out.println("User is : " + UserType);


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
