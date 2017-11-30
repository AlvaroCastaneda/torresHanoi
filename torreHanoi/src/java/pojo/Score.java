/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tank3
 */
@Entity
@Table(name = "Score")
public class Score {
    @Id @GeneratedValue
    @Column(name = "idScore")
    private int idScore;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "numDiscos")
    private int numDiscos;
    
    @Column(name = "movimientos")
    private int movimientos;

    /**
     * @return the idScore
     */
    public int getIdScore() {
        return idScore;
    }

    /**
     * @param idScore the idScore to set
     */
    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numDiscos
     */
    public int getNumDiscos() {
        return numDiscos;
    }

    /**
     * @param numDiscos the numDiscos to set
     */
    public void setNumDiscos(int numDiscos) {
        this.numDiscos = numDiscos;
    }

    /**
     * @return the movimientos
     */
    public int getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }
}
