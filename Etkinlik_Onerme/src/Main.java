import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        int temperature = input.nextInt();

        switch (temperature) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Kayak yapmayı öneririz.");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println("Sinema etkinliğini öneririz.");
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Piknik etkinliğini öneririz.");
                break;
            default:
                System.out.println("Yüzme etkinliğini öneririz.");
                break;
        }
    }
}