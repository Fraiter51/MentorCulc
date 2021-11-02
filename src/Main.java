import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Input: Введите выражение типа [2 + 5] + Enter  или [II+I] + Enter");
        String viragenie = vvod.nextLine();
        viragenie = viragenie.replaceAll("\\s", "");

        DoubleKcik.main(viragenie);

        int i = 1;
        while (i < viragenie.length()) {
            if (viragenie.charAt(i) == '+') {
                Plus.plus(viragenie);
                break;
            } else if (viragenie.charAt(i) == '-') {
                Minus.minus(viragenie);
                break;
            } else if (viragenie.charAt(i) == '*') {
                Umn.umn(viragenie);
                break;
            } else if (viragenie.charAt(i) == '/') {
                Del.del(viragenie);
                break;
            }
            i++;
        }
         if (i == viragenie.length()) {
             System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - Вы ввели неверную операцию.");
         }

    }
}