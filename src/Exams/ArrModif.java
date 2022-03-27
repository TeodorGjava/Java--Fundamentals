    package Exams;

    import java.util.Arrays;
    import java.util.Scanner;

    public class ArrModif {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String[] input = sc.nextLine().split(" ");
            int[] modified = arr;
            String[] result = new String[modified.length];
            while (!input[0].equals("end")) {
                switch (input[0]) {
                    case "swap":
                        int one = arr[Integer.parseInt(input[1])];
                        int two = arr[Integer.parseInt(input[2])];
                        modified[Integer.parseInt(input[1])] = two;
                        modified[Integer.parseInt(input[2])] = one;
                        break;
                    case "multiply":
                        int one1 = Integer.parseInt(input[1]);
                        int two2 = Integer.parseInt(input[2]);
                        modified[one1] = arr[two2] * arr[one1];
                        break;
                    case "decrease":
                        for (int i = 0; i < modified.length; i++) {
                            modified[i] = modified[i]-1;
                        }
                        break;
                }
                for (int i = 0; i < modified.length; i++) {
                    result[i] = (modified[i] + "");
                }

                input=sc.nextLine().split(" ");
            }
            for (int i = 0; i < result.length; i++) {
                if(i< modified.length-1) {
                    System.out.print(result[i] + ", ");
                }
                else{
                    System.out.print(result[i]);
                }
            }



        }
    }
