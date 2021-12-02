package ssm.contorller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssm.pojo.testPojo;
import ssm.service.testService;

@RestController
@RequestMapping("")
public class testController {

    @Autowired
    private testService test_service;

    @RequestMapping("/ssm")
    public JSONObject test(){
        JSONObject jsonObject = new JSONObject();
        testPojo test_pojo = new testPojo();
        test_pojo.setId("1212");
        test_pojo.setTest("woc！成功了");
        test_service.insertTest(test_pojo);

        jsonObject.put("title","测试成功"+test_pojo.getId());
        return jsonObject;
    }
}
