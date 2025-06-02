//sum of N numbers

import java.util.Scanner;

public class sumOfNumber {
    public static void main(String args[]){
        //n=5,n=(n+1)/2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int sum=0;
        for(int i =0; i<=n;i++){
            sum+=i;
            System.out.println( " sum of number is"+sum);
        }


}
}



