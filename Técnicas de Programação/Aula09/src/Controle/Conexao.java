/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author autologon
 */
public class Conexao {
    public Connection getConnection() throws ClassNotFoundException{
        Connection conexao = null;
        Class.forName = ("com.mysql.jbdc.Driver");
        conexao = DriverManager.getConnection("jdbc:mysql://localhost/clinica","root",null);
        return conexao;
    }
    
}
