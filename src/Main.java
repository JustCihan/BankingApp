import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //örnegin sorusu gerekli dosyada txt olarak mevcut
        //Burada java da struct yapısı bilmedigimden degişkenlere sabit bir deger  aticam
        long hesap_bakiye = 1000;
        int hesap_numarasi = 123456789, hesap_sifresi = 987654321, hesap_numarasi_kontrol, hesap_sifresi_kontrol;
        int islem_turu;
        float yatirilacak_miktar, cekilicek_miktar;
        String islem_devam_kontrol;
        boolean islem_devam_ediyor_mu = true;

        System.out.println("Hesap numarasını giriniz");
        hesap_numarasi_kontrol = scanner.nextInt();
        System.out.println("Hesap şifresini giriniz");
        hesap_sifresi_kontrol = scanner.nextInt();
        while (islem_devam_ediyor_mu) {

            if (123456789 == hesap_numarasi_kontrol && 987654321 == hesap_sifresi_kontrol) {
                System.out.println("Gris Basarili");

                System.out.println("İslem türünü seçiniz \n 1 - Para Yatırma \n 2-Para Çekme  \n 3-Bakiye Sorgulama");
                islem_turu = scanner.nextInt();


                switch (islem_turu) {
                    case 1:
                        System.out.println("Yatırılıck miktarı giriniz");
                        yatirilacak_miktar = scanner.nextFloat();
                        if (yatirilacak_miktar >= 1) {
                            hesap_bakiye += (long) yatirilacak_miktar;
                            System.out.println("Para yatirma işleminiz basarıyla gerçekleştir yeni hesap bakiyeniz " + hesap_bakiye);

                        } else {
                            System.out.println("Geçerli bir deger giriniz");

                        }/// degisiklik
                        break;
                    case 2:
                        System.out.println("Çekilicek miktarı giriniz");
                        cekilicek_miktar = scanner.nextFloat();
                        if (cekilicek_miktar >= 1 && hesap_bakiye >= cekilicek_miktar) {
                            hesap_bakiye -= (long) cekilicek_miktar;
                            System.out.println("Para yatirma işleminiz basarıyla gerçekleştir yeni hesap bakiyeniz " + hesap_bakiye);

                        } else {
                            System.out.println("Hesap bakiyesi yetersizdir");

                        }
                        break;
                    case 3:
                        System.out.println("Hesap bakiyeniz :" + hesap_bakiye);
                        break;


                }
                scanner.nextLine();
                System.out.println("Baska bir islem yapmak istiyor musunuz? Lutdfen evet veya hayır'ı tuşlayın: ");
                String cevap = scanner.nextLine();
                ;
                islem_devam_ediyor_mu = cevap.equalsIgnoreCase("evet");

            } else {
                System.out.println("Gris Basarisiz");
                islem_devam_ediyor_mu = false;
            }


        }
        scanner.close();


    }
}