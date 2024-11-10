package javafoundations;

import javafoundations.exceptions.*;

/*
 * A linked implementation of the Queue Interface.
 * */
public class LinkedQueue<T> implements QueueADT<T>
{
    private int count;
    private LinearNode<T> front, rear;

    /**
     * Constructor
     * Creates an empty queue.
     */
    public LinkedQueue()
    {
        count = 0;
        front = rear = null;
    }

    /**
     * Adds the specified element to the rear of the queue.
     *
     * @param The element to be enqueued into the queue
     */
    public void enqueue (T element)
    {
        LinearNode<T> node = new LinearNode<T>(element);

        if (count == 0)
            front = node;
        else
            rear.setNext(node);

        rear = node;
        count++;
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return the element removed from the front of the queue.
     * @throws EmptyCollectionException if this queue is empty
     */
    public T dequeue()
    {
        //if queue is empty, throw an exception
        if (count == 0)
            throw new EmptyCollectionException (
                "dequeue() failed: the queue is empty.");
        //otherwise...
        T temp = front.getElement();
        front = front.getNext();
        if (count == 1) rear = null; //don't we also need this???
        count--;
        return temp;
    }

    /**
     * Returns the element at the front of the queue
     * without removing it.
     * @return the element at the front of the queue
     * @throws EmptyCollectionException if this queue is empty
     */
    public T first()
    {
        if (count == 0)
            throw new EmptyCollectionException (
                "first() failed: the queue is empty.");

        return front.getElement();
    }

    /**
     * Returns true if the queue contains no elements,
     *  false otherwise.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty()
    {
        return count == 0;
    }

    /**
     * Returns the number of elements in the queue.
     *
     * the number of elements in the queue
     */
    public int size()
    {
        return count;
    }

    /**
     * Returns a string representation of the queue.
     *
     * a string representation of the queue.
     * each element appears in its own line
     */
    public String toString()
    {
        String result = "<front of queue>\n";
        LinearNode<T> current = front;
        while(current != null)
        {
            result += current.getElement() + "\n";
            current = current.getNext();
        }

        return result + "<rear of queue>";
    }

    public static void main(String[] args) {
        LinkedQueue<String> q1 = new LinkedQueue<String>();

        //test enqueue(), toString() and dequeue() on empty,
        //singleton and queue with 3 elements
        q1.enqueue("hello1");
        q1.enqueue("hello2");
        q1.enqueue("hello3");

        System.out.println("printing q1:\n" + q1);
        try {
            System.out.println();
            System.out.println("dequeued: " + q1.dequeue());
            System.out.println(q1);
            System.out.println();

            System.out.println("dequeued: " + q1.dequeue());
            System.out.println("printing q1:\n" + q1);
            System.out.println();

            System.out.println("dequeued: " + q1.dequeue());
            System.out.println("printing q1:\n" + q1);
            System.out.println();

            System.out.println("dequeued: " + q1.dequeue());
            System.out.println("printing q1:\n" + q1);
        } catch (EmptyCollectionException e) {
            System.out.println("Queue is empty. Cannot dequeue().");
        }

    }

}
