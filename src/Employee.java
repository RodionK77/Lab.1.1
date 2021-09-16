
final public class Employee extends AbstractPerson  {
    final String department = "полиция";
    final String position = "помощник";

    Employee(String name) throws Exception{
        super(name);
    }

    @Override
    public String toString(){
        return "имя: " + name + " департамент: " + department + " должность: " + position;
    }
}
