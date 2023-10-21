


public class LinkedList<T> implements ListInterface<T> {

	private Node<T> first;
	private Node<T> last;
	private int numberOfElements;
	
	public LinkedList(){
		initiliaze();
	}
	
	@Override
	public void add(T newEntry) {
		Node<T> n = new Node<>(newEntry);
		if(isEmpty()){
			first = n;
			last = n;
		}
		
		else{
			Node<T> lastNode = last;
			lastNode.setNextNode(n);
			last = n;
		}
		numberOfElements++;
		
	}

	@Override
	public void add(int newPosition, T newEntry) {
		if(newPosition>=1 && newPosition<= numberOfElements+1)
		{
			Node<T> newNode = new Node<T>(newEntry);
			
			if(newPosition ==1 )
			{
				newNode.setNextNode(first);
				first = newNode;
			}
			else
			{
				Node<T> prev = getNodeAt(newPosition-1);
				Node<T> after = prev.getNextNode();			
				newNode.setNextNode(after);
				prev.setNextNode(newNode);	
			}
			numberOfElements++;	
		}
		else
		{
			throw new IndexOutOfBoundsException("Index is out of bound.");
		}
			
		}

	@Override
	public T remove(int givenPosition) {
		T toRemove = null;
		
		if(givenPosition >= 1 && givenPosition <= numberOfElements){
		
			if(givenPosition == 1){
				toRemove = first.getData();
				first = first.getNextNode();
			}
			
			else{
				Node<T> before = getNodeAt(givenPosition - 1);
				toRemove = getNodeAt(givenPosition).getData();
				
				Node<T> after = getNodeAt(givenPosition + 1);
				before.setNextNode(after);
			}
		}
		// TODO Auto-generated method stub
		numberOfElements--;
		return toRemove;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		initiliaze();
	}

	@Override
	public T replace(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		T toReturn = null;
		if(givenPosition >= 1 && givenPosition <= numberOfElements){
			toReturn = getNodeAt(givenPosition).getData();
			getNodeAt(givenPosition).setData(newEntry);
			return toReturn;
		}
		else throw new IndexOutOfBoundsException("Index is not valid.");
	}

	private void initiliaze(){
		first = null;
		last = null;
		numberOfElements = 0;
	}
	
	@Override
	public T getEntry(int givenPosition) {

		

		if(givenPosition >= 1 && givenPosition <= numberOfElements){
		// TODO Auto-generated method stub
			return getNodeAt(givenPosition).getData();
		}
		else throw new IndexOutOfBoundsException("Index is not valid.");
	}
	
	private Node<T> getNodeAt(int position){
		Node<T> n = first;
		for (int i = 1; i < position; i++) {
			n = n.getNextNode();
		}
		
		return n;
	}
	
	@Override
	public T[] toArray() {

		T[] arr = (T[]) new Object [numberOfElements];
		Node<T> current = first;
		int i = 0;
		
		while (current != null){
			arr[i] = current.getData();
			++i;
			current = current.getNextNode();
		}
		return arr;
		
	
	}

	@Override
	public boolean contains(T anEntry) {
		boolean isFound = false;
		
		Node<T> current = first;
		while(current != null) {
			if(current.getData().equals(anEntry)) {
				isFound = true;
				break;
			}
			current = current.getNextNode();
		}
		
		return isFound;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return numberOfElements;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numberOfElements == 0;
	}

}
