import java.util.Scanner;

public class coba1 {

    static int angka1;
    static int angka2;
    public static void main(String[] args) {
        input();
        print();
    }

    static void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka 1 :");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka 2 :");
        angka2 = input.nextInt();
    }

    static void print(){
        int hasil = angka1 + angka2;
        System.out.println(hasil);
    }
}
