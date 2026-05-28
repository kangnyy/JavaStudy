import java.util.ArrayList;

public class ExceptionExample {

    public static void main(String[] args) {

        // 예외(Exceptions)

//        // < ArithmeticException - / by zero 예외 >
//        int a = 10;
//        int b = 0;
//        int c = a / b;

//        // IndexOutOfBoundsException: Index 10 out of bounds for length 0
//        ArrayList arrayList = new ArrayList(3);
//        arrayList.get(10);

//        ArrayList arrayList = new ArrayList(3);
//
//        try {
//            arrayList.get(10);
//        } catch (Exception e) {
//            e.printStackTrace(); // 에러메세지 확인 가능
//            System.out.println("에러 발생");
//        } finally {
//            System.out.println("finally");
//        }

//        ArrayList arrayList = new ArrayList(3);
//
//        try {
//            arrayList.get(10);
//        } catch (IndexOutOfBoundsException ioe) {
//            System.out.println("IndexOutOfBoundsException 발생");
//        } catch (IllegalArgumentException iae) {
//            System.out.println("IllegalArgumentException 발생");
//        } finally {
//            System.out.println("finally");
//        }

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("IndexOutOfBoundsException 발생");
        } catch (IllegalArgumentException iae) {
            System.out.println("IllegalArgumentException 발생");
        } catch (Exception e){  // 예상되는 예외들 나열한 뒤에 마지막에 최상위의 Exception을 넣어주어 처리되지 않는 예외 없이 모두 처리할 수 있다.
            System.out.println("Exception 발생");
        } finally {
            System.out.println("finally");
        }

    }
}
