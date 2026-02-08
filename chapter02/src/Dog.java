public class Dog {
    String name;
    int age;

    public void bark(){
        System.out.println("Гаф! Меня зовут " + name);
    }
    public void happyBirthday(){
        age++;
        System.out.println("Теперь мне " + age + " лет ");
    }
}
