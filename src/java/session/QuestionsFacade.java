/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Questions;
import entity.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mera_naam_dwaipayan
 */
@Stateless
public class QuestionsFacade extends AbstractFacade<Questions> {

    @PersistenceContext(unitName = "HelloCloudPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QuestionsFacade() {
        super(Questions.class);
    }
    public void setParameters(String username, String content, String category){
        Questions question = new Questions();
        question.setUsername(username);
        question.setContent(content);
        question.setType(category);
        em.persist(question);
    }
    
}
