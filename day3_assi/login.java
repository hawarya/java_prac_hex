package com.hash;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("--------Login System ----------");
        System.out.print("Enter UserName :");
        String userName=s.next();
        s.nextLine();
        System.out.print("Enter password");
        String password=s.next();

        LoginService loginservice=new LoginService();
        boolean isvalid=loginservice.valid(userName,password);
        if(isvalid){
            System.out.println("Welcome "+ userName);
            System.out.println("Login successful");
        }
        else{
            System.out.println("Invalid Credentials");
            System.out.println("Try again ....");
        }

    }
}
