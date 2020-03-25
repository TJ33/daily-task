package robot.services.wx.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robot.mapper.wx.user.UserMapper;
import robot.models.wx.user.WXUser;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public WXUser getWXUser(){
        System.out.println("SSSSS=");
        return new WXUser();
    }


}
