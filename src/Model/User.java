package Model;

public class User {
    private int ID;
    private String name;
    private int age;
   private String  GENDER;


    public User(int ID, String name, int age, String GENDER) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.GENDER = GENDER;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", GENDER='" + GENDER + '\'' +
                '}';
    }
}


