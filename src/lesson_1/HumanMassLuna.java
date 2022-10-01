package lesson_1;

import java.util.Scanner;

public class HumanMassLuna {
    public static void main(String[] args) {
        System.out.println("Введите массу вашего тела на Земеле: ");
        Scanner scan = new Scanner(System.in);
        double masshuman = scan.nextDouble();
        double massLuna = masshuman * 0.17;
        System.out.println("Масса вашего тела на Луне: " + massLuna);
    }
}
