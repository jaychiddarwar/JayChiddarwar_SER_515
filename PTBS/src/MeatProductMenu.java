import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MeatProductMenu implements  ProductMenu{
    final public String PRODUCT_INFO = "ProductInfo.txt";
    final public String PRODUCT = "Meat";

    public MeatProductMenu(){
        System.out.println("Factory Method started ...");
    }
    @Override
    public void showMenu() {
        ArrayList<String> productList = new ArrayList();
        try{
            File fin = new File(PRODUCT_INFO);
            Scanner freader = new Scanner(fin);
            while(freader.hasNextLine()){
                String[] temp = freader.nextLine().split(":");
                if (temp[0].equalsIgnoreCase(PRODUCT)){
                    productList.add(temp[1]);
                }
            }
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.println(PRODUCT + " Menu is : ");
        int counter = 1;
        for (String s :productList){
            System.out.println("" + counter++ + " " + s);
        }


    }

    @Override
    public void showAddButton() {

    }

    @Override
    public void showViewButton() {

    }

    @Override
    public void showRadioButton() {

    }

    @Override
    public void showLabels() {

    }

    @Override
    public void showComboxes() {

    }
}
