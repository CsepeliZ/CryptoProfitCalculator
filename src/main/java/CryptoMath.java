public class CryptoMath {

   // CryptoData cryptoData;


    //CryptoData crypto = new CryptoData();

    private double partialProfit;

    private double fullNewValue;

    //public CryptoMath(CryptoData crypto) {
    //}

    //TODO: Rebuild on BIGDECIMAL!

    public void calculation(double crBuyValue, double crBuyPrice1, int crBuyPrice2, double sellRate, double crSellPrice1, int crSellPrice2) {
        fullNewValue = crBuyValue / (extremeNum(crBuyPrice1, crBuyPrice2) * extremeNum(crSellPrice1, crSellPrice2));
        partialProfit = (sellRate / 100) * fullNewValue;
    }

    public static double extremeNum(double pre, int pow) {
        return pre * Math.pow(10, pow);
    }

    public double getFullNewValue() {
        return fullNewValue;
    }

//    public void setFullNewValue(double fullNewValue) {
//        this.fullNewValue = fullNewValue;
//    }


    public double getPartialProfit() {
        return partialProfit;
    }

//    public void setPartialProfit(double partialProfit) {
//        this.partialProfit = partialProfit;
//
//
//    }


//    public static void main(String[] args) {
//
//        CryptoData crypto = new CryptoData();
//
//
//    }
}


