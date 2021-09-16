
public class Client extends AbstractPerson {
    private String service;
    private float price;

    Client(String name) throws Exception{
        super(name);
    }
    public void setService(String service) throws Exception{
        if(service.isEmpty()){
            throw new Exception("Строка пустая");
        }
        else this.service = service;
    }
    public void setPrice(float price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "имя: " + name + " сфера обслуживания: " + service + " цена услуги: " + price;
    }
}
