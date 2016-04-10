/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final;
import java.io.Serializable;


/**
 *
 * @author Sergio
 */
public class Usus {
    private String login;
    private String password;

    public Usus() {
    }

    public Usus(String login, String password) {
        this.login = login;
        this.password = password;
    }
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
}
