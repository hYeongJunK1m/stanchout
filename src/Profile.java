public class Profile {

    String name = "khj";
    int age = 28;

    public static void main(String[] args) {
        Profile pro = new Profile();
        pro.setName("kim");
        pro.printName();
        pro.printAge();
    }
    public void setName(String str){
        name = str;
    }
    public void setAge(int value){
        age = value;
    }
    public void printName(){
        System.out.println("My name is " + name);
    }
    public void printAge(){
        System.out.println("My age is " + age);
    }
}

