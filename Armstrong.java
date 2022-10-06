package extraclass;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is armstrong or not: ");
        int num = sc.nextInt();
        int original = num;
        int temp = num;
        int sum=0;
        
        int digit = 0;

        while(temp>0){
            temp = temp/10;
            digit++;
        }
        while(num>0){
            int remainder = num%10;
            sum = (int) (sum+ (Math.pow(remainder,digit)));
            num = num/10;
        }

        if(sum==original){
            System.out.println("It is an Armstrong number");
        }else{
            System.out.println("it is not an Armstrong number");
        }

    }
}
