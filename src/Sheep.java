public class Sheep {
    int weight;
    int age;
    String gender;
    String nickname;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Sheep(int weight, int age, String gender, String nickname) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
