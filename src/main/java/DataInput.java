import java.util.Scanner;

public class DataInput {

    static Scanner userInput = new Scanner(System.in);

    protected static CryptoData dataInput() {

        CryptoData cryptoData = new CryptoData();

        System.out.println("Kriptovalutád neve?");
        cryptoData.setCrName(userInput.nextLine());

        System.out.println("Kriptovaluta vételár első tagja? ((1,2 * 10^-5)-ből az 1,2)");
        cryptoData.setCrBuyPrice1(userInput.nextDouble());

        System.out.println("Kriptovaluta vételár második tagja? ((1,2 * 10^-5)-ből a -5)");
        cryptoData.setCrBuyPrice2(userInput.nextInt());

        System.out.println("Vásárlás végösszege?");
        cryptoData.setCrBuyValue(userInput.nextDouble());

        System.out.println("Hány százalékot adnál el?");
        cryptoData.setSellRate(userInput.nextDouble());

        System.out.println("Kriptovaluta eladási ár első tagja? ((1,2 * 10^-5)-ből az 1,2)");
        cryptoData.setCrSellPrice1(userInput.nextDouble());

        System.out.println("Kriptovaluta eladási ár második tagja? ((1,2 * 10^-5)-ből a -5)");
        cryptoData.setCrSellPrice2(userInput.nextInt());

        return cryptoData;
    }

}
