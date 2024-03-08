import java.util.LinkedList;
import java.util.Queue;

public class CISQueue<T> {

    // A property of our Queue class is a Linked List.
    // Use your Linked List class that you created in Lab 1!
    // Thought 1: is aggregation or composition going to be used here?
    // Thought 2: meditate on the word 'abstraction'.

    private Queue<Integer> queue;

    public CISQueue(Queue<Integer> queue) {
        this.queue = queue;
    }

    // Our CISQueue class will have a constructor.
    // Our CISQueue constructor will instantiate a Queue of size 1.
    public CISQueue(int x) {
        this.queue = new LinkedList<>();
        this.queue.add(x);
    }

    // enqueue
    // Adds a node to the end of our Queue.
    public void enqueue(int node) {
        queue.add(node);
    }

    // dequeue
    // Returns the data stored in the node that will be polled.
    public Integer dequeue() {
        return queue.poll();
    }

    // isEmpty
    // Returns a boolean.
    // Indicates whether the Queue is empty.
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // size
    // Returns an integer.
    // Indicates how many elements are currently in our Queue.
    public int size() {
        return queue.size();
    }

    // toString
    // Returns a String representation of our Queue.
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Integer element : queue) {
            if (element == null) {
                sb.append("null");
            } else {
                sb.append(element);
            }
            sb.append(" -> ");
        }
        sb.append("null");
        return sb.toString();
    }
}