package feignService.s;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class T {


    @RequestMapping("/btest")
    public String get(@RequestBody String s) {
        System.out.println(s);
        User user = JSONObject.parseObject(s, User.class);
        return user.getId();
    }
    @RequestMapping("/btest01")
    public String get(@RequestBody User user) {
        return user.getId();
    }
    @GetMapping ("/03")
    public String get03() throws InterruptedException {
        Thread.sleep(3000);
        return "11111111";
    }
}
