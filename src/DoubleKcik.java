public class DoubleKcik {
    public static String main(String Symvol) {

        int indexM = Symvol.indexOf(".");
        if(indexM == - 1) {
            return "";
        } else {
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - Калькулятор умеет работать только с целыми числами.");
            System.exit(0);
        }
        return "";
    }
}
