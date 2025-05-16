package REP08_22400790;

import java.util.Scanner;
public class Rep09vehicle1 {

    private int cylinders;
    private double load_capacity;
    private double towing_capacity;

    Scanner s =new Scanner(System.in);

    public Rep09vehicle1(){
        cylinders =0;
        load_capacity=0;
        towing_capacity=0;
    }
    public void getItem(){
        System.out.print("Enter number of cylinders (1~12): ");
        cylinders = s.nextInt();
        System.out.print("Enter load capacity (1.0~10.0): ");
        load_capacity = s.nextDouble();
        System.out.print("Enter towing capacity (1.0~20.0): ");
        towing_capacity = s.nextDouble();
    }

    public void displayItem(){
        System.out.println("All values all vaild");
        System.out.println("cylinders: " + cylinders);
        System.out.println("load capacity: " + load_capacity);
        System.out.println("towing capacity: " + towing_capacity);
        System.out.println("program ended");
    }
    public static void main(String[] args) {
        Rep09vehicle1 r = new Rep09vehicle1();
        r.getItem();
        r.displayItem();


    }

}
