package ssm.service;

import ssm.pojo.testPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.testMapper;

import javax.transaction.Transactional;

@Service
@Transactional
public class testService {
    @Autowired
    private testMapper test_Mapper;

    public Long insertTest(testPojo test_pojo){
        return test_Mapper.insert(test_pojo);
    }

}
