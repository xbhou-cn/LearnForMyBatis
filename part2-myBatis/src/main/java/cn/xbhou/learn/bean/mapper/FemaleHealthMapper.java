/**
 * 
 */
package cn.xbhou.learn.bean.mapper;

import cn.xbhou.learn.bean.HealthInfo;

/**
 * @author 侯效标
 *
 */
public interface FemaleHealthMapper {
    public HealthInfo getFemaleHealthInfoByEmpId(Long empId);
}
