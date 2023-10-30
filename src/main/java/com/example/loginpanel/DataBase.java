package com.example.loginpanel;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<User> users = new ArrayList<>();

    static {
        users.add(new User("1234","admin","Vitaliy","Kos"));
        users.add(new User("2511","k","Nikita","ko"));
    }

    public static List<String> items = new ArrayList<>();
    public static int indexUser = 0;

    public static boolean isValidUser(int r, String login) {
        System.out.println("Check login to" + users.get(r).getLogin());
        if (!users.get(r).getLogin().equals(login)) {

            System.out.println("No valid");
            return false;

        } else {
            System.out.println("valid");
            indexUser = r;
            return true;
        }
    }

    public static boolean checkPassword(String login, String password) {
        boolean result = false;
        for (int e = 0; e < users.size(); e++) {
            if (isValidUser(e,login)) {
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getLogin().equals(login)) {
                        if (users.get(i).getPassword().equals(password)) {
                            result = true;
                            break;
                        }
                    } else {
                        result = false;
                    }
                }
            } else {
                result = false;
            }
        }
        return result;
    }
}
