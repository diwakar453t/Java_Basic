import java.util.Scanner;

public class Sujal_In_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int t=1;

        for(int i=2;i<n;i++){

             if (n%i==0){
                t=0;break;
            }

        }
        if(t==0){
            System.out.println("Not Prime Number");
        }
        else System.out.println("Prime Number");
    }}