

public class Main {

    public static void main(String[] args) {


        CryptoData crypto;

        crypto = DataInput.dataInput();

        CryptoMath crMath = new CryptoMath(crypto);

        OutputCalc.outputCalc(crypto, crMath);


    }
}
