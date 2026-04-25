public class MethodsExample {

    // 함수 (메서드)
    // 어떠한 값이 넘겨지거나 아무 값도 넘겨지지 않았을 때
    // 작업을 수행한 후
    // 반환하거나 혹은 반환하지 않고 종료

    public static void main(String[] args) {

//        int mod_result = mod(3, 2);
//        System.out.println(mod_result);

//        printNum(10);

//        String str = greeting();
//        System.out.println(str);


        greeting_2();


    }

    // 1. 입력 O, 출력(반환) O
    static int mod(int a, int b) {  // <= 어떤 데이터 타입으로 반환할 건지 + 함수의 이름 + 파라미터(매개변수) 받은 값을 함수에서 어떻게 사용할지
        int result = a % b;
        return result;
    }


    // 2. 입력 O, 출력(반환) X
    static void printNum (int a) { // 출력이 없으니 어떠한 데이터타입으로도 반환할 필요가 없음 => void
            System.out.println(a); // return 안 함

    }

    // 3. 입력 X, 출력(반환) O
    static String greeting() { // 입력이 없으므로 파라미터 없음.

        return "Hello!";

    }


    // 4. 입력 X, 출력(반환) X
    static void greeting_2() {
        System.out.println("Hello!");
    }





}
