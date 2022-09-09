package Service;

import Model.User;

public interface UserService {
 void addUser(UserService user);
 void searUserID(int n);
 void removeUser(int n);
 void getUsers();

    void addUser(User[] users);

    void searUserID();
}
