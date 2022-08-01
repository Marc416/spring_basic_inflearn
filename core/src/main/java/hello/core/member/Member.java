package hello.core.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private Long id;
    private String name;
    private Grade grade;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        // 롬복의 기능 : 세터가 없어도 쓸 수 있다.
//        setGrade(Grade.VIP);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Grade getGrade() {
//        return grade;
//    }
//
//    public void setGrade(Grade grade) {
//        this.grade = grade;
//    }

}
