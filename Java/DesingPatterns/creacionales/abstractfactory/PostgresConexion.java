/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractfactory;

/**
 *
 * @author julian
 */
public class PostgresConexion extends Conexion {

    public PostgresConexion() {
    }

    @Override
    public String descripcion() {
        return "Conexion Postgres";
    }
}
