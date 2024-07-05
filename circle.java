import java.util.Scanner;
class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int r = sc.nextInt();
        double area= Math.PI*r*r;
        
        System.out.println("Cirle area is :" +area);
        
        
    }
}