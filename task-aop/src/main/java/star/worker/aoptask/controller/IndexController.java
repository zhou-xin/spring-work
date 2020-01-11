package star.worker.aoptask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author ZX
 * @create 2020-01-11 10:32
 **/

@RestController
@RequestMapping("/work")
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String work(){
        return "I Can Work";
    }
}
