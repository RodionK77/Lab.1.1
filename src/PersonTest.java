
public class PersonTest {
    public static void main(String[] args) {
        int age, height;
        String name;
        Person p = new Person();
        p.setAge(0);
        p.setAge(15);
        p.setHeight(0);
        p.setHeight(200);
        p.setName("");
        p.setName("Человек");
        System.out.println(p);
    }
}