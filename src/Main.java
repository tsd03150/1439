import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] ch = kb.next().toCharArray();
        int[] arr = new int[ch.length];
        int cnt = 0;
        char tmp = ch[0];

        for (int i = 0; i < ch.length; i++) {
            if (tmp != ch[i]) {
                arr[i] = ++cnt;
            } else {
                arr[i] = 0;
                cnt = 0;
            }
        }

        int answer = 0;
        for (int num : arr) {
            if (num == 1) {
                answer++;
            }
        }

        System.out.println(answer);
    }

}
