package com.hash;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
    Map<String,String> map=new HashMap<>();

    public LoginService() {
        map.put("Aishwarya","Aish0987");
        map.put("Nishanth","nishu2112");
        map.put("maha","maha37@13");
        map.put("gayathri","gaya688@");
    }

    public boolean valid(String userName, String password) {
        if(map.containsKey(userName)){
            String ori_password=map.get(userName);
            if(ori_password.equals(password)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
