/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbm.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Score;

/**
 *
 * @author tank3
 */
public class ScoreDao {
    Session session;
    
    public ScoreDao(){
        session = HibernateUtil.getLocalSession();
    }
    
    public List<Score> getAllScore() {
        return (List<Score>) this.session.createCriteria(Score.class)
                .list();
    }
    
    public boolean saveScore(Score score){
        try {
            Transaction trans = this.session.beginTransaction();
            this.session.save(score);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
