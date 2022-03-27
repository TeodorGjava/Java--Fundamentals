package TextProccessing.moreEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String content = sc.nextLine();
        String comment = sc.nextLine();
        List<String> coms = new ArrayList<>();
        while(!comment.equals("end of comments")){
            coms.add(comment);
            comment=sc.nextLine();
        }
        System.out.printf("<h1>%n   %s%n</h1>%n",title);
        System.out.printf("<article>%n   %s%n</article>%n",content);
        for (String s: coms
             ) {
            System.out.printf("<div>%n  %s%n</div>%n",s);
        }

    }
}
