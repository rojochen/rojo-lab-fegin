package rojo.lab.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserFeignService userFeignService;

    @RequestMapping(value="/users/{userEntryID}", method=RequestMethod.GET) 
    public String getUserEntry(@PathVariable Long userEntryID) {
        // 通过HTTP调用远程服务
        return userFeignService.getUserEntry(userEntryID);
    }
}
