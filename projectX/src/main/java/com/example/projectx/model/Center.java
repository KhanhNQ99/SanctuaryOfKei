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
    private String centername;

    @Column(name = "freshercount")
    private int freshercount;

    public Center() {
    }

    public Center(String name) {
        this.centername = name;
    }

    public Center(Long idcenter, String centername, int freshercount) {
        this.idcenter = idcenter;
        this.centername = centername;
        this.freshercount = freshercount;
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
        return centername;
    }

    public void setName(String name) {
        this.centername = name;
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
                "idcenter=" + idcenter +
                ", centername='" + centername + '\'' +
                ", freshercount=" + freshercount +
                '}';
    }
}
