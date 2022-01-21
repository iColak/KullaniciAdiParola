package kosulluIfadeler;
import java.util.Scanner;

public class UserNamePassword {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner (System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();
        if(userName.equals("patika") && password.equals("java")) {
            System.out.println("Giriş Başarılı !");
        }else{
            System.out.println("Hatalı giriş yaptınız. Şifrenizi sıfırlamak istermisiniz\n 1- Evet\n 2- Hayır");
            int select;
            select = input.nextInt();
            System.out.println(select);
            if (select == 1) {
                System.out.println("Yeni şifreniz eski şifreniz ile aynı olmamalıdır. Yeni şifrenizi giriniz");
                Scanner str = new Scanner(System.in);
                String passwordNew = str.nextLine();
                System.out.println(passwordNew);
                if(passwordNew.equals("java")) {
                    System.out.println("Şifreniz oluşturulamadı, lütfen yeniden deneyiniz.");
                }else{
                    System.out.println("Şifreniz oluşturuldu.");
                }
            }else{
                System.out.println("Şifre hatalı, yeni şifre oluşturmak istemediniz.");
            }

        }

    }
}
