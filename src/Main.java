public class Main {
    public static void main(String[] args) {
    /*    Student student = new Student("Ermek",23);
        Student student1 = new Student("Eraly",20);
        Student student2 = new Student("Elmirbek",18);
        System.out.println(student);
        System.out.println(student1);
//        System.out.println(student2); */
//        Class a = new Class(10,"mektep",new int[]{5,76,23,90});
//        System.out.println(a);
 /*       Popugai popugai =new Popugai();
        popugai.setName("eagle");
        popugai.setAge(3);
        popugai.setColor("green");

        Cat cat = new Cat();
        cat.setName("leo");
        cat.setAge(5);
        cat.setColor("white");

        Dog dog = new Dog();
        dog.setName("alabai");
        dog.setAge(8);
        dog.setColor("black");

        System.out.println(popugai);
        System.out.println(cat);
        System.out.println(dog); */
        Cow cow = new Cow(300,13,"qunagyn","Boria");
        Cow cow1 = new Cow(300,13,"qunagyn","Boria");
        Cow cow2 = new Cow(300,13,"qunagyn","Boria");
        Cow cow3 = new Cow(300,13,"qunagyn","Boria");
        Cow cow4 = new Cow(300,13,"qunagyn","Boria");
        Sheep sheep = new Sheep(70,4,"sooluk","Pino");
        Sheep sheep1 = new Sheep(70,4,"sooluk","Pino");
        Sheep sheep2 = new Sheep(70,4,"sooluk","Pino");
        Horse horse = new Horse(500,8,"aigyr","Ahiles");
        Horse horse1 = new Horse(500,8,"aigyr","Ahiles");

        Farm farm1 = new Farm("Nooken",new Cow[]{cow1,cow2,cow3,cow4},new Sheep[]{sheep1,sheep,sheep2},
                new Horse[]{horse1,horse},"Isxak" );


        Farm farm2 = new Farm("Nooken",new Cow[]{cow1},new Sheep[]{sheep1},
                new Horse[]{horse1},"Bolot");

        System.out.println(farm1);

    }
}
