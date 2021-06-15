import java.util.Scanner;

public class Main {
    
    private static final int LIMIT = 5;
    private static final int ANSWER = 25;

    public static void main(String[] args) {
        System.out.println("数当てゲーム（答えは2桁の正の数）");

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < LIMIT; i++) {
            try {
                System.out.print("\n数字を入力してね(" + (i + 1) + "/5)：");
                int num = Integer.parseInt(scanner.next());
                if(num == ANSWER) {
                    System.out.println("当たり！");
                    return;
                }
                else if (num >= ANSWER + 20) {
                    System.out.println("20以上大きいです");
                }
                else if (num > ANSWER) {
                    System.out.println("ちょっとだけ大きいです");
                }
                else if (num <= ANSWER - 20) {
                    System.out.println("20以上小さいです");
                }
                else {
                    System.out.println("ちょっとだけ小さいです");
                }
            } catch (NumberFormatException e) {
                System.out.println("整数の入力をお願いします");
            }
        }
        System.out.println("残念（答え：" + ANSWER + ")");
    }
}
