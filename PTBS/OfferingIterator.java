import java.util.Iterator;

public class OfferingIterator extends OfferingList implements ListIterator{
    @Override
    public boolean hasNext(Iterator iterator) {
        return false;
    }

    @Override
    public Offering Next(Iterator iterator) {
        return null;
    }

    @Override
    public void MoveToHead(Iterator iterator) {

    }

    @Override
    public void Remove(Iterator iterator) {

    }
}
