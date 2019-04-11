import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        int suhu;

        System.out.println("masukkan suhu : ");

        Scanner temperatur = new Scanner(System.in);
        suhu = temperatur.nextInt();

        if (suhu == 29){
            System.out.println("suhu" + suhu + " celcius, normal!");
        }else if (suhu < 20){
            System.out.println("suhu" + suhu + " celcius, dingin!");
        }else if (suhu == 31){
            System.out.println("suhu" + suhu + " celcius, hangat!");
        }else if (suhu > 32 && suhu < 100){
            System.out.println("suhu" + suhu + " celcius, panas!");
        }
        else {
            System.out.println("suhu tidak terdeteksi!!!");
        }
    }
}
