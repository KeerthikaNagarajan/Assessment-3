# Java Week - 3
### Question 1
```
1.A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for subclasses. You should learn about Java Inheritance before attempting this challenge.
Following is an example of abstract class:
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
If you try to create an instance of this class like the following line you will get an error:
Book new_novel=new Book(); 
You have to create another class that extends the abstract class. Then you can create an instance of the new class.
Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.
In the editor, we have provided the abstract Book class and a Main class. In the Main class, we created an instance of a class called MyBook. Your task is to write just the MyBook class.
Your class mustn't be public.
Sample Input
A tale of two cities
Sample Output
The title is: A tale of two cities
```
### CODE
```
public abstract class Book{
    String title;
    public abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book
{
    @Override
    public void setTitle(String s)
    {
        this.title=s;
    }
}
class Main {
    public static void main(String[] args)
    {
        MyBook obj=new MyBook();
        obj.setTitle("A tale of two cities");
        System.out.println("The title is:"+obj.getTitle());
    }
}
```
### OUTPUT
<img width="209" alt="image" src="https://user-images.githubusercontent.com/93427089/229343083-1686b7bf-bda2-448a-83b2-b1c6be20ad1a.png">


### Question 2
```
2.A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. In this problem, you will practice your knowledge on interfaces.
You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.
Sample Input
6
Sample Output
I implemented: AdvancedArithmetic
12
Explanation
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.
```
### CODE
```
import java.util.Scanner;
interface AdvancedArithmetic {
    int divisor_sum(int n);
}
class Calculator implements AdvancedArithmetic{
    int sum = 0;
    public int divisor_sum(int n){
        for(int i=1;i<=(n+1)/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(n==1){
            return 1;
        }
        return (sum+n);
    }
}
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Calculator calculator = new Calculator();
        System.out.print("I implemented: ");
        ImplementedNames(calculator);
        System.out.print(calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    static void ImplementedNames(Object o){
        Class[] Interfaces = o.getClass().getInterfaces();
        for (int i = 0; i < Interfaces.length; i++){
            String interfaceName = Interfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
```
### OUTPUT
<img width="217" alt="image" src="https://user-images.githubusercontent.com/93427089/229343323-94db4796-fe89-4cfa-b31b-1e326fa1db60.png">

### Question 3
```
3.When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new ones). Consider the following Sports class:
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
Next, we create a Soccer class that inherits from the Sports class. We can override the getName method and return a different, subclass-specific string:
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}
Note: When overriding a method, you should precede it with the @Override annotation. The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.
Task
Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same statement as the superclass' getNumberOfTeamMembers method, except that it replaces  with  (the number of players on a Soccer team).
Output Format
When executed, your completed code should print the following:
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
```
### CODE
```
public class Sport
{
    public static void main(String[] args)
    {
        Sports obj;
        obj=new Sports();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
        obj=new Soccer();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
    }
}
class Soccer extends Sports
{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
class Sports {
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has n players in " + getName() );
    }
}
```
### OUTPUT
<img width="258" alt="image" src="https://user-images.githubusercontent.com/93427089/229343438-2ab55d00-376d-44ed-bf14-2222f10175bb.png">

### Question 4
```
4. Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution.
Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.
This problem will test your knowledge on try-catch block.
You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
Sample Input 0:
10
3
Sample Output 0:
3
Sample Input 1:
10
Hello
Sample Output 1:
java.util.InputMismatchException
Sample Input 2:
10
0
Sample Output 2:
java.lang.ArithmeticException: / by zero
Sample Input 3:
23.323
0
Sample Output 3:
java.util.InputMismatchException
```
### CODE
```
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception{
    public static void main(String[] args) {
        try {
            int a,b;
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }

    }
}
```
### OUTPUT
<img width="250" alt="image" src="https://user-images.githubusercontent.com/93427089/229343567-529fdc82-24e8-4af8-9b1d-fe79bffeaa50.png">

