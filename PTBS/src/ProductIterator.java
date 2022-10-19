import java.util.Iterator;

public class ProductIterator extends ClassProductList implements ListIterator{
    @Override
    public boolean hasNext(Iterator iterator) {
        return iterator.hasNext();
    }

    @Override
    public String Next(Iterator iterator) {
        if(this.hasNext(iterator)) {
            return (String) iterator.next();
        } else {
            return null;
        }
    }

    @Override
    public void MoveToHead(Iterator iterator) {
        System.out.println("Head is Moved");
    }

    @Override
    public void Remove(Iterator iterator) {
        if (this.hasNext(iterator)) {
            iterator.next();
        }

    }
}
