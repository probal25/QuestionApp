INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (1, 'Default Constructor (Non-parameterized Constructor),Parameterized Constructor', 'How many types of Constructors are in Java?', 'SE', 6, 1, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (2, 'Array is a fixed length data structure whereas ArrayList is a variable length Collection class. We cannot change length of array once created in Java but ArrayList can be changed.', 'Difference between Array and  ArrayList.', 'SE', 4, 1, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (3, 'The program compiles and runs correctly because the order of specifiers doesn''t matter in Java.', 'What if I write static public void instead of public static void?', 'SE', 3, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (4, '30Javatpoint
Javatpoint1020', 'What will be the output of these code:

        System.out.println(10 + 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 + 20);
        System.out.println(10 *  20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 * 20);', 'SE', 3, 1, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (5, 'The above code will give the compile-time error because the for loop demands a boolean value in the second part and we are providing an integer value, i.e., 0.', 'What is the output of this program:

for(int i=0; 0; i++)
 { 
    System.out.println("Hello Javatpoint"); 
 }', 'SE', 4, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (6, 'Constructor doesn''t return anything', 'What is the return type of constructor?', 'SE', 1, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (7, 'TRUE', '"We can not make a constructor final."
Is this statement True or False?', 'SE', 1, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (8, 'Inheritance, Abstraction, Polymorphism, Encapsulation', 'What are the fundamental principles of object oriented programming?', 'SE', 2, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (9, 'A class can have any number of constructors. These constructors will have different list of arguments. It is called constructor overloading. Constructor overloading provides different ways to instantiate a class.', 'What is constructor overloading? What is the use of constructor overloading?', 'SE', 5, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (10, 'Constructor is a special member of a class which is used to create the objects to the class. It is special because it will have same name as class. It will have no return type. Method is ordinary member of a class which is used to implement some behavior of a class. It will have it’s own name and return type.', 'What are the difference between constructor and method?', 'SE', 7, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (11, 'The static variable is used to refer to the common property of all objects. Static variable gets memory only once in the class area at the time of class loading. Using a static variable makes your program more memory efficient. Static variable belongs to the class rather than the object.', 'What is the static variable?', 'SE', 4, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (12, 'No', 'Can we override the static methods?', 'SE', 1, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (13, 'The this keyword is a reference variable that refers to the current object. 
The super keyword in Java is a reference variable that is used to refer parent class objects', 'What is "this" and "super()" keyword in java?', 'SE', 2, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (14, 'Object class', 'Which class is the superclass for every class?', 'SE', 1, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (15, 'Inheritance is a mechanism by which one object acquires all the properties and behavior of another object of another class. It is used for Code Reusability and Method Overriding.', 'What is the Inheritance?', 'SE', 4, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (16, 'No', 'Does Java support multiple inheritance? 
', 'SE', 1, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (17, 'To reduce the complexity and simplify the language, multiple inheritance is not supported in java. Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class. It cretes diamond problem', 'Why is multiple inheritance not supported in java?', 'SE', 7, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (18, 'Java does not allow is multiple inheritance where one class can inherit properties from more than one class. It is known as the diamond problem

public class A extends C,D{     }

We solve the problem useing default methods and interface
interface DemoInterface1  {  
}  
interface DemoInterface2  {  
}  
public class DemoClass implements DemoInterface1, DemoInterface2  
{             }', 'Explain diamond problem in java and how we solve this problem?', 'SE', 8, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (19, 'The super keyword in Java is a reference variable that is used to refer to the immediate parent class object. Whenever you create the instance of the subclass, an instance of the parent class is created implicitly which is referred by super reference variable. The super() is called in the class constructor implicitly by the compiler if there is no super or this.', 'What is super in java?', 'SE', 5, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (20, 'The super keyword always points to the parent class contexts whereas this keyword always points to the current class context. 

The super keyword is primarily used for initializing the base class variables within the derived class constructor whereas this keyword primarily used to differentiate between local and instance variables when passed in the class constructor.', 'What are the differences between this and super keyword?', 'SE', 5, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (21, 'Person Class Constructor Called
Employee Class Constructor Called', 'What is the output of the program?
class Person{
    public Person(){
        System.out.println("Person Class Constructor Called");
    }
}


public class Employee extends Person{
    public Employee(){
        System.out.println("Employee Class Constructor Called");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
    }
}
', 'SE', 5, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (22, 'Polymorphism refers to any entity whether it is a method or a constructor or an operator which takes many forms or can be used for multiple tasks.', 'What is polymorphism in java?', 'SE', 4, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (23, 'Method overloading is the polymorphism technique which allows us to create multiple methods with the same name but different signature.
 
We can achieve method overloading in two ways. 
                   By Changing the number of arguments 
                  By Changing the data type of arguments', 'What is method overloading?', 'SE', 5, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (24, 'If a super class method is modified in the sub class then it is called method overriding.', 'What is method overriding?', 'SE', 3, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (25, 'If a subclass provides a specific implementation of a method that is already provided by its parent class, it is known as Method Overriding. It is used for runtime polymorphism and to implement the interface methods.', 'What is method overriding', 'SE', 6, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (26, 'The method must have the same name as in the parent class. The method must have the same signature as in the parent class. Two classes must have an IS-A relationship between them.', 'How to achieve method overriding?', 'SE', 6, 1, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (27, 'No.It is because the static method is the part of the class, and it is bound with class whereas instance method is bound with the object, and static gets memory in class area, and instance gets memory in a heap.', 'Can we override the static method? Explain why or why not. ', 'SE', 4, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (28, 'No', 'Can we override the private methods?', 'SE', 1, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (29, 'Derived method called ...

base method override in derived class', 'What is the output of the program?
class Base{
    public void baseMethod(){
        System.out.println("BaseMethod");
    }
}

class Derived extends Base{
    public void baseMethod(){
        System.out.println("DerivedMethod");
    }
}

public class Test {
    public static void main(String[] args) {
        Base b = new Derived();
        b.baseMethod();
    }
}', 'SE', 3, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (30, 'the final variable is used to restrict the user from updating it. If we initialize the final variable, we can''t change its value', 'What is the final variable?', 'SE', 3, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (31, 'Compiletime Error because of final variable can''t be update', 'What is the output of the program:

class Bike9{ 
         final int speedlimit=90;//final variable 
         void run(){
             speedlimit=400; 
          }
 public static void main(String args[]){ 
           Bike9 obj=new  Bike9();    obj.run(); }
 }//end of cl', 'SE', 2, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (32, 'Compiletime error. Because final method can''t be override', 'What is the output of the program:

class Bike{ 
    final void run(){
           System.out.println("running");}
 } 
class Honda extends Bike{ 
         void run(){System.out.println("running safely with 100kmph");
}
 public static void main(String args[]){ 
           Honda honda= new Honda(); honda.run(); }
 }', 'SE', 2, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (33, 'Abstraction is a process of hiding the implementation details and showing only functionality to the user. It displays just the essential things to the user and hides the internal information', 'What is the abstraction?', 'SE', 4, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (34, 'The interface is a blueprint for a class that has static constants and abstract methods. It can be used to achieve full abstraction and multiple inheritance. It is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.', 'What is inheritance?', 'SE', 6, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (35, '', 'What are the differences between abstract class and interface?', 'SE', 6, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (36, 'Exception Handling is a mechanism that is used to handle runtime errors', 'What is Exception Handling?', 'SE', 6, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (37, 'a equals b', 'What is the output of this program?

public class Test public static void main (String args[]) { 
         String a = new String("Sharma is a good player");
         String b = "Sharma is a good player"; 

          if(a == b) {
               System.out.println("a == b"); 
           } 
        if(a.equals(b)) {
             System.out.println("a equals b"); }
 }', 'SE', 1, 2, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (38, 'Garbage collection is a process of reclaiming the unused runtime objects. It is performed for memory management.', 'What is Garbage Collector in java?', 'SE', 3, 1, 1, '3');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (39, 'Serialization in Java is a mechanism of writing the state of an object into a byte stream. It is used primarily in Hibernate, RMI, JPA, EJB and JMS technologies.', 'What is serialization?', 'SE', 4, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (40, 'Java Socket programming is used for communication between the applications running on different JRE. Java Socket programming can be connection-oriented or connectionless. Socket and ServerSocket classes are used for connection-oriented socket programming and DatagramSocket, and DatagramPacket classes are used for connectionless socket programming.', 'What is socket in java programming?', 'SE', 8, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (41, 'A socket is simply an endpoint for communications between the machines. It provides the connection mechanism to connect the two computers using TCP. The Socket class can be used to create a socket.', 'What is Socket?', 'SE', 4, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (42, 'Reflection is the process of examining or modifying the runtime behavior of a class at runtime. The java.lang.Class class provides various methods that can be used to get metadata, examine and change the runtime behavior of a class.', 'What is the purpose of using reflection in java?', 'SE', 5, 3, 1, '3');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (43, 'bye




they compare reference. .equals() can compare this', 'What is the output of the following code:

public class Test1 { 
        public static void main(String[] args) { 
                   Integer i = new Integer(201); 
                   Integer j = new Integer(201); 
                
                   if(i == j) {
                     System.out.println("hello"); 
                    } else { 
                     System.out.println("bye"); } 
                  } 
}', 'EE', 3, 3, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (44, 'Multithreading is a process of executing multiple threads simultaneously. Multithreading is used to obtain the multitasking. It consumes less memory and gives the fast and efficient performance.', 'What is multithreading?', 'SE', 2, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (45, 'Thread is the path followed when executing a program.
Process: It simply refers to a program that is in execution i.e., an active program. A process can be handled using PCB (Process Control Block)', 'Difference between thread and process?', 'SE', 4, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (46, 'Process: It simply refers to a program that is in execution i.e., an active program. A process can be handled using PCB (Process Control Block)', 'What is process?', 'SE', 3, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (47, 'The wait() method is provided by the Object class in Java. This method is used for inter-thread communication in Java. The java.lang.Object.wait() is used to pause the current thread, and wait until another thread does not call the notify() or notifyAll() method.', 'What is the purpose of wait() method in Java?', 'SE', 6, 2, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (48, 'New, Runnable, Running,Waiting,Terminated', 'What are the lifecycles of a Thread?', 'SE', 4, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (49, 'Synchronization is a way of controlling the access of a method or a block by multiple threads. Only one thread can enter into a method or a block which has been declared as synchronized. Synchronization is one of the way to achieve thread safety.', 'What is the use of synchronization in thread?', 'SE', 6, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (50, 'The join() method waits for a thread to die. In other words, it causes the currently running threads to stop executing until the thread it joins with completes its task.', 'What does join() method do?', 'SE', 5, 3, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (51, 'Deadlock is a situation in which every thread is waiting for a resource which is held by some other waiting thread. In this situation, Neither of the thread executes nor it gets the chance to be executed. Instead, there exists a universal waiting state among all the threads.', 'Explain deadlock in thread?', 'SE', 6, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (52, 'thread is executing now........ 
Exception in thread "main" java.lang.IllegalThreadStateException





same thread can''t be run twice', 'Output:

public class TestThreadTwice1 extends Thread{
            public void run(){
                  System.out.println(" thread is executing now........"); 
             } 


public static void main(String args[]){ 
              TestThreadTwice1 t1=new TestThreadTwice1(); 
              t1.start(); 
              t1.start(); 
       } 
}', 'SE', 5, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (53, 'public class PrintEvenOdd implements Runnable{
 
    public int MAX=20;
    static int  num=1;
    int remainder;
    static Object lock=new Object();
    PrintEvenOdd(int remainder)
    {
        this.remainder=remainder;
    }
    @Override
    public void run() {
        while (num < MAX) {
            synchronized (lock) {
                while (num % 2 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " -->  " + num);
                num++;
                lock.notifyAll();
            }
        }
    }
}
public class PrintEvenOddThreadMain {
 
    public static void main(String[] args) {
        
        PrintEvenOdd runnable1=new PrintEvenOdd(1);
        PrintEvenOdd runnable2=new PrintEvenOdd(0);
        
        Thread t1=new Thread(runnable1,"Thread 1");
        Thread t2=new Thread(runnable2,"Thread 2");
        
        t1.start();
        t2.start();
    }
}', 'How to print even and odd numbers using threads in java (1 2 3 4 5 6 7 8 9 10)', 'SE', 30, 3, 1, '8');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (54, 'main', 'Output/

class multithreaded_programing { 
         public static void main(String args[]) { 
              Thread t = Thread.currentThread(); 
              System.out.println(t); }
 }', 'SE', 1, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (55, 'Inter-thread communication, as the name suggests, is a process or mechanism using which multiple threads can communicate with each other. It is especially used to avoid thread polling in java and can be obtained using wait(), notify(), and notifyAll() methods.', 'What do you mean by inter-thread communication?', 'SE', 6, 3, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (56, 'The List can contain duplicate elements whereas Set includes unique items.The List is an ordered collection which maintains the insertion order whereas Set is an unordered collection which does not preserve the insertion order.', 'What is the difference between List and Set?', 'SE', 5, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (57, 'Set contains values only whereas Map contains key and values both.
 Set contains unique values whereas Map can contain unique Keys with duplicate values. 
Set holds a single number of null value whereas Map can include a single null key with n number of null values.', 'What is the difference between Set and Map?', 'SE', 7, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (58, 'true, false', 'Output:

public class Main { 
           public static void main (String args[]) { 
                 Integer i1 = 100; 
                 Integer i2 = 100; 
                 System.out.println(i1 == i2); 
                 Integer i3 = 200; 
                 Integer i4 = 200; 
                System.out.println(i3 == i4); 
           }
 }', 'EE', 2, 2, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (59, 'Java has it’s own mechanism to handle the exceptions. In Java, exceptions are handled using three blocks – try, catch and finally blocks.

 try block – The code to be monitored for exceptions will be kept in this block. 
 catch block – If any exceptions occurred in try block, those exceptions will be caught by this block. 
finally block – This block will be always executed whether exception is raised or not and raised exceptions are caught or not.', 'How the exceptions are handled in java? OR Explain try, catch and finally blocks in java?', 'SE', 8, 1, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (60, 'Removing unwanted objects or abandoned objects from the memory is called garbage collection. Garbage collection is done automatically in java. You need not to remove the unwanted objects explicitly. Garbage collector thread does this for you.', 'What is garbage collection in java?', 'SE', 6, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (61, 'If we want a class not to be extended further by any class, we can use the keyword Final with the class name.', 'How can we restrict inheritance for a class so that no class can be inherited from it?', 'SE', 2, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (62, 'no', 'Can we have any other return type than void for main method?', 'SE', 1, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (63, 'no only public allowed', 'Can we declare protected methods in an interface?', 'SE', 1, 1, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (64, 'In Java, a class can not extend more than one class. Class Z is extending two classes – Class X and Class Y. It is a compile time error in Java.', 'Output :

class X {
    //Class X Members     
}
class Y {
    //Class Y Members      
}
class Z extends X, Y {
    //Class Z Members      
}', 'SE', 3, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (65, '10', 'Output :

class A {
    int i = 10;
}

class B extends A {
    int i = 20;
}

public class MainClass {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);
    }
}', 'SE', 2, 1, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (66, '1
2
3', 'Output :

class A {  
      System.out.println(1);
}
class B extends A  { 
      System.out.println(2);
}
class C extends B {
      System.out.println(3);
}
public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}', 'SE', 3, 2, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (67, 'Yes, it is correct. abstract classes may or may not have abstract methods.', 'Below class ABC doesn’t have even a single abstract method, but it has been declared as abstract. Is it correct?

abstract class ABC { 
void firstMethod() { 
System.out.println("First Method");          } 
void secondMethod() { 
System.out.println("Second Method");     } }', 'SE', 2, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (68, 'Because, abstract methods must not have a body.', 'Why the below class is showing compilation error?

abstract class AbstractClass {
    abstract void abstractMethod() {
        System.out.println("First Method");
    }
}', 'SE', 2, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (69, 'Interface methods must be implemented as public. Because, interface methods are public by default and you should not reduce the visibility of any methods while overriding.', 'Why the below code is showing compile time error?

interface X {
    void methodX();
}

class Y implements X {
    void methodX() {
        System.out.println("Method X");
    }
}', 'SE', 4, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (70, 'Array Size should be given at the time of array declaration. String[] name = new String[2] where Arraylist Size may not be required. It changes the size dynamically. List<Integer> list=new ArrayList<>();', 'Difference between Array vs ArrayList', 'SE', 4, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (71, 'primative - int, byte, short, long, float, double, boolean
Object- char and Integer,String', 'Primitive type vs object type', 'SE', 4, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (72, 'Thread
- It is a subset of a subunit of a process.
- These are easier to create, lightweight, and have less overhead. 
- Inter-thread communication is faster, less expensive, easy and efficient because threads share the same memory address of the process they belong to. ', 'Difference between thread and process', 'SE', 4, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (73, '', 'Explain runtime polymorphism and compile time polymorphism. 
', 'SE', 6, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (74, 'No, we cannot restart the thread, as once a thread started and executed, it goes to the Dead state. 
Therefore, if we try to start a thread twice, it will give a runtimeException "java.lang.IllegalThreadStateException".', 'Is it possible to start a thread twice?', 'SE', 2, 2, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (75, '10', 'Output :

class A {
    int i = 10;
}

class B extends A {
    int i = 20;
}

public class MainClass {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);
    }
}', 'SE', 6, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (76, '1
2
3', 'Output :

class A {
    {
        System.out.println(1);
    }
}

class B extends A {
    {
        System.out.println(2);
    }
}

class C extends B {
    {
        System.out.println(3);
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}', 'SE', 3, 3, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (77, ' 
 		
Because, abstract methods must not have a body.
', 'Why the below class is showing compilation error?

abstract class AbstractClass {
    abstract void abstractMethod() {
        System.out.println("First Method");
    }
}', 'SE', 2, 2, 0, '0');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (78, 'Yes, it is correct. abstract classes may or may not have abstract methods.', 'Below class ABC doesn’t have even a single abstract method, but it has been declared as abstract. Is it correct?

abstract class ABC {
    void firstMethod() {
        System.out.println("First Method");
    }

    void secondMethod() {
        System.out.println("Second Method");
    }
}', 'SE', 2, 2, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (79, 'Make constructor private.', 'How to prevent to create an object of a class?', 'SE', 2, 2, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (80, 'infinite for loop', 'for (;;) {
        // do something
    }
    
What type of loop is this? And When do we use it?', 'SE', 3, 1, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (81, 'he wait() method releases the lock or monitor, while sleep doesn''t.', 'Difference between wait() and sleep() in Java?', 'SE', 3, 3, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (82, 'BufferedReader is a Decorator that provides buffering for faster IO, while FileReader is used to read data from File.

Read more: https://www.java67.com/2020/02/40-java-io-and-files-interview-questions-answers.html#ixzz7DsHoXXHn', 'What is the difference between BufferedReader and FileReader in Java?
', 'SE', 3, 3, 1, '1');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (83, '', 'Write a Program to Check a number is Palindrome or not.

Hint : A number that is equal to the reverse of that same number is called a palindrome number. For example, 3553, 12321
', 'SE', 20, 3, 1, '10');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (84, null, '(int x, int y) -> x+y; or (x, y) -> x + y; which one of these is a valid lambda expression?', 'SE', 3, 3, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (85, null, '(int x, y) -> x + y; is this a valid lambda expression?', 'SE', 3, 3, 1, '2');
INSERT INTO question_db.question_tbl (question_id, answer, body, label, line_of_answer, question_rank, selected, marks) VALUES (86, 'Method reference is used refer method of functional interface. It is nothing but compact way of lambda expression.You can simply replace lambda expression with method reference.', 'What is method reference in java 8?', 'SE', 3, 3, 1, '2');