/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author pedro
 */
public class PacienteData {

    private Connection con;
    
    public PacienteData() {}

    public List<Paciente> listarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();

        try {

            String sql = "SELECT * FROM paciente;";
            try (PreparedStatement ps = Conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
            //PreparedStatement ps = con.prepareStatement(sql);
            ) {
                ResultSet resultSet = ps.executeQuery();
                Paciente paciente;
                while (resultSet.next()) {
                    paciente = new Paciente();
                    
                    paciente.setId(resultSet.getInt("id"));
                    paciente.setNombre(resultSet.getString("nombre"));
                    paciente.setDni(resultSet.getString("dni"));
                    paciente.setCelular(resultSet.getString("celular"));
                    paciente.setP_actual(resultSet.getDouble("p_actual"));
                    paciente.setFechaNac(resultSet.getTimestamp("fecha_nac"));
                    paciente.setActivo(resultSet.getBoolean("activo"));
                    
                    pacientes.add(paciente);
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error al obtener pacientes" + ex);
        }
        return pacientes;
    } //lista_pacientes
            

}
