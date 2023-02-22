package org.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Relationship extends AbstractBaseClass {


    @ManyToMany
    @JoinColumn(name = "relationship_id")
    private final List<User> users = new ArrayList<>();

    public Relationship(){
        super();
    }




}
