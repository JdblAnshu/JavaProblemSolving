public class BlockingQueue {

}
/*
. What is BlockingQueue?
BlockingQueue basically represents a queue that is thread-safe. Producer thread inserts resource/element into the queue
using put() method unless it gets full and consumer thread takes
resources from the queue using take() method until it gets empty. But if a thread tries to dequeue from an empty queue, then a particular thread will be blocked until some other thread inserts an item into the queue, or if a thread tries to insert an item into a queue that is already full, then a particular thread will be blocked until some threads take away an item from the queue.
 */
