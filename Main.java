import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int son = 1;
        while (right > 0) {
            System.out.println("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.println("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                while (son != 4){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                switch (select) {
                    case 1: {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        right = 0;
                        break;
                    }
                    case 2: {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                        right = 0;
                        break;
                    }
                    case 3: {
                        System.out.println("Bakiyeniz : " + balance);
                        right=0;
                        break;
                    }
                    case 4: {
                        System.out.println("Tekrar görüşmek üzere.");
                        right=0;
                        son=4;
                        break;
                    }
 }               }
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}