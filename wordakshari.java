import java.util.*;
public class wordakshari {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("PRINT #### TO EXIT");
        System.out.println("GAME STARTED.....");
        String input=scan.nextLine();
        String exit="####";
        System.out.println("entered input : "+input);
        while(!input.equals(exit)){
            char[] ch=input.toCharArray();
            String input1=scan.nextLine();
            char ch2[]=input1.toCharArray();
            if(ch2[0] != ch[ch.length-1]){
            System.out.println("----------GAME OVER----------");
                break; 
            }else{
                System.out.println("input matched... "+input1+" enter next input");
               input=input1;
               
            }
            
        }
scan.close();
    }
}
