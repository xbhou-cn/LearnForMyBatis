/**
 * 
 */
package cn.xbhou.learn.bean.mapper;

import cn.xbhou.learn.bean.EmployeeTask;

/**
 * @author 侯效标
 *
 */
public interface EmployeeTaskMapper {
    public EmployeeTask getTaskForEmployee(Long empId);
}
