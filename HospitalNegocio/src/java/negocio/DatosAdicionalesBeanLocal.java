/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Entidades.DatosAdicionales;
import javax.ejb.Local;

/**
 *
 * @author DT8
 */
@Local
public interface DatosAdicionalesBeanLocal {
    public String CrearAdicional(DatosAdicionales ad);
}
