import java.util.Scanner;
public class word22 {
    public static void main(String[] args){
     System.out.println("Type Word:");
     Scanner scan = new Scanner(System.in);
     String userInput = scan.nextLine();
     scan.close();

     userInput = userInput.trim();
     int count = 0;

     if(userInput.length() == 0) {
        count = 0;

     }
     else {
        
        count++;
        for(int i = 0; i < userInput.length() -1; i++) {
            if(userInput.charAt(i) == ' '
             && userInput.charAt(i + 1) != ' ') {
                    //' ?'
                    count++;

                   }
        }
     }
     System.out.println("Total Word: " + count);
    }
    
}