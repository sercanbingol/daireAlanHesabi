import java.util.Scanner;

 class daireAlanHesabi {
    public static void main(String[] args) {
        int yaricap,acıOlcusu;
        double alan,pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        yaricap = input.nextInt();
        System.out.print("Dairenin açısını giriniz : ");
        acıOlcusu  = input.nextInt();

        alan = (pi * yaricap * yaricap * acıOlcusu)/360;
        System.out.println("Dairenin alani : " + alan);

    }
}