package reference;

import java.util.Scanner;

public class Test1 {
                    //extends Object : Object의 child class
    // 내부적으로는 상속되어있다. 모든 자바 클래스는 object를 상속한다.

    // 여기가 정적 필드.
    static Scanner sc = new Scanner(System.in); // static을 씀으로써 밑의 메서드와 영역을 맞춰줘야 한다.
    public static String childMethod() {
//        Scanner sc1 = new Scanner(System.in); // 여기의 sc1 는 child 영역 안에서 끝난다.
        String name = sc.nextLine();
        return "Child Method return!";
    } // 나중에는 static 선언을 하지 않고 childMethod 를 class 를 넣어서 인스턴스화 한다.
    
    // 싱글톤 : 매니저를 만들어서 하나의 객체를 되돌려 주는 형태.
    public static void main(String[] args) {
        String n = sc.nextLine();
        int value = 5;
        System.out.println(value);
//        String name ; // must be initialized
//        String name = null; // printed null
        String name = "Java";
//        System.out.println(name.toString());
        String name1  = "Java";
        System.out.println(name.hashCode());
        //출력 : 2301506 -> 메모리 주소 값
        System.out.println(name1.hashCode());
        System.out.println(name.hashCode() == name1.hashCode()); //true
        // 주소값이 동일하다. 같은 스트링 값을 갖고 있다.
        System.out.println(name1.equals(name)); // true
        // equals 는 안에 들어가 있는 값 비교다.
        // hashCode 는 오버라이딩 돼서 값 비교를 하기 때문에 toString은 못쓴다.
        String name2 = "Java1"; // name, name1과 주소값이 다르다.
        String name3 = new String("Java");
        System.out.println(name3.hashCode() == name1.hashCode()); //true
        System.out.println(name3.equals(name1));
        // mutable, immutable
        // 클래스랑 객체는 구별을 못한다. 둘의 가장 큰 차이? 실체화 되었는지.
        // 클래스는 메모리 할당이 되었고 객체는 되지 않았다.
        // 객체는 instance 라고 한다. api에서 제공하고 있는 해당 클래스를 가져와서 불러들이는 게 instance????
        // instance 는 클래스가 실체화 된 상태. 메모리를 할당했다는 말.
        // injection 할 때도 생각해야 한다.
        // new : 클래스를 불러와서 instance 화, 즉 쓸 수 있는 상태로 만들었다.
        // 스레드1 : 하나의 메인 메서드
        // method area = static area (하나의 스레드가 종료될 때까지 유지된다.)
        // static 은 한 번 fix가 되면 유지가 되는 영역.
        // 유지되는 애들 : 상수, 정적 필드(static field), 생성자 코드들
        // main method 도 static. 외부에서 메소드를 만들고 메인에서 부르고 싶다면? static이어야 호출할 수 있다.
        // 같은 영역에 존재를 해야만 서로 소통할 수 있기 때문이다.
        String n1 = childMethod();
        // stack은 읽어들이는 순서만 제공하고 그 후 pop 돼서 없어진다.
        // 스택으로 운영되어 있기 때문에 block 의 유효범위, scope이 명확히 정해져있다.
        // 실제 메모리는 메소드 영역과 힙 영역에 들어있다.
        // 메소드는 메모리에 담기지 않고 유지만 해준다.
        // 자바는 어떤 기능을 하든 항상 그 대상은 "데이터"다.
        // 클래스를 생성했을 때 JVM은 실행에 할당되는 메모리 공간을 만든다. 그 공간이 크게 세 개(메소드, 힙, 스택)로 크게 나눠져있다.
        // 스택은 메소드에 라벨링 해서 처리하기도 한다.
        // 같은 템플릿을 사용해서 데이터를 표준화시키고, 설계된 데이터 공간 안에 각각의 실제값은 달라야 한다.
        // 이 메모리 공간을 관리하는 게 힙이다. 상속은 힙에서만 이루어진다.
        // 인터페이스는 힙에서 데이터를 뽑아와서 스택에서 오버라이딩 된 게 있는지 찾는다.
        // 모든 레퍼런스 타입은 오브젝트 타입을 올릴 수 있다. 나중에 자식을 복원시킬 수 있다.
        // 자바는 os 에게 협업하자고 제안. 메모리를 많이 잡아먹지 않고 엔진(상수, 리터럴)을 만들었다. 값이 같은 게 들어오면 재할당을 해주지 않는다.
        // 상수 pool 을 만들고 리터럴을 기존에 만들어진 값인지 아닌지 검사한다. 기존에 같은 리터럴 값이 있다면 메모리를 생성해주지 않고 같은 주소를 배정한다.
        // 이러한 검사 메소드가 있어 메모리를 아낄 수 있다.
        // 운영체제가 진짜 주인이고 JVM 은 사랑방 손님이다. JVM이 운영체제에게 요청한 메모리를 알뜰살뜰하게 쓴다.
        // 바이트코드는 클래스 파일이다. 자바 컴파일러는 클래스를 이름(대소문자 구분)과 위치(패키지명)으로 구분한다.
        // 상대경로는 내가 있는 위치를 기준으로 찾아간다. 절대경로는 시스템 기준으로 찾아간다. (C에서부터 시작한다. 물리적 경로라고도 한다.)
        // 힙 영역이 인스턴스다. 힙이 매트릭스다.
        // 스레드는 메소드를 호출할 때마다 프레임이 만들어진다. scope 가 명확하며 main을 포함한다. 지금 이 클래스에서는 프레임이 두개다.
        // 해당 클래스가 종료되어야지만 클래스도 terminated 된다. Process finished with exit code 0 이 용어가 스레드 종료의 의미다.



    }
}
