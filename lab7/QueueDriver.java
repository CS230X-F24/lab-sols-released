import javafoundations.ArrayQueue;
import javafoundations.LinkedQueue;
import javafoundations.RandomQueue;

/**
 * Write a description of class QueueDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QueueDriver
{
    public static void main(String[] args){
        System.out.println("Testing array queue");
        ArrayQueue aq = new ArrayQueue<String>();
        aq.enqueue("wellesley");
        aq.enqueue("natick");
        aq.enqueue("newton");
        aq.enqueue("needham");
        aq.enqueue("boston");
        
        System.out.println(aq);
        aq.dequeue();
        System.out.println(aq);
        
        aq.dequeue();
        System.out.println(aq);
        
        System.out.println("Testing linked queue");
        LinkedQueue lq = new LinkedQueue<String>();
        lq.enqueue("wellesley");
        lq.enqueue("natick");
        lq.enqueue("newton");
        lq.enqueue("needham");
        lq.enqueue("boston");
        
        System.out.println(lq);
        lq.dequeue();
        System.out.println(lq);
        
        lq.dequeue();
        System.out.println(lq);
        
        System.out.println("Testing randome queue");
        RandomQueue q = new RandomQueue<String>();
        q.enqueue("wellesley");
        q.enqueue("natick");
        q.enqueue("newton");
        q.enqueue("needham");
        q.enqueue("boston");
        
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        
        q.dequeueRandom();
        System.out.println(q);
    }
}
