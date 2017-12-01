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
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.json.JSONArray;
import org.json.JSONObject;
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
    
    
    public JSONArray getScoresByDiscNumber(int nDiscos) {
        
        JSONObject json;
        List<Score> lista = (List<Score>) this.session.createCriteria(Score.class)
                .add(Restrictions.eq("numDiscos", nDiscos))
                .addOrder(Order.desc("movimientos"))
                .list();
        JSONArray jarray = new JSONArray();
        json = new JSONObject();        
    
        for (Score score : lista) {
            
            json.put("Nombre", score.getNombre());
            json.put("Numero de Discos", score.getNumDiscos());
            json.put("Movimientos", score.getMovimientos());
            jarray.put(json);
        }
    
        System.out.println(jarray);
        return jarray;
    }
    
}
