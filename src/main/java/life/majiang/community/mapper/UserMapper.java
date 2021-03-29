package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 任飞
 * @date 2021-3-16 22:14
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id,login,token,gmt_create,gmt_modified) values (#{name},#{login},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

    @Select("select * from user where token =#{token}")
    User findByToken(@Param("token") String token);

}
