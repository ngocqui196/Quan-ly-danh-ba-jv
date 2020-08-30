public class PhoneBook {
    private String Name;
    private int SDT;

    public PhoneBook() {
    }

    public PhoneBook(String name, int SDT) {
        Name = name;
        this.SDT = SDT;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "Name='" + Name + '\'' +
                ", SDT=" + SDT +
                '}';
    }

}
