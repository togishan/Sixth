import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        double l1, l2,l3,l4,l5;
        double sum=0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? :");
        l1 = input.nextDouble();
        sum+=l1*2.14;
        System.out.print("\nElma kaç kilo ? :");
        l1 = input.nextDouble();
        sum+=l1*3.67;
        System.out.print("\nDomates kaç kilo ? :");
        l1 = input.nextDouble();
        sum+=l1*1.11;
        System.out.print("\nMuz kaç kilo ? :");
        l1 = input.nextDouble();
        sum+=l1*0.95;
        System.out.print("\nPatlıcan kaç kilo ? :");
        l1 = input.nextDouble();
        sum+=l1*5;
        System.out.print("\nToplam Tutar : " + sum);

    }
}