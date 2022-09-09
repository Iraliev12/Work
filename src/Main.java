import Dao.UserDao;
import Model.User;
import Service.impl.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"argen",20,"man");
User user1 = new User(2,"kasiet",22,"woman");
User user2 = new User(3,"bakai",28,"man");
User[]users={user,user1,user2};

UserDao userDao = new UserDao();
UserServiceImpl userService = new UserServiceImpl(userDao);
userService.addUser(users);
        Scanner scan = new Scanner(System.in);
        System.out.println("if you want to \n__ find user by ID_enter 1\n__DElete 2\n___print all users _3:");
        int a = scan.nextInt();
        switch (a){
            case 1-> {
                System.out.println("Enter users ID");
                String ID = scan.next();
                userService.searUserID();
            }
            case 2->{
                System.out.println("Delete by ID");
                String id = scan.next();
                userService.removeUser(user.getID());
            }
            case 3->{
                System.out.println(user);
                System.out.println(user1);
                System.out.println(user2);
            }
        }
    }
}
























