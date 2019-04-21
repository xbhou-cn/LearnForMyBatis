/**
 * 
 */
package cn.xbhou.learn.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author 侯效标
 *
 */
public class SqlSessionFactoryUtils {
    private static final Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;
    private static SqlSessionFactory sessionFactory = null;

    private SqlSessionFactoryUtils() {
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        synchronized (LOCK) {
            if (sessionFactory == null) {
                try {
                    sessionFactory = new SqlSessionFactoryBuilder()
                            .build(Resources.getResourceAsStream("mybatis-config.xml"));
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return sessionFactory;
        }
    }
}
