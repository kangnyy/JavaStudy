public class Conditional {

    public static void main(String[] args) {


        // if 조건문
//        int a = 1;
//        int b = 100;
//
//        // 다중 조건의 경우 조건을 만족하는 최초의 분기만 실행!
//        if (a == b) {
//            System.out.println("a == b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else if (a <= b) {
//            System.out.println("a <= b");       // 이건 실행되지 않음 위 코드에서 끝
//        } else {
//            System.out.println("else");
//        }



//        if (a == b) {
//            System.out.println("a == b");
//        } else {
//            System.out.println("else block");
//        }


//        if (a != b) {
//            System.out.println("a != b");
//        }


        // switch

        int a = 13;
        switch (a + 1) {

//            case 9:
//                System.out.println("a + 1 == 9");
//            case 10:
//                System.out.println("a + 1 == 10");
//            case 11:
//                System.out.println("a + 1 == 11");

            // break 안하면 세 케이스 다 실행됨
            case 11:
                System.out.println("a + 1 == 11");
                break;
            case 10:
                System.out.println("a + 1 == 10");
                break;
            case 9:
                System.out.println("a + 1 == 9");
                break;
            default: // 만족하는 case가 없을 때 실행
                System.out.println("default");

        }


    }

}
