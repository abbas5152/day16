import java.util.Scanner;

public class division {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enters two number");
        int num1=s1.nextInt();
        int  num2=s1.nextInt();
        try{
            System.out.println(Math.floor(num1/num2));
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }finally {
            System.out.println("inside finaly block");
        }
    }
}
