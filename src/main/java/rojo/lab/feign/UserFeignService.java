package rojo.lab.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="rojo-eureka-user-client")
public interface UserFeignService {
    @RequestMapping(value="/users/{userEntryID}", method=RequestMethod.GET) 
    String getUserEntry(@PathVariable("userEntryID") Long userEntryID);

}