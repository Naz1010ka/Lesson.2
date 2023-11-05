import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int age = 40;

        for (int i = 0; i < 1; i++) {
            System.out.println(generateRandomeAge(age));
            System.out.println(walk(generateRandomeAge(age), 19));
            System.out.println(walk(51, -4));
            System.out.println(walk(25, 28));
            System.out.println(walk(30, -20));
            System.out.println(walk(31, -0));
            System.out.println(walk(18, 25));
        }
    }
    public static String walk(int age, int temperature) {

        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            return ("Можно идти гулять");
        } else if (age <= 20 && (temperature > 0 && temperature < 28)) {
            return ("Можно идти гулять");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }
    }
    public static int generateRandomeAge(int age){

        if (age > 18) {
        }
        return new Random().nextInt(age+1);
    }



}


