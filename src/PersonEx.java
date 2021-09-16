public class PersonEx {
    private int age;
    private int height;
    private String name;
    private String gender;
    public enum Gender {
        MALE(1, "мужчина"), FEMALE(2, "женщина"), OTHER(1024, "другое");

        private int value;
        private String strvalue;

        Gender(int value, String strvalue) {
            this.value = value;
            this.strvalue = strvalue;
        }
        public  int getValue(){
            return this.value;
        }
        public  String getStrvalue(){
            return this.strvalue;
        }
    }

    PersonEx(){};

    public void setGender(String g){
        if(g == "MALE"){
            gender = Gender.MALE.getStrvalue();
        }else if (g == "FEMALE"){
            gender = Gender.FEMALE.getStrvalue();
        }else gender = Gender.OTHER.getStrvalue();
    }

    public void setAge(int Age) throws Exception{
        if(!(Age>0&&Age<30000)){
            throw new Exception("Возраст не валидный");
        }
        else age = Age;
    }
    public void setHeight(int Height) throws Exception{
        if(!(Height>100 && Height<300)){
            throw new Exception("Рост не валидный");
        }
        else height = Height;
    }
    public void setName(String Name) throws Exception{
        if(Name.isEmpty()){
            throw new Exception("Строка пустая");
        }else name = Name;

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

    @Override
    public String toString(){
        return "age: " + age + " height: " + height + " name: " + name + " gender " + gender;
    }

}
