import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> int1 = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 50; i++) {
            int1.add(ran.nextInt(1, 100));
        }
        System.out.println("Рандомные числа: "+int1);
        System.out.println("----------------");

        ArrayList<Integer> chet = new ArrayList<>();
        ArrayList<Integer> nechet = new ArrayList<>();

        for (Integer p : int1) {
            if (p % 2 == 0) {
                chet.add(p);
            } else {
                nechet.add(p);
            }
        }
        System.out.println("Четные: "+chet);
        System.out.println("Нечетные: "+nechet);


    }
}