class Person 
{
    private int age;
    private String name;
    // public int getAge() {
    //     return age;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public Person()
    {
        System.out.println("in constructor");
    }
    
}
class Human {
    public static void main (String args[])
    {
        Person obj = new Person();
        Person obj1 = new Person();

    }
}
