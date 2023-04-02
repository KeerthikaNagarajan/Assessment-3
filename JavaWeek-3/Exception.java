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
