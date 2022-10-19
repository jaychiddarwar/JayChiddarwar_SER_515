import java.util.List;

public abstract class NodeVisitor {
    public abstract Reminder visitProduct(List<String> product) ;
    public void visitTrading(Trading trading){

    }
    public void visitFacade(Facade facade){

    }
}
