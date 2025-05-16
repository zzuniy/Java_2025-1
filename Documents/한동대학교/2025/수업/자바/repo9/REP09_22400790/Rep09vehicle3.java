package REP08_22400790;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Rep09vehicle3 {

    private int cylinders;
    private double load_capacity;
    private double towing_capacity;

    Scanner s =new Scanner(System.in);

    public Rep09vehicle3 (int cylinders, double load, double tow) throws CylinderException, LoadException, TowingException {
        if (cylinders < 1 || cylinders > 12) {
            throw new CylinderException("Cylinders must be between 1 and 12");
        }
        if (load < 1.0 || load > 10.0) {
            throw new LoadException("Load must be between 1.0 and 10.0");
        }
        if (tow < 1.0 || tow > 20.0) {
            throw new TowingException("Towing must be between 1.0 and 20.0");
        }
        

        this.cylinders = cylinders;
        this.load_capacity = load;
        this.towing_capacity = tow;
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

    public void displayItem(){
        System.out.println("\nAll values all vaild");
        System.out.println("cylinders: " + cylinders);
        System.out.println("load capacity: " + load_capacity);
        System.out.println("towing capacity: " + towing_capacity);
        System.out.println("program ended");
    }public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rep09vehicle3 vehicle = null;

        try {
            System.out.print("Enter cylinders (1~12): ");
            int cylinders = s.nextInt();

            System.out.print("Enter load capacity (1.0~10.0): ");
            double load = s.nextDouble();

            System.out.print("Enter towing capacity (1.0~20.0): ");
            double tow = s.nextDouble();

            vehicle = new Rep09vehicle3(cylinders, load, tow);
            vehicle.displayItem();

        } catch (InputMismatchException e) {
            System.out.println("Invaild input format.");
            System.out.println("program ended");
            s.nextLine();
        } catch (CylinderException | LoadException | TowingException e) {
            System.out.println(e.getMessage());
            System.out.println("program ended");
        }

    }

}


