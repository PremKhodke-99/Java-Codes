package extraclass;

import java.util.Scanner;

public class reverse {

    public static void main(String[] args){
        System.out.println("Enter the number which you want to reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;
        while(num>0){
            int rem = num %10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
