package rojo.lab.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="wish.user.service")
public interface UserFeignService {
    @RequestMapping(value="/user/{userEntryID}", method=RequestMethod.GET) 
    String getUserEntry(@PathVariable("userEntryID") Long userEntryID);

}