public class CryptoData {

    private String crName;  // kriptó neve;
    private double crBuyPrice1;  // vételár 1. tagja, 10> tizedestört
    private int crBuyPrice2;  // vételár2. tagja, a 10 ennyiedik hatványa
    private double crBuyValue;  // vásárlás végösszege

    private double sellRate;  // készlet ennyi %-át adnád el
    private double crSellPrice1;  // eladási ár 1. tagja, 10> tizedestört
    private int crSellPrice2;  // eladási ár 2. tagja, a 10 ennyiedik hatványa

    public String getCrName() {
        return crName;
    }

    public void setCrName(String crName) {
        this.crName = crName;
    }

    public double getCrBuyPrice1() {
        return crBuyPrice1;
    }

    public void setCrBuyPrice1(double crBuyPrice1) {
        this.crBuyPrice1 = crBuyPrice1;
    }

    public int getCrBuyPrice2() {
        return crBuyPrice2;
    }

    public void setCrBuyPrice2(int crBuyPrice2) {
        this.crBuyPrice2 = crBuyPrice2;
    }

    public double getCrBuyValue() {
        return crBuyValue;
    }

    public void setCrBuyValue(double crBuyValue) {
        this.crBuyValue = crBuyValue;
    }

    public double getSellRate() {
        return sellRate;
    }

    public void setSellRate(double sellRate) {
        this.sellRate = sellRate;
    }

    public double getCrSellPrice1() {
        return crSellPrice1;
    }

    public void setCrSellPrice1(double crSellPrice1) {
        this.crSellPrice1 = crSellPrice1;
    }

    public int getCrSellPrice2() {
        return crSellPrice2;
    }

    public void setCrSellPrice2(int crSellPrice2) {
        this.crSellPrice2 = crSellPrice2;
    }
}
