import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("insert days");
        int days = input.nextInt();
        int seconddays = 86400;

        System.out.println("insert hours");
        int hours = input.nextInt();
        int secondhours = 3600;

        System.out.println("insert minutes");
        int minutes = input.nextInt();
        int secondminutes = 60;

        int secondtotal = (days*seconddays)+(hours*secondhours)+(minutes*secondminutes);

        System.out.println("nei: " + secondtotal);
        input.close();

    }
}
