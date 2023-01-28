import java.util.Arrays;

public class Farm {
    String adress;
    Cow[] cows;
    Sheep[] Sheeps;
    Horse[] Horses;
    String OwnerName;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return Sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        Sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return Horses;
    }

    public void setHorses(Horse[] horses) {
        Horses = horses;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public Farm(String adress, Cow[] cows, Sheep[] sheeps, Horse[] horses, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        Sheeps = sheeps;
        Horses = horses;
        OwnerName = ownerName;

    }

    @Override
    public String toString() {
        return "Farm{" +
                "adress='" + adress + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", Sheeps=" + Arrays.toString(Sheeps) +
                ", Horses=" + Arrays.toString(Horses) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}
