package edu.java.loop11;

public class LoopMain11 {

    public static void main(String[] args) {
        // 4. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 (x, y)형태로 출력
        // x, y는 10 이하의 자연수

        for (int x = 1; x <= 10; x++) { // x는 1부터 10까지 변화시키면서,
            for (int y = 1; y <= 10; y++) { // y는 1부터 10까지 변화시키면서,
                if (4 * x + 5 * y == 60) {  // 방정식의 해가 되면
                    System.out.println("(" + x + ", " + y + ")"); // 결과 출력
                }
            }
        }

    }

}
