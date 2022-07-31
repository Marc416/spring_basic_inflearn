package hello.core.singletone;

public class MemberServiceSingleTone {
    // static 으로 자신을 선언하여서 클래스가 메모리에 로드 될 때 static 메모리에 생성됨
    private final static MemberServiceSingleTone instance = new MemberServiceSingleTone();

    // 싱글톤은 다른 곳에서 생성하면 안되기 때문에 생성자를 private으로 접근을 금지시킨다.
    private MemberServiceSingleTone() {
    }

    // 객체를 부르는 메서드도 하나의 메모리에서 부를 수 있도록 해야 한다.
    public static MemberServiceSingleTone getInstance() {
        return instance;
    }

    public void myName() {
        System.out.println("joonis");
    }

}

//class OtherClass{
//    MemberServiceSingleTone memberServiceSingleTone = new MemberServiceSingleTone();
//}