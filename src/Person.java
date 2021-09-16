
public class Person {
    private int age;
    private int height;
    private String name;
    //private boolean isValid;

    Person(){};

    public void setAge(int Age){
        if(getValidAge(Age)){
            age = Age;
        }else System.out.println("Возраст не валидный");
    }
    public void setHeight(int Height){
        if(getValidHeight(Height)) {
            height = Height;
        }else System.out.println("Рост не валидный");
    }
    public void setName(String Name){
        if(getValidName(Name)) {
            name = Name;
        }else System.out.println("Имя не валидное");
    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
    public String getName(){
        return name;
    }

    public boolean getValidName(String Name){
        if(Name.isEmpty()){
            return false;
        }else return true;
    }
    public boolean getValidAge(int Age){
        if(Age>0&&Age<300){
            return true;
        }else return false;
    }
    public boolean getValidHeight(int Height){
        if(Height>100 && Height<300){
            return true;
        }else return false;
    }

    @Override
    public String toString(){
        return "age: " + age + " height: " + height + " name " + name;
    }

}