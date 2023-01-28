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
        Popugai popugai =new Popugai();
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
        System.out.println(dog);

    }
}
