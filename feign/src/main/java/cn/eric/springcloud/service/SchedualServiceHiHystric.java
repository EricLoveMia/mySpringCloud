package cn.eric.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Eric
 * @version 1.0
 * @ClassName: SchedualServiceHiHystric
 * @Description: TODO
 * @company lsj
 * @date 2019/7/22 11:21
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "hello error" + name;
    }
}
