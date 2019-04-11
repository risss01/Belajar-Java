import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        int suhu;
        Scanner scan = new Scanner(System.in);
        suhu = scan.nextInt();

        System.out.println("Masukkan suhu");
        switch (suhu){
            case 29 :
                System.out.println("normal");
                break;
            case 20 :
                System.out.println("dingin");
                break;
            case 31 :
                System.out.println("hangat");
                break;
            case 32 :
                System.out.println("panas");
                break;

                default:
                    System.out.println("suhu tidak terdeteksi!!!");
        }

    }
}
