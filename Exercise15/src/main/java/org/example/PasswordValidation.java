package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class PasswordValidation {
    public static void main(String[] args){
        String userpassword;
        String password = "abc$123";
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is the password: ");
        userpassword = scnr.next();
        if(userpassword.equals(password)){
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }
    }
}
