import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int kenar1,kenar2,kenar3;
        double alan,u;
        Scanner input= new Scanner(System.in);

        System.out.println("Üçgenin Alanını Hesaplama");
        System.out.println("-------------------------");

        System.out.print("1.Kenarı Giriniz: ");
        kenar1=input.nextInt();

        System.out.print("2.Kenarı Giriniz: ");
        kenar2=input.nextInt();

        System.out.print("3.Kenarı Giriniz: ");
        kenar3=input.nextInt();

        u=(kenar1+kenar2+kenar3)/2.0;
        alan= Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin Alanı: "+new DecimalFormat("##.#").format(alan));
    }
}
