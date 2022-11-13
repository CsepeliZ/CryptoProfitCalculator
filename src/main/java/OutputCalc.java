public class OutputCalc {


    protected static void outputCalc(CryptoData crypto, CryptoMath crMath) {


        //TODO: új parameter: darabszám (X) "Vettem X egység [xy] valutát"

        crMath.calculation(crypto.getCrBuyValue(), crypto.getCrBuyPrice1(), crypto.getCrBuyPrice2(),
                crypto.getSellRate(), crypto.getCrSellPrice1(), crypto.getCrSellPrice2());

        System.out.println();
        System.out.println("### EREDMÉNY ###");

        System.out.println("Vettem [" + crypto.getCrName() + "] valutát " + crypto.getCrBuyPrice1()
                + "*10^" + crypto.getCrBuyPrice2() + " árfolyamon, " + crypto.getCrBuyValue() + " HUF értékben.");

        System.out.println("Eladom a " + crypto.getSellRate() + "%-át " + crypto.getCrSellPrice1()
                + "*10^" + crypto.getCrSellPrice2() + " árfolyamon.");

        System.out.println("Ezzel kinyerek " + crMath.getPartialProfit() + " Ft-ot, ami az eredeti befektetéshez képest "
                + (crMath.getPartialProfit() - (crypto.getSellRate() * crypto.getCrBuyValue())) + " Ft hasznot jelent.");
    }
}
