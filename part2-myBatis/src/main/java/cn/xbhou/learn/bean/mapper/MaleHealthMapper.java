/**
 * 
 */
package cn.xbhou.learn.bean.mapper;

import cn.xbhou.learn.bean.HealthInfo;

/**
 * @author 侯效标
 *
 */
public interface MaleHealthMapper {
    public HealthInfo getMaleHealthInfoByEmpId(Long empId);
}
