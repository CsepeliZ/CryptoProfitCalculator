public class Service {

    public static boolean nullCheck(String crName) {
        return (crName == null || crName.equals(""));
    }

    public static String resize(String crName) {
        if (crName.length() > 12) {
            return crName.substring(0, 12);
        } else {
            return crName;
        }
    }

    public static boolean posCheck(double doubleInput) {
        return !(doubleInput > 0);
    }
}
