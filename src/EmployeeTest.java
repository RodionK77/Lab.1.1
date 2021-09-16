
public class EmployeeTest {
    public static void main(String[] args) throws Exception {
        try {
            Employee e = new Employee("Рой");
            e.setPosition(Employee.Position.ПОМОЩНИК);
            System.out.println(e);
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}