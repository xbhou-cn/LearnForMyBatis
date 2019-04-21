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

import cn.xbhou.learn.enumtype.SexEnum;

/**
 * @author 侯效标
 *
 */
@MappedTypes(SexEnum.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class MySexEnumTypeHandler implements TypeHandler<SexEnum> {
    private static final Logger LOGGER=Logger.getLogger(MySexEnumTypeHandler.class);

    /** (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#setParameter(java.sql.PreparedStatement, int, java.lang.Object, org.apache.ibatis.type.JdbcType)
     */
    public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
        LOGGER.info("设置SexEnum参数【"+parameter.getName()+"】");
        ps.setInt(i, parameter.getId());
        
    }

    /** (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, java.lang.String)
     */
    public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
        SexEnum sexEnum=SexEnum.getSexEnum(rs.getInt(columnName));
        LOGGER.info("读取SexEnum参数1【"+sexEnum.getName()+"】");
        return sexEnum;
    }

    /** (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, int)
     */
    public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        SexEnum sexEnum=SexEnum.getSexEnum(rs.getInt(columnIndex));
        LOGGER.info("读取SexEnum参数2【"+sexEnum.getName()+"】");
        return sexEnum;
    }

    /** (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.CallableStatement, int)
     */
    public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        SexEnum sexEnum=SexEnum.getSexEnum(cs.getInt(columnIndex));
        LOGGER.info("读取SexEnum参数3【"+sexEnum.getName()+"】");
        return sexEnum;
    }

}
