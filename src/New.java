public class New {
    public static String main(String Symbol) {
        int e = 1;
        while (e < 10) {
            String t = String.valueOf(e);
            if (Symbol.contains(t)) {
                return "Найден";
            } else {
                e++;
            }
        }
        return "не найден";
    }
}