package com.pojo;
// Generated Sep 26, 2017 4:12:08 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TcDesc generated by hbm2java
 */
public class TcDesc  implements java.io.Serializable {


     private String tcId;
     private String description;
     private Set tcStatuses = new HashSet(0);

    public TcDesc() {
    }

	
    public TcDesc(String tcId, String description) {
        this.tcId = tcId;
        this.description = description;
    }
    public TcDesc(String tcId, String description, Set tcStatuses) {
       this.tcId = tcId;
       this.description = description;
       this.tcStatuses = tcStatuses;
    }
   
    public String getTcId() {
        return this.tcId;
    }
    
    public void setTcId(String tcId) {
        this.tcId = tcId;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set getTcStatuses() {
        return this.tcStatuses;
    }
    
    public void setTcStatuses(Set tcStatuses) {
        this.tcStatuses = tcStatuses;
    }




}


