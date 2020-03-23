package robot.mapper.wx.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import robot.models.wx.user.WXUser;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER")
    WXUser findAllUser();
}
