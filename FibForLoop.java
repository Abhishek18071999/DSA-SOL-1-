import java.util.Scanner;

public class FibForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int num0 = 0;
        int num1 = 1;
        int result = 0;

        for(int i =2;i<=num;i++){
            if(num<=0){
                System.out.println("Please type a positve number greater than zero");
            }
            else{
                result = num1 + num0;
                num0 = num1;
                num1 = result;
            }
        }
        System.out.println(result);

    }
}
