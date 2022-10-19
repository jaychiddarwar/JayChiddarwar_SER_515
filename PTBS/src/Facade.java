import java.util.Iterator;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	private int attribute6;

	private Reminder reminder;

	public Facade(){
		System.out.println("Facade Pattern has started ....\n");
	}

	public int login(Login login) {
		return login.login();
	}

	public void startFacade(){
		Login login = new Login();
		UserType = login.login();
		boolean flag = true;
		System.out.println("User is : " + UserType);
		if(UserType == 0){
			System.out.println("User is Buyer\n");
		}else if (UserType == 1){
			System.out.println("User is Seller\n");
		}
		else {
			System.out.println("Wrong input");
			flag = false;
		}

		if (flag){
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
	//			System.out.println("Visitor pattern Started ......");
			}
			Person person;
	//		System.out.println("\nBridge Pattern implemented .... \n");
			if(UserType == 0){
				person = new Buyer();
			}else {
				person = new Seller();
			}
			ProductMenu productMenu ;
			if(nProductCategory == 0){
				productMenu = new MeatProductMenu();
			}else {
				productMenu = new ProduceProductMenu();
			}

			System.out.println("\nVisitor Pattern implemented ......\n");
			remind();
			System.out.println("\nIterator Pattern implemented .......\n");
	//		productMenu.showMenu();
			ClassProductList productList = new ClassProductList(productMenu);
			Iterator iterator = productList.createIterator();
			ProductIterator productIterator = new ProductIterator();
			System.out.println("\n Menu is : ");
			while(productIterator.hasNext(iterator)){
				System.out.println(productIterator.Next(iterator));
			}

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

	public void remind() {
		ReminderVisitor reminderVisitor = new ReminderVisitor();
		ClassProductList productList = new ClassProductList();
		productList.acccept(reminderVisitor);


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
