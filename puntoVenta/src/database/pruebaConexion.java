/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author membr
 */
public class pruebaConexion {
    public static void main(String[] args) {
        Conexion con = Conexion.getInstance();
        con.conectar();
        if (con.connection != null) {
            System.out.println(" Conectado");
        }else {
            System.out.println(" sin conexion");
        }
    }
}
