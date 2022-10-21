import java.util.Iterator;
import java.util.List;

public class ClassProductList {
    private List<String> productList;
    public ClassProductList (ProductMenu productMenu){
        this.productList = productMenu.getProductList();
    }

    public ClassProductList() {

    }

    public void accept(NodeVisitor visitor){

    }

    public Iterator createIterator(){
        return this.productList.iterator();
    }

    public Reminder acccept(NodeVisitor nodeVisitor){
        System.out.println("Product List Reminder ...");
        return nodeVisitor.visitProduct(productList);
    }
}
