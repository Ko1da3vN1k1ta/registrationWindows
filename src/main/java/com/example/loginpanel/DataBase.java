package com.example.loginpanel;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<User> users = new ArrayList<>();
    static {
        users.add(new User("admin","admin","Vitaliy","Koshkin"));
        users.add(new User("2511","koldaev2005","Nikita","koldaev"));
    }

    public static List<String> items = new ArrayList<>();
    public static int indexUser = 0;
    public static boolean isValidUser(String login) {

        for(int i = 0; i < users.size(); i++) {
            System.out.println("Check login to" + users.get(i).getLogin());
            if(!users.get(i).getLogin().equals(login)) {

                System.out.println("No valid");
                return false;

            } else {
                System.out.println("valid");
                indexUser = i;
                return true;
            }
        }
        return false;
    }

    public static boolean checkPassword(String login, String password){
        if(isValidUser(login)) {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getLogin().equals(login)) {
                    if(users.get(i).getPassword().equals(password)) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}

