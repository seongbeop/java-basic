package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }
    //생성자 2개 , 생성자 오버로딩

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

