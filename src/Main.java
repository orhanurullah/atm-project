import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String userName = "orhanurullah";
        String password = "github/orhanurullah";
        String inputUserName, inputPassword;
        System.out.println("ATM Programı");
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        int balance = 1500;
        int select;
        while(count > 0){
            System.out.print("Kullanıcı Adınız : ");
            inputUserName = scanner.nextLine();
            if(!inputUserName.equalsIgnoreCase(userName)){
                System.out.println("Kullanıcı Adı Hatalı! ");
                return;
            }
            System.out.print("Şifreniz : ");
            inputPassword = scanner.nextLine();
            if(inputPassword.equalsIgnoreCase(password)){
                System.out.println("Merhaba, Bankamıza Hoşgeldiniz. ");
                do{
                    System.out.println(
                            "1- Para Çekme " +
                             "2- Para Yatırma " +
                             "3- Bakiye Sorgulama " +
                             "4- Çıkış Yap"
                    );
                    System.out.println("Yapmak İstediğiniz İşlemi Seçin : ");
                    select = scanner.nextInt();
                    switch (select){
                        case 1 :
                            System.out.print("Çekmek İstediğiniz Tutarı Girin : ");
                            int price = scanner.nextInt();
                            if(price > balance){
                                System.out.println("Girdiğiniz Tutar İçin Hesabınız Yetersiz.");
                            }else{
                                balance -= price;
                                System.out.println("Para Çekme Başarılı! Kalan Tutar : " + balance);
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak İstediğiniz Tutarı Girin : ");
                            int plusPrice = scanner.nextInt();
                            balance += plusPrice;
                            break;
                        case 3:
                            System.out.println("Toplam Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış Yapılıyor.");
                            return;
                        default:
                            break;
                    }
                }while(select != 4);
            }else{
                System.out.println("Şifreniz Hatalıdır. Tekrar Giriş Yapın. ");
                count--;
                if(count == 0){
                    System.out.println("Giriş Hakkınız Tükenmiştir. Bu Sebeple Hesabınız Bloke Olmuştur. Şubeniz ile İletişime Geçin");

                }else{
                    System.out.println("Kalan Hakkınız : " + count);
                }
            }
        }
    }
}
