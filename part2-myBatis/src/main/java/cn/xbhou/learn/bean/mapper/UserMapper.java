/**
 * 
 */
package cn.xbhou.learn.bean.mapper;

import org.apache.ibatis.annotations.Param;

import cn.xbhou.learn.bean.User;
import cn.xbhou.learn.enumtype.SexEnum;

/**
 * @author 侯效标
 *
 */
public interface UserMapper {
    public void saveUser(User user);

    public void deleteUser(String name);

    public void updateUSer(User user);

    public User selectUser(String name);

    public User selectUserByNameAndSex(@Param("name") String name, @Param("sex") SexEnum sex);
}
