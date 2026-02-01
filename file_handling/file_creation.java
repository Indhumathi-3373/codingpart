 //package file_handling;
import java.io.*;
import java.util.Scanner;
public class file_creation {
    
    public static void main(String args[])throws Exception{
       Scanner sc=new Scanner(System.in);
     System.out.println("enter file name");
    String name=sc.nextLine();
      File create=new File(name);
      if(create.exists()){
        System.out.println("file is already exists");
      }else{
        System.out.println("file is created");
        System.out.println("file name :"+name);
        System.out.println("file path is :"+create.getAbsolutePath());
      }
      FileWriter w=new FileWriter(name);
     w.write(" Every small step counts  you are closer than you think. Keep pushing Challenges are just chances to grow. You have got this. 🌱 Progress, not perfection. Keep moving forward, one slide at a time.  Your effort matters. The team needs your spark shine on! ✨ Hard days? No problem. Rest, reset, and come back stronger. 💖");
              
              FileWriter w1=new FileWriter("indhu.txt");
              w1.write("- Clear communication: Send a concise message outlining what’s needed and deadlines. Keep it simple and direct.\n" + //
                                "- Set expectations: Let everyone");
                                w1.close();
    w.close();
    // FileReader read=new FileReader(name);
    // int ch;
    // while((ch=read.read())!=-1){
    //     System.out.print((char)ch);
    // }
    BufferedReader rd=new BufferedReader(new FileReader(name));//buffer is flexible than filereader ,faster,it will load the first half while displaying that 1st half it will simultaneously compile the next half
    String str;
    while((str=rd.readLine())!=null){
System.out.println(str);
    }
    BufferedReader td=new BufferedReader(new FileReader("indhu.txt"));
    String str1;
    while((str1=td.readLine())!=null){
      System.out.println(str1);
    }
    rd.close();
    td.close();
    System.out.println("data written successfully");sc.close();
    }
}
