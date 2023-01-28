import java.lang.reflect.Array;
import java.util.Arrays;

public class Class {
    int number;
    String soz;
    int[] mass;


    public Class() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMass() {
        return mass;
    }

    public void setMass(int[] mass) {
        this.mass = mass;
    }

    public Class(int number, String soz, int[] mass) {
        this.number = number;
        this.soz = soz;
        this.mass = mass;

    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", soz='" + soz + '\'' +
                ", mass=" + Arrays.toString(mass) +
                '}';
    }
}
