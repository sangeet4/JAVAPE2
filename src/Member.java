import java.util.*;

public class Member{
    String name;
    int age;
    double salary;

    public Member(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class MemberVariable{
    public String initNPrint(String name, int age, double salary){
        Member memb = new Member(name, age, salary);
        return memb.name+" "+memb.age+" "+memb.salary;
    }
}
