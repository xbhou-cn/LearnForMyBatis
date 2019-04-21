/**
 * 
 */
package cn.xbhou.learn.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.apache.log4j.Logger;

/**
 * @author 侯效标
 *
 */
@MappedTypes(String.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyTypeHandler implements TypeHandler<String> {
    private static final Logger LOGGER = Logger.getLogger(MyTypeHandler.class);
    /** (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#setParameter(java.sql.PreparedStatement, int, java.lang.Object, org.apache.ibatis.type.JdbcType)
     */
    public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        LOGGER.info("设置String参数【"+parameter+"】");
        ps.setString(i, parameter);
        
    }

    /** (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, java.lang.String)
     */
    public String getResult(ResultSet rs, String columnName) throws SQLException {
        LOGGER.info("读取String参数1【"+rs.getString(columnName)+"】");
        return rs.getString(columnName);
    }

    /** (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, int)
     */
    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
        LOGGER.info("读取String参数2【"+rs.getString(columnIndex)+"】");
        return rs.getString(columnIndex);
    }

    /** (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.CallableStatement, int)
     */
    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
        LOGGER.info("读取String参数2【"+cs.getString(columnIndex)+"】");
        return cs.getString(columnIndex);
    }

}
