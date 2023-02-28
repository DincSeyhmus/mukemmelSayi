import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        int a= klavye.nextInt();
        List<Integer> bolenler=new ArrayList<Integer>();
        for (int i = 1; i < a; i++) {
            if(a%i==0){
                bolenler.add(i);
            }
        }
        int toplam=0;
        for (int i = 0; i < bolenler.size(); i++) {
            toplam=toplam+ bolenler.get(i);
        }
        if(toplam==a){
            System.out.println("Mükemmel Sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir");
        }
    }
}
