package com.mihau.game.nindojo.models;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by x on 21.01.2017.
 */

@Table(name = "FamilyMembers")
public class FamilyMembers {

    @Column(name = "Name")
    private int id;

    @Column(name = "Name")
    private String name;

}
