/**
 * 
 */
package ssm_learn.part2_myBatis;

import java.util.Date;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import cn.xbhou.learn.bean.Employee;
import cn.xbhou.learn.bean.User;
import cn.xbhou.learn.bean.mapper.EmployeeMapper;
import cn.xbhou.learn.bean.mapper.UserMapper;
import cn.xbhou.learn.enumtype.SexEnum;
import cn.xbhou.learn.util.SqlSessionFactoryUtils;

/**
 * @author 侯效标
 *
 */
public class MyBatisTest {
    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void setUp() {
        System.out.println("Hello setUp");
        sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    }

    @Test
    public void test01() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("赵玉芹1");
        user.setBirthday(new Date());
        user.setAge(1);
        user.setSex(SexEnum.FEMALE);
        int insert = 0;
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            insert = openSession.insert("cn.xbhou.learn.bean.mapper.UserMapper.saveUser", user);
            openSession.commit();
        } catch (Exception e) {
            openSession.rollback();
        } finally {
            if (openSession != null) {
                openSession.close();
            }
        }
        System.out.println(insert);
    }

    @Test
    public void test02() {
        int delete = 0;
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            delete = openSession.delete("cn.xbhou.learn.bean.mapper.UserMapper.deleteUser", "赵玉芹1");
            openSession.commit();
        } catch (Exception e) {
            openSession.rollback();
        } finally {
            if (openSession != null) {
                openSession.close();
            }
        }
        System.out.println(delete);
    }

    @Test
    public void test03() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("侯效标");
        user.setBirthday(new Date());
        user.setAge(24);
        user.setSex(SexEnum.MALE);
        int update = 0;
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            update = openSession.update("cn.xbhou.learn.bean.mapper.UserMapper.updateUser", user);
            openSession.commit();
        } catch (Exception e) {
            openSession.rollback();
        } finally {
            if (openSession != null) {
                openSession.close();
            }
        }
        System.out.println(update);
    }

    @Test
    public void test04() {
        User user = null;
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            user = (User) openSession.selectOne("cn.xbhou.learn.bean.mapper.UserMapper.selectUser", "侯效标");
            openSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            openSession.rollback();
        } finally {
            if (openSession != null) {
                openSession.close();
            }
        }
        System.out.println(user.getId() + "  " + user.getName() + "  " + user.getSex().getName());
    }

    @Test
    public void test05() {
        User user = null;
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            UserMapper mapper = openSession.getMapper(UserMapper.class);
            user = mapper.selectUserByNameAndSex("侯", SexEnum.MALE);
            openSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            openSession.rollback();
        } finally {
            if (openSession != null) {
                openSession.close();
            }
        }
        System.out.println(user.getId() + "  " + user.getName() + "  " + user.getSex().getName());
    }

    @Test
    public void test06() {
        Employee employee = null;
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
            employee = employeeMapper.getEmployee(1l);
        } catch (Exception e) {
            e.printStackTrace();
            openSession.rollback();
        } finally {
            if (openSession != null) {
                openSession.close();
            }
        }
        System.out.println(employee.getRealName());
    }
}
