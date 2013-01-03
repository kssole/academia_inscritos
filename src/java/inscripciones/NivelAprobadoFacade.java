/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripciones;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class NivelAprobadoFacade extends AbstractFacade<NivelAprobado> {
    @PersistenceContext(unitName = "Academia_InscripcionesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NivelAprobadoFacade() {
        super(NivelAprobado.class);
    }
    
}
