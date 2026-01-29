package InterviewQuestion;

/**
 * 1. Can abstract class and interface have static method? If yes, how’s it different?
 * Yes, both abstract classes and interfaces can have static methods.
 * Abstract Class: static methods are tied to the class, can be called without instantiation, and can be inherited or overridden (if not final). They can access static fields and methods directly.
 * Interface: static methods (since Java 8) are also tied to the interface, called without instantiation, but cannot be overridden by implementing classes. They are typically used for utility methods.
 * Difference: Interface static methods are not inherited by implementing classes, while abstract class static methods can be inherited. Interface methods are implicitly public, while abstract class methods can have any access modifier.
 * 2. Is it possible to have an abstract class without an abstract method?
 * Yes, an abstract class can have no abstract methods.
 * Details: It can contain only concrete (implemented) methods or fields, but it cannot be instantiated. This is useful for providing a common base class with shared functionality that subclasses must extend, ensuring a specific structure without mandating abstract methods.
 * 3. Interface supports private methods. What’s the use of it?
 * Yes, interfaces support private methods (since Java 9).
 * Use: private methods provide helper or utility logic for default or static methods within the interface, avoiding code duplication. They cannot be accessed or overridden by implementing classes, ensuring encapsulation of internal logic.
 * 4. Is it possible to extend an abstract class from an interface?
 * No, an abstract class cannot extend an interface.
 * Details: An abstract class can implement an interface using the implements keyword, but extending is reserved for class-to-class inheritance. Interfaces can only extend other interfaces, not classes. Example: abstract class MyClass implements MyInterface.
 *
 * 5. Can an abstract class contain a final method?
 * Yes, an abstract class can contain final methods.
 * Details: A final method in an abstract class provides a concrete implementation that cannot be overridden by subclasses. This is useful for enforcing unchangeable behavior while allowing other methods to remain abstract or overridable.
 * 6. Can interface and abstract class have a constructor?
 * Abstract Class: Yes, an abstract class can have constructors, which are used to initialize fields when a subclass is instantiated. They are called via super() in subclass constructors.
 * Interface: No, interfaces cannot have constructors, as they are not instantiated and only define contracts (methods and constants).
 * Details: Abstract class constructors ensure shared initialization logic, while interfaces lack instance state, making constructors irrelevant.
 * 7. Can we mark an abstract class as final, and why?
 * No, an abstract class cannot be marked as final.
 * Reason: An abstract class is designed to be extended by subclasses to provide implementations for abstract methods. Marking it final would prevent extension, contradicting its purpose, and result in a compile-time error.
 */
public class InterviewQuestions22May25 {

}
