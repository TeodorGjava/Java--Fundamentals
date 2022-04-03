package FundamentalsFinalExam03April2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MessageManeger03 {
    static class Message {
        String name;
        int sent;
        int recived;
        int limit;

        public Message(String name, int sent, int recived, int limit) {
            this.name = name;
            this.sent = sent;
            this.recived = recived;
            this.limit = limit;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSent() {
            return sent;
        }

        public void setSent(int sent) {
            this.sent = sent;
        }

        public int getRecived() {
            return recived;
        }

        public void setRecived(int recived) {
            this.recived = recived;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Message> messageMap = new LinkedHashMap<>();
        String[] command = sc.nextLine().split("=");
        while (!command[0].equals("Statistics")) {
            switch (command[0]) {
                case "Add":
                    add(messageMap, command[1], Integer.parseInt(command[2]), Integer.parseInt(command[3]), n);
                    break;
                case "Message":
                    message(messageMap, command[1], command[2]);
                    break;
                case "Empty":
                    empty(messageMap, command[1]);
                    break;
            }

            command = sc.nextLine().split("=");
        }
        System.out.println("Users count: " + messageMap.size());
        for (Map.Entry<String, Message> entry : messageMap.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue().getRecived() + entry.getValue().getSent());
        }
    }

    private static void empty(Map<String, Message> messageMap, String name) {
        if (name.equals("All")) {
            messageMap.clear();
        }
        messageMap.remove(name);

    }

    private static void message(Map<String, Message> messageMap, String sender, String reciver) {
        if (messageMap.containsKey(sender) && messageMap.containsKey(reciver)) {
            messageMap.get(sender).setSent(messageMap.get(sender).getSent() + 1);
            messageMap.get(reciver).setRecived(messageMap.get(reciver).getRecived() + 1);
            if (messageMap.get(sender).getSent() + messageMap.get(sender).getRecived() == messageMap.get(sender).getLimit()) {
                System.out.println(sender + " reached the capacity!");
                messageMap.remove(sender);
            }
            if (messageMap.get(reciver).getRecived() + messageMap.get(reciver).getSent() == messageMap.get(reciver).getLimit()) {
                System.out.println(reciver + " reached the capacity!");
                messageMap.remove(reciver);
            }
        }
    }

    private static void add(Map<String, Message> messageMap, String name, int sent, int recived, int limit) {
        messageMap.putIfAbsent(name, new Message(name, sent, recived, limit));
    }
}
