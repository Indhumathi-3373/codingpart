//package project;
import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

public class std_registration_system {
    String register_number;
    String name;
    int batch;
    String dept;
    int year;
    String email;
    String phone_number;
    String address;

    std_registration_system(String register_number2, String name, int batch, String dept, int year, String email,
            String phone_number,
            String address) {
        this.register_number = register_number2;
        this.name = name;
        this.batch = batch;
        this.dept = dept;
        this.year = year;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
    }

    static boolean isValidreg(String reg) {
        return Pattern.matches("[0-9]{6}[a-zA-Z]{2}[0-9]{3}", reg);
    }

    static boolean isValidname(String name) {
        return Pattern.matches("[a-zA-Z]{3,}", name);
    }

    static boolean isValidbatch(int batch) {
        return Pattern.matches("[0-9]{4}", String.valueOf(batch));
    }

    static boolean isValiddept(String dept) {
        return Pattern.matches("[a-zA-Z]{2,}", dept);
    }

    static boolean isValidyear(int year) {
        return Pattern.matches("[0-9]{1,5}", String.valueOf(year));
    }

    static boolean isValidemail(String email) {
        return Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-z]{1,5}", email);
    }

    static boolean isValidphone(String phone) {
        return Pattern.matches("(\\+91|91)?[6-9][0-9]{9}", phone);
    }

    static boolean isValidaddress(String address) {
        return Pattern.matches("^[0-9]{1,5}[a-zA-Z0-9 ,.-]{9,95}$", address);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<std_registration_system> students = new ArrayList<>();
        try {
            

            while (true) {
                System.out.println("=====================STUDENT REGISTRATION SYSTEM=====================");
                System.out.println("1) new register");
                System.out.println("2)display students");
                System.out.println("3)display particular student detail");
                System.out.println("4)delete student by their index");
                System.out.println("5)exit");
                System.out.println("enter choice");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {

                    System.out.println("\nenter register number :");
                    String register_number = sc.nextLine();
                    while (!isValidreg(register_number)) {
                        System.out.println("invalid register number. enter again !");
                        register_number = sc.nextLine();

                    }
                    System.out.println("enter student name :");
                    String name = sc.nextLine();
                    while (!isValidname(name)) {
                        System.out.println("invalid name . enter again !");
                        name = sc.nextLine();
                    }
                    System.out.println("enter batch :");
                    int batch = sc.nextInt();
                    sc.nextLine();
                    while (!isValidbatch(batch)) {
                        System.out.println("invalid batch. enter again !");
                        batch = sc.nextInt();
                        sc.nextLine();

                    }

                    System.out.println("enter department :");
                    String dept = sc.nextLine();
                    while (!isValiddept(dept)) {
                        System.out.println("invalid department. enter again !");
                        dept = sc.nextLine();

                    }
                    System.out.println("enter year of the student :");
                    int year = sc.nextInt();
                    sc.nextLine();
                    while (!isValidyear(year)) {
                        System.out.println("invalid year. enter again !");
                        year = sc.nextInt();
                        sc.nextLine();

                    }
                    System.out.println("enter email id of the student :");
                    String email = sc.nextLine();
                    while (!isValidemail(email)) {
                        System.out.println("invalid email. enter again !");
                        email = sc.nextLine();

                    }
                    System.out.println("enter mobile number of the student :");
                    String phone_number = sc.nextLine();
                    while (!isValidphone(phone_number)) {
                        System.out.println("invalid phone_number. enter again !");
                        phone_number = sc.nextLine();

                    }
                    System.out.println("enter address of the student :");
                    String address = sc.nextLine();
                    while (!isValidaddress(address)) {
                        System.out.println("invalid address. enter again !");
                        address = sc.nextLine();

                    }
                    students.add(new std_registration_system(register_number, name, batch, dept, year, email,
                            phone_number, address));
                    System.out.println("\nstudent registered successfully!");
                    
                } else if (choice == 2) {
                    System.out.printf("%-15s || %-15s || %-15s || %-15s || %-15s || %-20s || %-20s || %-20s%n",
                            "REGISTER", "NAME", "BATCH", "DEPT", "YEAR", "EMAIL", "PHONE", "ADDRESS");
                    for (std_registration_system s : students) {
                        System.out.printf("%-15s || %-15s || %-15s || %-15s || %-15d || %-15s || %-15s || %-15s%n",
                                s.register_number, s.name, s.batch, s.dept, s.year, s.email, s.phone_number, s.address);
                    }
                } else if (choice == 3) {
                    System.out.println("enter student serial number to display :");
                    int serial = sc.nextInt();
                    if (serial >= 1 && serial <= students.size()) {
                        std_registration_system j = students.get(serial - 1);
                        System.out.printf("%-15s || %-15s || %-15s || %-15s || %-15d || %-20s || %-20s || %-20s%n",
                                j.register_number, j.name, j.batch, j.dept, j.year, j.email, j.phone_number, j.address);
                    } else {
                        System.out.println("invlaid serial number");
                    }
                } else if (choice == 4) {
                    System.out.println("Enter the serial number to remove the corresponding student: ");
                    int s_no = sc.nextInt();

                    if (s_no >= 1 && s_no <= students.size()) {

                        std_registration_system s = students.remove(s_no - 1);
                        System.out.println("student " + s.name + " is removed");
                    } else {
                        System.out.println("invalid serial number");
                    }
                } else if (choice == 5) {
                    System.out.println(".......exiting.......");
                    break;
                } else {
                    System.out.println("invalid input");
                }

            }
           
           try{ File f=new File("stddetails.txt");
            if(f.exists()){
                System.out.println("file name :" +f);
            }else{
                System.out.println("file created successfully");
            }
            BufferedWriter w1=new BufferedWriter(new FileWriter("stddetails.txt"));
            for(Object s:students){
                w1.write(s.toString());
               
            }
           w1.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
