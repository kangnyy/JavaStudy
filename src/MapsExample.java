import java.util.HashMap;

public class MapsExample {

    public static void main(String[] args) {

        // Map
        // 키 - 값 쌍을 요소로 가지는 데이터의 모음, 순서 구분 없음(리스트와의 차이점)
        // 키는 중복 불가, 값은 중복 허용
        // HashMap

        HashMap map = new HashMap();
        map.put("age", 30);
        map.put("mbti", "INFP");

        System.out.println(map.get("age"));

        // HashMap<String, String> map = new HashMap(); <- String만 받음

    }
}
