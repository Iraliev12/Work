package Dao;

import Model.User;

import java.util.ArrayList;

public class UserDao {
    private String Users;
    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(User user) {
        users.add(user);
    }

    public void getAllUsers() {
        for (User user : users) {
            System.out.println("name: " + user.getName());
            System.out.println("age: " + user.getAge());
            System.out.println("gender: " + user.getGENDER());
            System.out.println("id: " + user.getID());
            System.out.println("------------------------------");
        }
    }
}