package basics;
import java.util.Scanner;

public class mangotree {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int column = scan.nextInt();
        int tree = scan.nextInt();
        System.out.println("number of rows : " + row);
        System.out.println("number of column : " + column);
        System.out.println("tree number : " + tree);
        int total = column * row;
        if (tree <= total && tree>0 ) {
            if (tree<=column || tree % column == 1 || tree % column == 0) {
                System.out.println("mango tree");
            }else {
            System.out.println("not a mango tree");
        }
        } else {
            System.out.println("the tree does not exist");
        }
        scan.close();
    }
}
