package task8;

public class Aquarium {

    public int length, weight, height;
    public String companyName;

    public void getInfo() {
        System.out.println("Ваша высота: " + height);
        System.out.println("Ваша ширина: " + weight);
        System.out.println("Ваша длина:" + length);
        System.out.println("Название фирмы: " + companyName);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getLength() {
        return length;
    }

    public String getCompanyName() {
        return companyName;
    }

    public static void main(String[] args) {
        Aquarium aquarium1 = new Aquarium();
        aquarium1.setLength(50);
        aquarium1.setCompanyName("Aquatic");
        aquarium1.getInfo();
    }
}