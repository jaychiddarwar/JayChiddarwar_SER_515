import java.io.File;
import java.util.HashMap;
import java.util.Scanner;


public class Login {
    int userType;
    public String BUYER_INFO = "BuyerInfo.txt";
    public String SELLER_INFO = "SellerInfo.txt";
    public Login(){
        userType = -1;
    }
    public int login(){
        Scanner sn = new Scanner(System.in);
        String userName, password;
        System.out.print("Enter UserName : ");
        userName = sn.next();
        System.out.print("Enter Password : ");
        password = sn.next();

        userType = validation(userName, password);
        if (userType != -1){
            System.out.println("Validation Successful");
        }
        else{
            System.out.println("Validation Failed");
        }
        return userType;


    }

    public int validation(String username, String password){
        HashMap<String, String> buyerList = new HashMap<>();
        HashMap<String, String> sellerList = new HashMap<>();

        try{
            File fin = new File(BUYER_INFO);
            Scanner freader = new Scanner(fin);
            while(freader.hasNextLine()){
                String[] temp = freader.nextLine().split(":");
                buyerList.put(temp[0], temp[1]);
            }
            freader.close();
            File fin2 = new File(SELLER_INFO);
            Scanner freader2 = new Scanner(fin2);
            while(freader2.hasNextLine()){
                String[] temp = freader2.nextLine().split(":");
                sellerList.put(temp[0],temp[1]);
            }
            freader.close();

        }catch (Exception e){
            System.err.println(e);
        }
        if (buyerList.containsKey(username) && buyerList.get(username).equals(password)){
            return 0;
        }
        else if (sellerList.containsKey(username) && sellerList.get(username).equals(password)){
            return 1;
        }
        return -1;

    }
}
