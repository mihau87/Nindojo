package com.mihau.game.nindojo.models;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by x on 21.01.2017.
 */

@Table(name = "Points")
public class Points {

    @Column(name = "FamilyMemberId")
    private int familyMemberId;

    @Column(name = "TotalPoints")
    private int totalPoints;

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getFamilyMemberId() {
        return familyMemberId;
    }

    public void setFamilyMemberId(int familyMemberId) {
        this.familyMemberId = familyMemberId;
    }
}
