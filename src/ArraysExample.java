public class ArraysExample {
    public static void main(String[] args) {

        // 배열 (Arrays)

        int[] price = {10000, 9000, 40000, 7000};
        String[] mbti = {"INFP", "ENFP", "ISTJ", "ESTP"};

//        System.out.println(price[0]);
//        System.out.println(mbti[0]);

        // 해당 인덱스값 수정
//        price[1] = 8000;
//        System.out.println(price[1]);
//        System.out.println(price);      //객체라서 주소값이 나옴


        // for 반복문 활용

        System.out.println(mbti.length);

        for (int i = 0; i < mbti.length; i++) {
            System.out.println(mbti[i]);
        }


    }
}
