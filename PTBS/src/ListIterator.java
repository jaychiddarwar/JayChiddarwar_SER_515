import java.util.Iterator;

public interface ListIterator {
    public boolean hasNext(Iterator iterator);
    public Object Next(Iterator iterator);
    public void MoveToHead(Iterator iterator);
    public void Remove(Iterator iterator);
}
