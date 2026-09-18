import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Yaniv Lev
// Notes: The instructions are found in comments through the code starting with "Step n"
//        Please leave the comments and add your code just after the comment.
//        Use the examples in the book to complete the lab.

class Main {
  public static void main(String[] args) {
    Lab2 lab = new Lab2();
    // Comment/Uncomment the following 3 method calls as you work on each method.
    // No code should be added to the main method. All of your code will go into the methods in Lab2.
    lab.linkedList();
    lab.queue();
    lab.stack();
  }
}

class Lab2 {
  public void linkedList() {
    // 1. Create a LinkedList<String> object called progLanguages

    // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"

    // 3. Remove the element "C++" from the list using .remove()

    // 4. Add an element "HTML" at index 2.

    // 5. Iterate over progLanguages and use println() to output each element. You must create an Iterator<string> and use hasNext(), and next() similar to the example in our book.
    System.out.println("############## LINKED LIST ##############");
    LinkedList<String> progLanguages = new LinkedList<String>();
    progLanguages.add("Java");
    progLanguages.add("Python");
    progLanguages.add("JavaScript");
    progLanguages.add("C++");

    progLanguages.remove("C++");
    progLanguages.add(2,"HTML");
    
    Iterator<String> iterator = progLanguages.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
  
  public void queue() {
    // 6. Create a Queue<String> called q

    // 7. Add 5 first names to q.

    // 8. Uncomment the following line

    // 9. Remove the head of the queue and assign it to a String variable removedElement.
    //    Display the value of "Removed element: " + removedElement

    // 10. View the head of the queue using peek(). Output it's value.

    // 11. Using for(String element : q), output all of the values in the queue
    System.out.println("\n############## QUEUE ##############");
    Queue<String> q = new LinkedList<String>();
    q.add("Michael");
    q.add("May");
    q.add("Leon");
    q.add("James");
    q.add("Arnold");

    String removedElement = q.remove();
    System.out.println("Removed element: " + removedElement);

    System.out.println("Elements of queue: " + q);
    String head = q.remove();
    System.out.println(head);
    System.out.println(q.peek());

    for(String element: q) {
      System.out.println(element);
    }
  }

  public void stack() {
    // 12. Create a Stack<String> called bookStack

    // 13. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"

    // 14. pop() 1 book off the stack. Display it's value

    // 15. Use the peek() method to view the top book on the stack

    // 16. push() "Web DB Technologies" onto the stack

    // 17. Use the peek() method to view the top book on the stack

    // 18. Search for "Design Patterns" in the stack. Display the results of the search.

    // 19. Call empty(). Output the results

    // 20. Print the titles of all of the books on the stack
    System.out.println("\n############## STACK ##############");
    Stack<String> bookStack = new Stack<String>();
    bookStack.push("Clean Code");
    bookStack.push("Design Patterns");
    bookStack.push("Pragmatic Programmer");
    
    System.out.println("Popped book: " + bookStack.pop());
    System.out.println("New top book: " + bookStack.peek());
    bookStack.push("Web DB Technologies");
    System.out.println("New top book: " + bookStack.peek());
    System.out.println("Search result: " + bookStack.search("Design Patterns"));
    System.out.println("Is book empty: " + bookStack.empty());
    for (String element: bookStack) {
      System.out.print(element + " | ");
    }
  }

  
}