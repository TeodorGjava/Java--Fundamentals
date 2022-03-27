package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Advertisement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Message msg = new Message();
        msg.Generate(n);
    }

    static class Message {
        String[] phrase = {"Excellent product.", "Such a great product.", "I always use that product."
                , "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!"
                , "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I can’t live without this product.",
                "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        void Generate(int n) {
            Random rnd = new Random();
            for (int i = 0; i < n; i++) {
                int phrase1 = rnd.nextInt(this.phrase.length);
                int event1 = rnd.nextInt(this.event.length);
                int author1 = rnd.nextInt(this.author.length);
                int city1 = rnd.nextInt(this.city.length);
                System.out.printf("%s %s %s - %s%n", this.phrase[phrase1], this.event[event1], this.author[author1], this.city[city1]);
            }
        }
    }


}
