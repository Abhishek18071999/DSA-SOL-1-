import java.util.Scanner;

public class IfElsePpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value or number : ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("zero");
        }
        else if(num<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("positive number");
        }

    }
}
