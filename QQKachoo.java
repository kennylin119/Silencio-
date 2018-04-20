public class QQKachoo<T> implements Deque<T> 
{

    private DLLNode<T> _front, _end; 
    private int _size; 
    
    //default constructor, empty queue
    public QQKachoo(){
	_front = new DLLNode<T>(null,null,null);
	_end = new DLLNode<T>(null, null,null);
	_size = 0;
    }
    
    public T getFirst() {
	return _front.getCargo();
    }
    public T getLast(){
	return _end.getCargo();
    }
    public void addFirst(T item) {
	if ( _size == 0 ) {
	    _front = _end = new DLLNode<T>(item, null, null);

	}
	else{
	    DLLNode<T> temp = new DLLNode<T>(item, _front, null);
	    _front.setNext(temp);
	    _front = temp;
	}
	_size++;
    }

    public void addLast(T item){
	if ( _size == 0 ) {
	    _front = _end = new DLLNode<T>(item, null, null);

	}
	else{
	    DLLNode<T> temp = new DLLNode<T>(item, null, _end);
	    _end.setPrev(temp);
	    _end = temp;
	}
	_size++;
    }

    public T removeFirst(){
	T ret = _front.getCargo();
	_front = _front.getPrev();
	_front.setNext(null);
	_size--;
	return ret;
    }
    
    public T removeLast(){
	T ret = _end.getCargo();
	_end = _end.getNext();
	_end.setPrev(null);
	_size--;
	return ret;
    }

    public String toString(){
	DLLNode<T> node = _front;
	String ret = node.getCargo() + "\n";
   	while(node.getPrev()!= null){
	    node = node.getPrev();
	    ret += node.getCargo() + "\n";
	}
	return ret;
    }
    
    public static void main(String args[]){
	QQKachoo test = new QQKachoo<Integer>();
	for(int i=0; i<10; i++){
	    test.addFirst(i);
	}
	System.out.println(test);

	for(int i=0; i<10; i++){
	    test.addLast(i);
	}
	System.out.println(test);
	
	for(int i=0; i<5; i++){
	    test.removeFirst();
	}
	System.out.println(test);

	for(int i=0; i<5; i++){
	    test.removeLast();
	}
	System.out.println(test);
	
    }

	


}
