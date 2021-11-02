
public class OneToTen {
    public static String main(String Symvol) {
            if (Integer.parseInt(Symvol) < 0 || Integer.parseInt(Symvol) > 10) {
                    System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
                    System.exit(0);
            }
        return "";
    }
}