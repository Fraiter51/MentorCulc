import java.util.Scanner;
public class Minus {
    public static String minus(String viragenie){
        Scanner scan = new Scanner(viragenie);
        scan.useDelimiter("\\-");
        if (viragenie.contains("/") || viragenie.contains("+") || viragenie.contains("*") == true) {
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - Вы ввели два операнда.");
            System.exit(0);
        }
        if (scan.hasNext()) {
            var firstSymbol = scan.next();
            if (scan.hasNext()) {
                var secondSymbol = scan.next();
                if (scan.hasNext()) {
                    System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
                else {
                    scan.close();
                    if (New.main(firstSymbol).equals("Найден")) {
                        OneToTen.main(firstSymbol);
                        if (New.main(secondSymbol).equals("Найден")) {
                            OneToTen.main(secondSymbol);
                            System.out.println("Outut:");
                            System.out.println((Integer.parseInt(firstSymbol) - Integer.parseInt(secondSymbol)));

                        }
                        else if (New.main(secondSymbol).equals("не найден")) {
                            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                            System. exit(0);
                        }
                    }
                    else {
                        if (New.main(secondSymbol).equals("не найден")) {
                            var Symbol1 = Translation.romanToNumber(firstSymbol);
                            var Symbol2 = Translation.romanToNumber(secondSymbol);
                            var otvet = Symbol1 - Symbol2;
                            System.out.println("Outut:");
                            System.out.println(Translation.convertNumToRoman(otvet));
                        }
                        else if (New.main(secondSymbol).equals("Найден")) {
                            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                            System. exit(0);
                        }
                    }
                }
            }
            else {
                System.out.println("throws Exception //т.к. строка не является математической операцией");
            }
        }

        return "";
    }
}