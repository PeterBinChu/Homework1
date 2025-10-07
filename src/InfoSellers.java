import java.time.LocalDate;

public class InfoSellers {
    private String name;
    private LocalDate birthday;
    private int contracts;
    private double carrotTons;
    private boolean senior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getContracts() {
        return contracts;
    }

    public void setContracts(int contracts) {
        this.contracts = contracts;
    }

    public double getCarrotTons() {
        return carrotTons;
    }

    public void setCarrotTons(double carrotTons) {
        this.carrotTons = carrotTons;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }
}
