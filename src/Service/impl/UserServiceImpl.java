package Service.impl;

import Dao.UserDao;
import Model.User;
import Service.UserService;

public class UserServiceImpl implements UserService {

private UserDao  UserDao;
public UserServiceImpl(UserDao userDao){
    this.UserDao=userDao;

    }

    @Override
    public void addUser(UserService user) {
        UserDao.setUsers((User) user);

    }

    @Override
    public void searUserID(int n){
    int counter=0;
    try{
        for (int i =0; i<UserDao.getUsers().size();i++){
            if (UserDao.getUsers().get(i).getID()==n){
                System.out.println("________ID tabylgan jok "+UserDao.getUsers().get(i).getID()+"  "
                        + UserDao.getUsers().get(i));
                counter++;
            }
            if (counter==0){
                throw new RuntimeException();
            }
        }
    }
    catch (RuntimeException e){
        System.out.println("TABYLGAN JOK");
    }
    }

    @Override
    public void removeUser(int n) {

    }

    @Override
    public void getUsers() {

    }

    @Override
    public void addUser(User[] users) {

    }

    @Override
    public void searUserID() {

    }
}
