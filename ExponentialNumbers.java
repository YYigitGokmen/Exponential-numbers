


import java.util.Scanner;



public class ExponentialNumbers {
public static void main(String[]args) {
     Scanner scan = new Scanner(System.in);
    System.out.print(" N Değerini Giriniz : ");
       int n = scan.nextInt();

 System.out.print(" Üst olacak değerini giriniz : ");
    int k = scan.nextInt();

        int total = 1;

for (int i =1; i<=k; i++ ) {

    total *= n;
}
 System.out.println("Cevap : "+ total);














}
}
