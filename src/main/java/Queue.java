public class Queue<T>
{
	private class Node<T>
	{
		private T val;
		private Node<T> next;

		private Node(T val, Node<T> node)
		{
			this.val=val;
			next=node;
		}
	}

	private Node<T> head = null;
	private Node<T> tail = null;

	public Queue()
	{

	}

	/**Adds val to the end of the queue
	 */
	public void push(T val)
	{
		if (head==null)
		{
			head= new Node<>(val, null);
			tail=head;
		}
		else
		{
			tail.next= new Node<>(val, null);
			tail=tail.next;
		}
	}

	/**
	 * removes and returns the oldest value in the queue
	 * throws QueueUnderFlowException if the queue is empty
	 */
	public T pop() throws QueueUnderFlowException
	{
		if (head==null)
		{
			throw new QueueUnderFlowException();
		}

		T value=head.val;
		head=head.next;

		if (head==null)
		{
			tail=null;
		}

		return value;
	}

	/**
	 * returns true if the queue is empty
	 */
	public boolean isEmpty()
	{
		return head==null;
	}
}
