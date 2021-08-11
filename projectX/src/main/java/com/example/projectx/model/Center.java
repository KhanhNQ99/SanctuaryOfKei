package com.example.projectx.model;

//import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "center")
public class Center implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idcenter")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idcenter;

    @Column(name = "centername")
    private String name;

    @Column(name = "freshercount")
    private int freshercount;

    public Center() {
    }

    public Center(String name) {
        this.name = name;

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return idcenter;
    }

    public void setId(Long id) {
        this.idcenter = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFreshercount() {
        return freshercount;
    }

    public void setFreshercount(int freshercount) {
        this.freshercount = freshercount;
    }

    @Override
    public String toString() {
        return "Center{" +
                "id=" + idcenter +
                ", name='" + name + '\'' +
                ", freshercount=" + freshercount +
                '}';
    }
}
