public interface Deque<T>
{
    public T getFirst();

    public T getLast();
    
    public void addFirst(T item);
    
    public void addLast(T item);
    
    public T removeFirst(); 
    
    public T removeLast();

}
