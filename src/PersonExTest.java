
public class PersonExTest {
    public static void main(String[] args) {
        PersonEx p = new PersonEx();
        PersonEx.Gender g;


        try{
            p.setAge(-4);
        } catch (IllegalNameException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            p.setAge(20);
        } catch (IllegalNameException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            p.setHeight(555);
        } catch (IllegalNameException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            p.setHeight(180);
        } catch (IllegalNameException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            p.setName(" ");
        } catch (IllegalNameException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            p.setName("Человек");
        } catch (IllegalNameException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        p.setGender(PersonEx.Gender.MALE);
        System.out.println(p);
    }
}