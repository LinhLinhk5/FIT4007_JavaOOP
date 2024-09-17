import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("nhap vao n: ");
        int inputNumber = n.nextInt();
        for(int i = 0; i <= inputNumber; i++){
            sum+=i;
        }
        System.out.println("tong la:" +sum);
    }
}