import java.time.LocalDate;

//Damir Amankulov
public class Main {
    public static void main(String[] args) {
        InfoSellers infoSellers1, infoSellers2, infoSellers3;
        infoSellers1 = new InfoSellers();
        infoSellers2 = new InfoSellers();

        infoSellers1.setName("Pedro");
        infoSellers1.setBirthday(LocalDate.of(1990, 2, 1));

        infoSellers2.setName("Pablo");
        infoSellers2.setBirthday(LocalDate.of(1982, 5, 12));

        System.out.println("First Seller name is: " + infoSellers1.getName());
        System.out.println("Second Seller name is: " + infoSellers2.getName());
    }
}