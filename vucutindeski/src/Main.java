import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float boy;
        int kilo;
        double indeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (Metre cinsinden) giriniz : ");
        boy = inp.nextFloat();

        System.out.print("Lütfen Kilonuzu giriniz : ");
        kilo = inp.nextInt();

        indeks = kilo/(boy * boy);

        System.out.print("Vücut Kitle Endeksiniz : " + indeks);

    }
}