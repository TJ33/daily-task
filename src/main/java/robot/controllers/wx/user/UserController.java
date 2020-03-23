package robot.controllers.wx.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import robot.models.wx.user.WXUser;
import robot.services.wx.user.UserService;

@Controller
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public WXUser getWXUser(){
        System.out.println("CCCC++++++++++++++++");
        return userService.getWXUser();
    }
}
