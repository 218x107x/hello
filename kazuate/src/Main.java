import java.util.Scanner;

public class Main {
    
    private static final int ANSWER = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("数字を入力してね：");
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
    }
}
