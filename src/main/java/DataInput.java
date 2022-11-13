import java.util.InputMismatchException;
import java.util.Scanner;

public class DataInput {

    static Scanner userInput = new Scanner(System.in);

    protected static CryptoData dataInput() {

        CryptoData cryptoData = new CryptoData();

        do {
            System.out.println("Kriptovalutád neve?");
            cryptoData.setCrName(userInput.nextLine());
        } while (Service.nullCheck(cryptoData.getCrName()));
        cryptoData.setCrName(Service.resize(cryptoData.getCrName()));


        do {
            System.out.println("Kriptovaluta vét)elár első tagja? ((1,2 * 10^-5)-ből az 1,2)");
            try {
                cryptoData.setCrBuyPrice1(userInput.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Számot kérek!");
                cryptoData.setCrBuyPrice1(0.0);
                userInput.nextLine();
            }
        } while (Service.posCheck(cryptoData.getCrBuyPrice1()));

        do {
            System.out.println("Kriptovaluta vételár második tagja? ((1,2 * 10^-5)-ből a -5)");
            try {
                cryptoData.setCrBuyPrice2(userInput.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Számot kérek, ami nem 0!");
                cryptoData.setCrBuyPrice2(0);
                userInput.nextLine();
            }
        } while (cryptoData.getCrBuyPrice2() == 0);


        do {
            System.out.println("Vásárlás végösszege?");
            try {
                cryptoData.setCrBuyValue(userInput.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Számot kérek!");
                cryptoData.setCrBuyValue(0.0);
                userInput.nextLine();
            }
        } while (Service.posCheck(cryptoData.getCrBuyValue()));

        do {
            System.out.println("Hány százalékot adnál el?");
            try {
                cryptoData.setSellRate(userInput.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Számot kérek!");
                cryptoData.setSellRate(0.0);
                userInput.nextLine();
            }
        } while (Service.posCheck(cryptoData.getSellRate()));

        do {
            System.out.println("Kriptovaluta eladási ár első tagja? ((1,2 * 10^-5)-ből az 1,2)");
            try {
                cryptoData.setCrSellPrice1(userInput.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Számot kérek!");
                cryptoData.setCrSellPrice1(0.0);
                userInput.nextLine();
            }
        } while (Service.posCheck(cryptoData.getCrSellPrice1()));


        do {
            System.out.println("Kriptovaluta eladási ár második tagja? ((1,2 * 10^-5)-ből a -5)");
            try {
                cryptoData.setCrSellPrice2(userInput.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Számot kérek, ami nem 0!");
                cryptoData.setCrSellPrice2(0);
                userInput.nextLine();
            }
        } while (cryptoData.getCrBuyPrice2() == 0);


        return cryptoData;
    }

}
