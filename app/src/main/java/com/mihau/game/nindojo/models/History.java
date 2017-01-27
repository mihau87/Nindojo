package com.mihau.game.nindojo.models;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by x on 21.01.2017.
 */

@Table(name = "History")
public class History {

        @Column(name = "Id", index = true)
        private int id;

        @Column(name = "Name")
        private String name;

        @Column(name = "Points")
        private int points;

        @Column(name = "FamilyMemberId")
        private int FamilyMemberId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        public int getFamilyMemberId() {
            return FamilyMemberId;
        }

        public void setFamilyMemberId(int familyMemberId) {
            FamilyMemberId = familyMemberId;
        }

    }