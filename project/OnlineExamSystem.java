//package project;

import java.util.Scanner;

public class OnlineExamSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("        ONLINE EXAM SYSTEM");
        System.out.println("=====================================");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.print("\nEnter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals("student") && password.equals("1234")) {
                System.out.println("\nLogin Successful!");
                startExam(sc);
            } else {
                System.out.println("\nInvalid Login Credentials!");
            }
        } else {
            System.out.println("\nThank you! Exiting...");
        }

        sc.close();
    }

    public static void startExam(Scanner sc) {
        int score = 0;

        System.out.println("\n-------------------------------------");
        System.out.println("           EXAM INSTRUCTIONS");
        System.out.println("-------------------------------------");
        System.out.println("- Total Questions: 2");
        System.out.println("- Each Question carries 1 mark");
        System.out.println("- No negative marking");
        System.out.println("\nPress ENTER to start the exam...");
        sc.nextLine();

    
        System.out.println("\nQuestion 1:");
        System.out.println("What is the size of int in Java?");
        System.out.println("1. 2 bytes");
        System.out.println("2. 4 bytes");
        System.out.println("3. 8 bytes");
        System.out.println("4. Depends on system");
        System.out.print("Your answer: ");
        int ans1 = sc.nextInt();

        if (ans1 == 2) score++;

        System.out.println("\nQuestion 2:");
        System.out.println("Which keyword is used to inherit a class in Java?");
        System.out.println("1. implement");
        System.out.println("2. extends");
        System.out.println("3. inherits");
        System.out.println("4. super");
        System.out.print("Your answer: ");
        int ans2 = sc.nextInt();

        if (ans2 == 2) score++;

        System.out.println("\n-------------------------------------");
        System.out.println("Exam Finished!");
        System.out.println("Your Score: " + score + " / 2");

        if (score >= 1) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        System.out.println("\nThank you for using Online Exam System!");
    }
}
