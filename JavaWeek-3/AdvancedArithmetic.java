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
        Calculator calculator = new Calculator();
        System.out.print("I implemented: ");
        ImplementedNames(calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
