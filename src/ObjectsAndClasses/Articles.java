package ObjectsAndClasses;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(", ");
        Article article = new Article(data[0],data[1],data[2]);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] command = sc.nextLine().split(": ");
            switch (command[0]){
                case "Edit":
                    article.setContent(command[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(command[1]);
                    break;
                case "Rename":
                    article.setTitle(command[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }
    static class Article {
        String title;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        String content;
        String author;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title,this.content,this.author);
        }//"{title} - {content}:{author}"
    }
}
