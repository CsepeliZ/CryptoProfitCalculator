public class OutputCalc {


    protected static void outputCalc(CryptoData crypto, CryptoMath crMath) {

        System.out.println("Vettem [" + crypto.getCrName() + "] valutát " +
                crypto.getCrBuyPrice1() + "*10^" + crypto.getCrBuyPrice2()
                + " árfolyamon, " + crypto.getCrBuyValue() + " HUF értékben.");

        //TODO: új paraméter: darabszám (X): "Vettem X egység [xy] valutát"

        System.out.println("Eladom a " + crypto.getSellRate() + "%-át " +
                crypto.getCrSellPrice1() + "*10^" + crypto.getCrSellPrice2() + " árfolyamon.");

        System.out.println("Ezzel kinyerek " + crMath.getPartialProfit() + " Ft-ot, ami az eredeti befektetéshez képest "
                + (crMath.getPartialProfit() - crypto.getCrBuyValue()) + " Ft hasznot jelent.");

    }
}
