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
public abstract class FabricaAbstracta {

    public FabricaAbstracta() {
    }

    protected abstract Conexion crearConexion(String tipo);

}
