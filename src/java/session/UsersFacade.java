/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mera_naam_dwaipayan
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {

    @PersistenceContext(unitName = "HelloCloudPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }
    
    public void setParameters(String username, String password){
        Users user = new Users();
        user.setName(username);
        user.setSubscriptions(password);
        em.persist(user);
    }
    public int getParameters(String username, String password){
        
        List<Users> var = em.createNamedQuery(username).getResultList();
        if(var.isEmpty() == true){
            return 0;
        }
        else return 1;
    }
   
}
