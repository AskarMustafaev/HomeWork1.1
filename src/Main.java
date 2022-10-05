import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(funks(generateRandomAge(), -10));
        System.out.println(funks(generateRandomAge(), 30));
        System.out.println(funks(generateRandomAge(), 15));
        System.out.println(funks(generateRandomAge(), 45));
        System.out.println(funks(generateRandomAge(), 7));
        System.out.println(generateRandomAge());



    }

    public static String funks (int age, int temp) {
        if(age > 20 && age < 45 && temp > -20 && temp < 30 ) {
            return "Можно идти гулять";
    } else if (age < 20 && age > 0 && temp < 28) {
            return  "Можно идти гулять";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }
    public static int generateRandomAge(){
       Random random = new Random();
        int a = random.nextInt(100);
        return a;
    }


}
