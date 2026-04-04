public class Loops {

    public static void main(String[] args) {

        // 반복문
        // 1. for
        // 초기화된 변수, 조건식, 증감식이 있어야함

//        for (int i = 0; i < 10; i++) {  // i++ 말고, i= i+2 (i+=2)도 가능
//            System.out.println(i);
//        }

        // 2. while

        int b = 10;

//        while (b > 0) {
//            System.out.println(b);
//            b--;
//        }

        do {    // 조건식과는 상관없이 무조건 한번은 실행함
                // b= 0이면 0 출력하고 끝남
            System.out.println(b);
            b--;
        } while (b > 0);


    }
}
