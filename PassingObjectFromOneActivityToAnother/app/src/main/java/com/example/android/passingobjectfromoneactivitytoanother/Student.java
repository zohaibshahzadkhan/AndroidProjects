package com.example.android.passingobjectfromoneactivitytoanother;

import java.io.Serializable;

/**
 * Created by Zohaib on 3/29/2018.
 */

public class Student implements Serializable {
    private String name;
    private Integer regNo;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getRegNo() {
        return regNo;
    }
    public void setRegNo(Integer regNo) {
        this.regNo = regNo;
    }

    @Override
    public String toString() {
        return "Student{name:"+name+", regNo:"+regNo+"}";
    }
}
