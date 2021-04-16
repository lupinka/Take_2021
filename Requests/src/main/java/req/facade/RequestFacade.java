/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package req.facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import req.entities.Request;

/**
 *
 * @author anna
 */
public class RequestFacade extends AbstractFacade<Request> {
    @PersistenceContext(unitName = "RequestsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RequestFacade() {
        super(Request.class);
    } 
}
