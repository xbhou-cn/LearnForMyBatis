/**
 * 
 */
package cn.xbhou.learn.bean;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

import cn.xbhou.learn.enumtype.SexEnum;

/**
 * @author 侯效标
 *
 */
@Alias("employee")
public class Employee {
    private Long id;
    private String realName;
    private SexEnum sex;
    private Date birthday;
    private String mobile;
    private String email;
    private String position;
    private String note;
    // 一对一
    private WorkCard workCard;
    // 一对多
    private List<EmployeeTask> employeeTasks;

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
     * @return the realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName the realName to set
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return the sex
     */
    public SexEnum getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
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

    /**
     * @return the workCard
     */
    public WorkCard getWorkCard() {
        return workCard;
    }

    /**
     * @param workCard the workCard to set
     */
    public void setWorkCard(WorkCard workCard) {
        this.workCard = workCard;
    }

    /**
     * @return the employeeTasks
     */
    public List<EmployeeTask> getEmployeeTasks() {
        return employeeTasks;
    }

    /**
     * @param employeeTasks the employeeTasks to set
     */
    public void setEmployeeTasks(List<EmployeeTask> employeeTasks) {
        this.employeeTasks = employeeTasks;
    }

}
