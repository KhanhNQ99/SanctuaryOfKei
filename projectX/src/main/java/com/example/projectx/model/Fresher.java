package com.example.projectx.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "fresher")
public class Fresher implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lang")
    private String lang;

    @Column(name = "email")
    private String email;

    @Column(name = "idcenter")
    private int idcenter;

    @Column(name = "centername")
    private String centername;

    @Column(name = "score1")
    private int score1;

    @Column(name = "score2")
    private int score2;

    @Column(name = "score3")
    private int score3;

    @Column(name = "average")
    private float average;

    public Fresher() {
    }

    public Fresher(String name, String lang, String email, int idcenter, String centername) {
        this.name = name;
        this.lang = lang;
        this.email = email;
        this.idcenter = idcenter;
        this.centername = centername;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdcenter() {
        return idcenter;
    }

    public void setIdcennter(int idcennter) {
        this.idcenter = idcenter;
    }

    public String getCentername() {
        return centername;
    }

    public void setCentername(String centername) {
        this.centername = centername;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public float getAverage() {
        if (score1 != 0 && score2 != 0 && score3 != 0)
            average = (score1 + score2 + score3) / 3;
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lang='" + lang + '\'' +
                ", email='" + email + '\'' +
                ", idcenter='" + idcenter + '\'' +
                ", centername='" + centername + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                ", average=" + average +
                '}';
    }
}
