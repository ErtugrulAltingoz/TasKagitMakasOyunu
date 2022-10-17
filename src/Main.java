import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int userPoint=0;
        int pcPoint=0;
        System.out.println("Taş Kağıt Makas oyununa hoş geldiniz.");
        System.out.println("1-Taş 2-Kağıt 3-Makas");
        while (true){
            System.out.println("Seçim Yapın: ");
            int select=inp.nextInt();
            int pcSelect=(int) (Math.random()*3);
            if(select==1){
                if(pcSelect==1){
                    System.out.println("Pc nin Seçimi Taş : Sonuç Berabere");
                    System.out.println("Puannınız:"+userPoint+"\nPc Puanı: "+pcPoint);
                }else if(pcSelect==2){
                    System.out.println("Pc nin Seçimi Kağıt: Sonuç Kaybettiniz");
                    pcPoint++;

                }else{
                    System.out.println("Pc nin Seçimi Makas:Sonuç Kazandınız");
                    userPoint++;
                    System.out.println("Puanınız: "+userPoint+"\nPc Puanı: ");
                }
            }if(select==2){
                if(pcSelect==1){
                    System.out.println("Pc nin Seçimi Taş : Sonuç Kazandınız");
                    userPoint++;

                }else if(pcSelect==2){
                    System.out.println("Pc nin Seçimi Kağıt: Sonuç Berabere");
                    System.out.println("Puanınız :"+userPoint+"\nPc Puanı: "+pcPoint);
                }else{
                    System.out.println("Pc nin Seçimi Makas: Sonuç Kaybettini");
                    pcPoint++;
                    System.out.println("Puanınız: "+userPoint+"\nPc Puanı: "+pcPoint);
                }
            }if(select==3){
                if(pcSelect==1){
                    System.out.println("Pc nin Seçimi Makas : Sonuç Berabere");
                    System.out.println("Puanınız: "+userPoint+"\nPc Puanı: "+pcPoint);
                }else if(pcSelect==2){
                    System.out.println("Pc nin Seçimi Kağıt : Sonuç Kazandınız");
                    userPoint++;
                }else{
                    System.out.println("Pc nin Seçimi Taş : Sonuç Kaybettiniz ");
                    pcPoint++;
                    System.out.println("Puanınız: "+userPoint+"\nPc Puanı: "+pcPoint);
                }
            }if(userPoint==3){
                System.out.println("Tebrikler Kazandınız.");
                break;
            }else if(pcSelect==3){
                System.out.println("Üzgünüm Kaybettiniz.");
                break;
            }
        }

    }
}