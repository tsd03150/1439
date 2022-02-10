import java.util.Scanner;

class ReMain {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] ch = kb.next().toCharArray();

        int znt = 0;
        int ont = 0;
        char tmp = ch[0];
        if(tmp == '0') {
            znt++;
        } else {
            ont++;
        }

        for (int i = 1; i < ch.length; i++) {
            char c = ch[i];

            if (c == tmp) {
                continue;
            } else if (c == '1') {
                ont++;
            } else {
                znt++;
            }
            tmp = c;
        }

        System.out.println(Math.min(znt, ont));

    }

}
