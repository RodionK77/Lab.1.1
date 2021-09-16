
public class ClientTest {
    public static void main(String[] args) throws Exception {
        try {
            Client cl = new Client("Альфред");
            try {
                cl.setService("");
            } catch (IllegalNameException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                cl.setService("Обслуга");
            } catch (IllegalNameException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }

            cl.setPrice(1500);

            System.out.println(cl);
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
