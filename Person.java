public class Person{

    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void describePerson(){
        System.out.println(name+" is "+age+ " years old");
    }

    public static void main(String[] args){
        Person p1 = new Person("Mats", 20);
        p1.describePerson();
    }


}