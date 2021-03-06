/**
 * 
 */
package cn.xbhou.learn.bean;

import org.apache.ibatis.type.Alias;

/**
 * @author 侯效标
 *
 */
@Alias("maleEmployee")
public class MaleEmployee extends Employee {
    private HealthInfo healthInfo;

    /**
     * @return the healthInfo
     */
    public HealthInfo getHealthInfo() {
        return healthInfo;
    }

    /**
     * @param healthInfo the healthInfo to set
     */
    public void setHealthInfo(HealthInfo healthInfo) {
        this.healthInfo = healthInfo;
    }

}
