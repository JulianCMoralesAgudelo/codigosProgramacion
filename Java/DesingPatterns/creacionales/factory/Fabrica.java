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
public class Fabrica {

    protected String tipo;

    public Fabrica(String t) {
        tipo = t;
    }

    public Conexion creaConexion() {
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
