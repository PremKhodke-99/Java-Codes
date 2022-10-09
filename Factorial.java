package extraclass;

import java.util.Scanner;

class fact{
    int factorial(int x){
        if (x==0){
            return 1;
        }
        else{
            return x * factorial(x-1);
        }
    }
}

public class Factorial {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number to get the factorial:-");
        int x = sc.nextInt();

        fact f = new fact();
        System.out.println("Result of Factorial " + x + " is: " + f.factorial(x));
    }
}
