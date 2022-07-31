package hello.core.singletone;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SingleToneTest {
    @Test
    void singleTone() {
        MemberServiceSingleTone m1 = MemberServiceSingleTone.getInstance();
        MemberServiceSingleTone m2 = MemberServiceSingleTone.getInstance();
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        // isEqualTo 는 값비교
        assertThat(m1).isEqualTo(m2);
        // isSameAs 는 주소 값 비교
        assertThat(m1).isSameAs(m2);
    }
}
