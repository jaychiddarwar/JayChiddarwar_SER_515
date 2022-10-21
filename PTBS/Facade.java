import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
//		System.out.println("User is : " + UserType);
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
			System.out.println("\nMenu is : ");
			Integer counter = 0;
			while(productIterator.hasNext(iterator)){
				System.out.println(++counter + " " + productIterator.Next(iterator));
			}
			String username = Login.userName;
//			System.out.println("\nMenu for User `" + username + "` is :");
			HashMap<String, List<String>> userProducts = userProduct();
			List<String> userSpecificProducts = userProducts.get(username);
			System.out.println("\nProducts of user `" + username + "` in UserProduct are :");
			int i = 0;
			for(String val: userSpecificProducts){
				System.out.println(++i + " " + val);
			}




		}





	}

	public  static HashMap<String, List<String>> userProduct () {
		HashMap<String, List<String>> userProducts = new HashMap<>();
		try {
			File userProductFile = new File("UserProduct.txt");
			Scanner filereader = new Scanner(userProductFile);
			while (filereader.hasNextLine()) {
				String val[] = filereader.nextLine().split(":");
				if (userProducts.containsKey(val[0])) {
					userProducts.get(val[0]).add(val[1]);
				} else {
					userProducts.put(val[0], new ArrayList<>(Arrays.asList(val[1])));
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return userProducts;
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
