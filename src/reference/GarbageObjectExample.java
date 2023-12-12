package reference;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        // "여행"에 해당하는 String 객체를 쓰레기로 만듦
        hobby = null;
        String kind1 = "자동차";
        // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
        String kind2 = kind1; // 값 복사
        int a = 3;
        int b = a; // 3이라는 실제 값을 복사.
        // 모두 자동차라는 객체를 보고 있다. 이렇게 같은 객체를 보는 것을 참조한다고 한다.
        System.out.println(a + " " + b);
        // "자동차"에 해당하는 String 객체는 쓰레기가 아님

        // kind1, kind2의 번지를 비교, 값 비교
        boolean result = kind1.toString() == kind2.toString();
        System.out.println(result);

    }
}
