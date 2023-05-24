import java.util.Scanner;

public class FonkHesMak {

    static int sum() {
        int number, result = 0;
        int i = 1;
        while (true) {
            System.out.print(i++ + ". sayı  : ");
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();

            if (number == 0) {

                break;
            }
            result += number;
        }

        System.out.println("Toplam =" + result);

        return result;

    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;
        int i = 1;
        while (i <= counter) {
            System.out.print(i + ". sayı  : ");
            // Scanner scan=new Scanner(System.in);
            number = scan.nextInt();
            System.out.println("i:" + i);
            if (i == 1) {
                result += number;
                System.out.println("Result" + result);
                i++;
                System.out.println(i);
                continue;
            }
            i++;
            result -= number;
            System.out.println(result);
        }

        System.out.println("Sonuç : " + result);

    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz :");
        int counter = scan.nextInt();
        double result = 0.0, number = 0.0;

        for (int j = 1; j <= counter; j++) {
            System.out.print(j + ". sayı :");
            number = scan.nextInt();
            if (j != 0 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz!");
                continue;
            }

            if (j == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değerini giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int j = 1; j <= exponent; j++) {
            result *= base;
        }
        System.out.println("Sonuç :" + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç faktoriyali hesaplayacaksınız :");
        int base = scan.nextInt();

        int result = 1;

        for (int j = 1; j <= base; j++) {

            result *= j;
        }
        System.out.println("Sonuç :" + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaçın modu alınacak, değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Kaça göre mod alınacak, değeri giriniz :");
        int mod = scan.nextInt();
        int result = 1;
        result = base % mod;

        System.out.println("Sonuç :" + result);
    }

    static void dikdortgen() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdçrtgenin boyu nedir, değeri giriniz :");
        int boy = scan.nextInt();
        System.out.print("Dikdçrtgenin eni nedir, değeri giriniz :");
        int en = scan.nextInt();
        int cevre = 1, alan = 1;
        cevre = 2 * (boy + en);
        alan = boy * en;

        System.out.println("Çevresi :" + cevre);
        System.out.println("Alanı :" + alan);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                    break;
            }

        } while (select != 0);

        scan.close();

    }
}