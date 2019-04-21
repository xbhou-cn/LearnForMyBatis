/**
 * 
 */
package cn.xbhou.learn.bean;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

/**
 * @author 侯效标
 *
 */
@Alias("healthInfo")
public class HealthInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long empId;
    private String heard;
    private String liver;
    private String note;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the empId
     */
    public Long getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    /**
     * @return the heard
     */
    public String getHeard() {
        return heard;
    }

    /**
     * @param heard the heard to set
     */
    public void setHeard(String heard) {
        this.heard = heard;
    }

    /**
     * @return the liver
     */
    public String getLiver() {
        return liver;
    }

    /**
     * @param liver the liver to set
     */
    public void setLiver(String liver) {
        this.liver = liver;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

}
