import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Traingle traingle = new Traingle();
        Scanner scanner = new Scanner(System.in);
        traingle.a = scanner.nextInt();
        traingle.b = scanner.nextInt();
        traingle.c = scanner.nextInt();
        System.out.println(traingle.a+" "+ traingle.b+ " "+ traingle.c);
        traingle.area();
    }
}