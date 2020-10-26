/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.factory;

/**
 *
 * @author julian
 */
public class SqlServerConexion extends Conexion {

    public SqlServerConexion() {
    }

    @Override
    public String descripcion() {
        return "Conexion SQLServer";
    }

}
