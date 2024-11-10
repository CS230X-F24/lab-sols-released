package javafoundations;
import javafoundations.exceptions.*;
import java.util.Random;

/**
 * Write a description of class RandomQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomQueue<T> extends ArrayQueue<T>
{
    //-----------------------------------------------------------------
    //  Removes a random element from the queue.
    //-----------------------------------------------------------------
    public T dequeueRandom() throws EmptyCollectionException
    {
      if (isEmpty())
         throw new EmptyCollectionException ("dequeueRandom() operation failed. "
            + "The queue is empty.");

      T result = null;
      
      Random rand = new Random();
      int randIndex = rand.nextInt(size());
      System.out.println("Removing random at "+randIndex);
      
      ArrayQueue temp = new ArrayQueue<T>();
      int counter = 0;
      
      while(!isEmpty()){
          T item = dequeue();
          if(counter == randIndex){
              result = item;
          }else{
              temp.enqueue(item);
          }
          counter++;
      }
      
      while(!temp.isEmpty()){
          enqueue((T)temp.dequeue());
      }

      return result;
    }
    
    public static void main(String[] args){
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
