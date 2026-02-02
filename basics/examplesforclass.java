package basics;
class car{
    String brand="tata";
    String model="punch";
    int no_doors=4;
    String color="white";
    void brand(){
        System.out.println("car brand : "+brand);
        System.out.println("car started.....");
    }
}public class examplesforclass {
    public static void main(String args[]){
    car obj1=new car();
    obj1.brand();
}}
