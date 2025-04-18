import java.util.Scanner; 
public class Rep02Replace2{
    public static void main(String [] args){
        String input_char = ""; 
        Scanner keyboard = new Scanner (System.in);
        input_char = keyboard.nextLine ();

        int count =1;

       
        System.out.println ("You entered: "+ input_char);
        String lowerWord = input_char.toLowerCase();

        int index = lowerWord.indexOf(" ");
        int hate_index = lowerWord.indexOf("hate");

        while(index != -1){
       
            if(hate_index> index)
                count++;
            
            index = lowerWord.indexOf(" ", index + 1);
        }
        if(hate_index == -1)
        System.out.println("First hate is index: 0");
        else{
            System.out.println("First hate is index: " + count);
        }

    }
}