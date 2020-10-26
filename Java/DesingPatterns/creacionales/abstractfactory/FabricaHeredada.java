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
public class FabricaHeredada extends FabricaAbstracta {

    @Override
    protected Conexion crearConexion(String tipo) {
        if (tipo.equalsIgnoreCase("Oracle")) {
            return new OracleConexion();
        } else if (tipo.equalsIgnoreCase("SQLServer")) {
            return new SqlServerConexion();
        } else if (tipo.equalsIgnoreCase("MySql")) {
            return new MySqlConexion();
        } else {
            return new PostgresConexion();
        }
    }

}
