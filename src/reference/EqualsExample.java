package reference;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동"; // 1. 문자열 리터럴 생성 (리터럴 풀로 문자열을 관리 : 같은 문자열 할당시 메모리 재사용을 위해서)
        String strVar2 = "홍길동";

        if(strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        System.out.println();

        String strVar3 = new String("홍길동"); // 2. new 연산자로 생성
        String strVar4 = new String("홍길동"); // 1번과 2번에 따라 비교연산자로 비교했을 때 연산 결과가 달라질 수 있다.

        System.out.println(System.identityHashCode(strVar1)); // .hashCode() 로는 실제 주소값이 다른데 같게 나오는 경우가 있다.
        System.out.println(System.identityHashCode(strVar2)); // .identityHashCode() 이 함수가 가장 정확하다.
        System.out.println(System.identityHashCode(strVar3));
        System.out.println(System.identityHashCode(strVar4));

        System.out.println();

        if(strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println(strVar3.toString() + "    " + strVar4.toString());
            System.out.println(strVar3 == strVar4); // 주소값 다름
            System.out.println("strVar3과 strVar4는 참조가 다름"); // 주소값 다름
            // cf) hashCode() 는 같에 나온다. 실제로는 다른 주소값이다.
        }

//        if(strVar3.equals(strVar4)) {
//            System.out.println("strVar3과 strVar4는 문자열이 같음");
//        }
    }
}