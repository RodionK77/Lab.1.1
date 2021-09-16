
public abstract class AbstractPerson implements HumanInterface {
    String name;

    AbstractPerson(){}

    AbstractPerson(String name) throws Exception{
        if(name.isEmpty()){
            throw new Exception("Строка имени пустая");
        }else this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public  String think(){
        return "Вжум-вжум";
    }
}