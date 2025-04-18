import java.util.Scanner; 
public class Rep02Replace3{
    public static void main(String [] args){
        String input_char = ""; 
        Scanner keyboard = new Scanner (System.in);


        int count =0;

       while(!input_char.equals("quit")){
        System.out.println ("Enter a line of text.");
        input_char = keyboard.nextLine ();
     
        String lowerWord = input_char.toLowerCase();

        int index = lowerWord.indexOf(" ");
        int hate_index = lowerWord.indexOf("hate");

        while(index != -1){
            
            if(hate_index> index)
                count++;
            
            index = lowerWord.indexOf(" ", index + 1);
            
        }
        String replaceWorld = lowerWord.replaceFirst("hate", "love");
        if(!input_char.equals("quit"))
        System.out.println ("I have rephrased that line to read:\n"+ replaceWorld);

        count =1;
       }
        
    }
}