
final public class Employee extends AbstractPerson  {
    private Position position;
    private final String department = "полиция";
    enum Position {ПОМОЩНИК, ПОЛКОВНИК, ГЕНЕРАЛ }

    Employee(String name) throws Exception{
        super(name);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString(){
        return "имя: " + name + " департамент: " + department + " должность: " + position;
    }
}
