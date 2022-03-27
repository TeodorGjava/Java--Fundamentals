package TextProccessing;

import java.util.Scanner;

public class charMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s+");
        char[] word1 = words[0].toCharArray();
        char[] word2 = words[1].toCharArray();
        int sum =0;
        int smaller = Math.min(word1.length,word2.length);
        int bigger = Math.max(word1.length,word2.length);
        for (int i = 0; i <bigger ; i++) {
            if(i<smaller){
                sum+=word1[i] * word2[i];
            }else if(word1.length>word2.length){
                sum+=word1[i];
            }else{
                sum +=word2[i];
            }
        }
        System.out.println(sum);
    }
}
