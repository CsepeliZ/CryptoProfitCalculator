public class CryptoMath {

    CryptoData cryptoData;

    private double partialProfit;

    private double fullNewValue;

    public CryptoMath(CryptoData cryptoData) {
        this.cryptoData = cryptoData;
    }

    public double extremeNum(double pre, int pow) {
        return pre * Math.pow(10, pow);
    }

    public double getFullNewValue() {
        fullNewValue = (cryptoData.getCrBuyValue() /
                (extremeNum(cryptoData.getCrBuyPrice1(), cryptoData.getCrBuyPrice2()))) *
                extremeNum(cryptoData.getCrSellPrice1(), cryptoData.getCrSellPrice2());
        return fullNewValue;
    }

    public void setFullNewValue(double fullNewValue) {
        this.fullNewValue = fullNewValue;

    }


    public double getPartialProfit() {
        partialProfit = (cryptoData.getSellRate() / 100) * getFullNewValue();
        // TODO: max. 4 tizedesjegy!
        return partialProfit;
    }

    public void setPartialProfit(double partialProfit) {
        this.partialProfit = partialProfit;

    }

}
