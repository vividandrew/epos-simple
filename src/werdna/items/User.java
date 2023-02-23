/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package werdna.items;

/**
 *
 * @author Andre
 */
public class User {
    private String name;
    private String username;
    private String password;
    
    public User(String name, String username, String password)
    {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public String getName(){return this.name;}
    
    public boolean isValidUser(String username, String password)
    {
        return isUsernameValid(username) && isPasswordValid(password);
    }
    
    private boolean isPasswordValid(String password)
    {
        return this.password.equals(password);
    }
    private boolean isUsernameValid(String username)
    {
        return this.username.equals(username);
    }
}
