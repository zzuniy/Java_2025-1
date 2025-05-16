package REP08_22400790;

import java.util.Scanner;
public class Rep09vehicle2 {

    private int cylinders;
    private double load_capacity;
    private double towing_capacity;

    Scanner s =new Scanner(System.in);

    public Rep09vehicle2(){
        cylinders =0;
        load_capacity=0;
        towing_capacity=0;
    }

    public class CylinderException extends Exception {
        public CylinderException(String message) {
            super(message);
        }
    }

    public class LoadException extends Exception {
        public LoadException(String message) {
            super(message);
        }
    }

    public class TowingException extends Exception {
        public TowingException(String message) {
            super(message);
        }
    }

    public void getItem(){
        try {
            System.out.print("Enter number of cylinders (1~12): ");
            cylinders = s.nextInt();
            if (cylinders < 1 || cylinders > 12) {
                throw new CylinderException("Error: Invaild: Cylinders must be between 1 and 12");
            }

        } catch (CylinderException e) {
            System.out.println(e.getMessage());
            System.out.println("Program ended");
            System.exit(1);
        }

        try {
            System.out.print("Enter load capacity (1.0~10.0): ");
            load_capacity = s.nextDouble();
            if (load_capacity < 1.0 || load_capacity > 10.0) {
                throw new  LoadException("Error: Invaild: load capacity must be between 1.0 and 10.0");
            }

        } catch ( LoadException e) {
            System.out.println(e.getMessage());
            System.out.println("Program ended");
            System.exit(1);
        }

        try {
            System.out.print("Enter towing capacity (1.0~20.0): ");
            towing_capacity = s.nextDouble();
            if (towing_capacity < 1.0 || towing_capacity > 20.0) {
                throw new TowingException("Error: Invaild: towing capacity must be between 1.0 and 20.0");
            }

        } catch (TowingException e) {
            System.out.println(e.getMessage());
            System.out.println("Program ended");
            System.exit(1);
        }

    }

    public void displayItem(){
        System.out.println("\nAll values all vaild");
        System.out.println("cylinders: " + cylinders);
        System.out.println("load capacity: " + load_capacity);
        System.out.println("towing capacity: " + towing_capacity);
        System.out.println("program ended");
    }
    public static void main(String[] args) {
        Rep09vehicle2 r = new Rep09vehicle2();

        r.getItem();
        r.displayItem();


    }

}
