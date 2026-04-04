public class TypeCasting { // 형변환

    public static void main(String[] args) {

        // 형변환
        // byte < short < int < long <<< float < double

        // 강제 형변환
        int a = 128;
//        short b = a;    //  작은 범위에 큰 범위의 데이터를 넣으려고 하면 오류
        short b = (short)a;
        byte c = (byte)a;       // byte는 -128 ~ 127이라서 128을 표현할 수 없음(overflow)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);  // -128

        // 자동 형변환
        // 큰 범위에 작은 범위 데이터 넣으려고 하면 자동으로 형변환됨
        short x = 10;
        int y = x;

        System.out.println(x);
        System.out.println(y);

        int m = 80;
        double n = m;
        System.out.println(m);
        System.out.println(n);

        double k = 10.3454657656454;
        float p = (float) k;
        System.out.println(k);      // 10.3454657656454
        System.out.println(p);      // 10.345466

        int e = 10;
        short f = 20;

//        short g = (short)e + f; 이렇게 하면 안됨
        short g = (short) (e + f);
        System.out.println(g);


    }
}
