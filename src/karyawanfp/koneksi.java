/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
j
*/
package karyawanfp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author YOGA SAPUTRA
 */
public class koneksi {
  Connection koneksi=null;
     public static Connection koneksiDB(){
 try { 
     Class.forName("com.mysql.jdbc.Driver");
    Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesa","root","");
       return koneksi;
 }catch(Exception e) {
 JOptionPane.showMessageDialog(null, e);
     return null;
    }
 }    
    public static void main(String[] args) {
       
    }
}
