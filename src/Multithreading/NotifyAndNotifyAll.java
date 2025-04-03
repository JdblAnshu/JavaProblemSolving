public class NotifyAndNotifyAll {
}
/*
notify(): It sends a notification and wakes up only a single thread instead of multiple threads that are waiting on the object’s monitor.
notifyAll(): It sends notifications and wakes up all threads and allows them to compete for the object's monitor instead of a single thread.

 Why wait(), notify(), and notifyAll() methods are present in Object class?
We know that every object has a monitor that allows the thread to hold a lock on the object.
But the thread class doesn't contain any monitors. Thread usually waits for the object’s monitor (lock) by calling the wait()
 method on an object, and notify other threads that are waiting for the same lock using notify() or notifyAll() method.
 Therefore, these three methods are called on objects only and allow all threads to communicate with each that are created on that object.



 */
