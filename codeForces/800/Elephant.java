import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double location = sc.nextInt();
        System.out.println((int)Math.ceil(location/5));
    }
}
