class Person {
    String name;
    int age;
public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
public void introduce() {
        System.out.println("welcome");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
public static void main(String[] args) {
        Person obj=new Person("Punitha",17);
        obj.introduce();
    }
}
