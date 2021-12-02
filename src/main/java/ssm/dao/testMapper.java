package ssm.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import ssm.pojo.testPojo;

@Repository
public interface testMapper {
    Long insert(testPojo test_pojo);
}
