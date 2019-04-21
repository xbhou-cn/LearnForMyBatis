/**
 * 
 */
package cn.xbhou.learn.bean;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import cn.xbhou.learn.enumtype.SexEnum;

/**
 * @author 侯效标
 */
@Alias("user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private int age;
    private Date birthday;
    private SexEnum sex;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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

}
