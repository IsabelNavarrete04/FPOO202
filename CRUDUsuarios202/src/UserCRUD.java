/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isabe
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    
    private Connection conexion;
    
    public UserCRUD (){
        conexion = ConexionMySQL.conectar();

    }
    
    public boolean crearUsuario(String nom, String cor, String contra){
        String sqlInsert = "INSERT INTO usuarios(nombre, correo, contrasena)VALUE (?, ?, ?)";
        
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setString(1, nom);
            ps.setString(2, cor);
            ps.setString(3, contra);
            return ps.executeUpdate() > 0;
            
        }
        
        catch (SQLException e){
            System.out.print("Error al intentar insertar: "+ e.getMessage());
            return false;
        
        }
    } // fin del insert
    
    public ResultSet obtenerUsuarioPorID(int id){
        String selectSql ="SELECT * FROM usuarios where id = ?";
        
        try{
           PreparedStatement ps = conexion.prepareStatement(selectSql);
           ps.setInt(1, id);
           return ps.executeQuery();
        }
        
        catch(SQLException e){
            System.out.print("Error al intentar consultar: "+ e.getMessage());
            return null;
        
        }
    
    }// fin obtener usuario id
    
    public ResultSet obtenerTodos(){
        String sqlTodos ="SELECT * FROM usuarios";
        
        try{
        PreparedStatement ps = conexion.prepareStatement(sqlTodos);
           return ps.executeQuery();
        
        }
        catch(SQLException w){
            System.out.println("Error al consultar" + w.getMessage());
            return null;
        
        }
    
    
    }

    
    
    
} 
