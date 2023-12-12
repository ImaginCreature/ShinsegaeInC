package reference;

import java.util.Arrays;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        //배열 변수 array1 선언
        int[] array1 = null; // declaration 만으로는 공간이 만들어지지 않는다. 실제 값이 할당 되어야 공간이 할당된다.

        //배열 변수 array2 선언
        int[] array2 = null;

        //배열 변수 array3 선언
        int[] array3 = null; // 객체를 만들 때는 항상 null 을 기본으로 잡아주는 것이 좋다.

        int[] array4 = null;
        System.out.println(array4); // print : null
        array4 = new int[3];
        System.out.println(array4.toString()); // print : [I@776ec8df <= 주소값. 주소값을 hashCode 라고 한다.
        // I means Integer, @ means data type, rest are address
        // 자바는 사용자가 메모리보다는 비즈니스 로직 위주로 이해하기를 원한다.
        // hashCode() 는 실제 주소값은 아니고 JVM이 임의의 수를 배정해 주는 것이다.
        array4[0] = 10;
//        System.out.println(array4); // error : NullPointerException. exit code 1 return. 불완전하게 코드가 끝났다는 exit code.
        System.out.println(array4[0]); // 정상 작동
        array4 = null; //위에서 우리가 할당받은 주소값을 업데이트 한다. 위에서 할당받은 공간에 더 이상 접근할 수 없다.
        // 데이터는 힙에 남아있지만 스택 영역과 힙 영역 사이의 연결이 끝난 것이다.
        // 이 때 힙에 쌓인 쓰레기를 주기적으로 청소하는 것이 garbage collector 다.

        //배열 { 1, 2, 3 }을 생성하고 array1 변수에 대입
        array1 = new int[] {1, 2, 3}; // array1 정수형 배열을 생성하고 초기화를 한꺼번에 정리했다.
        // heap에다 생성해야 하기 때문에 new 를 쓴다. 배열은 ref type 이기 때문이다.

        //배열 { 1, 2, 3 }을 생성하고 array2 변수에 대입
        array2 = new int[3];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

        //배열 변수 array2의 값을 배열 변수 array3에 대입 -> 주소값을 할당하라는 얘기
        array3 = array2;
        boolean result = array1 == array2;
        boolean result1 = array2 == array3;

        // array1과 array2 변수가 같은 배열을 참조하는지 검사 -> 주소값이 같은지 검사

        System.out.println(array1.hashCode() == array2.hashCode()); // 주소값 비교
        System.out.println(array1 == array2); // 주소값 비교
        System.out.println(array1.equals(array2)); // 주소값 비교
        System.out.println(Arrays.equals(array1, array2)); // 값 비교


        // array2와 array3 변수가 같은 배열을 참조하는지 검사
        System.out.println(array3.hashCode() == array2.hashCode());

        // equals 는 String 이 아니라 Object class ? equals는 값 비교
        // 배열은 값 비교가 아니라 주소 비교를 한다. equals 를 쓰면 주소 비교가 된다.
        // 값비교를 하고 싶다면 Arrays.equals(array1, array2) 를 쓰면된다.
    }
}