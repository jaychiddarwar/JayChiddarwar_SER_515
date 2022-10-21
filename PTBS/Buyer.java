import java.util.List;

public class Buyer extends  Person{
    private Offering offering;
    public Buyer(){
        System.out.println("\nBridge Pattern implemented ....\n");
    }
    @Override
    public void showMenu() {

    }

    @Override
    public void showLabels() {

    }

    @Override
    public void showComboxes() {

    }

    @Override
    public List<String> getProductList() {
        return null;
    }

    @Override
    public ProductMenu CreateProductMenu() {
        return null;
    }
}
