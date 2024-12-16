package exos.exo1;

public class Person {

    private String name;
    private int age;

    public void setName(String name) {
        if(name == null) {
            throw new IllegalArgumentException("Nom illegal");
        }
        this.name = name;
    }
    public void setAge(int age) {
        if(age <=0){
            throw new IllegalArgumentException("Age illegal");
        }
        this.age = age;
    }
}
