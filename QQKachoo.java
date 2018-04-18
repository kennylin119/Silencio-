public class QQKachoo<D> implements Deque<D> 
{

    private LLNode<T> _front, _end; 
    private int _size; 
    
    //default constructor, empty queue
    public QQKachoo(){
	_front = new LLNode<T>(null,null);
	_end = new LLNode<t>(null, null);
	_size = 0;
    }
    
    public T getFirst() {
	return _front.getValue();
    }
    public T getLast(){
	return _end.getValue();
    }

}
