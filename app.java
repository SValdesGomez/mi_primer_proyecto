import java.util.Scanner;

public class app { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte edad = scanner.nextByte();
    
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}