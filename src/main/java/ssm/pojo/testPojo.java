package ssm.pojo;

import lombok.Data;
import java.io.Serializable;

@Data
public class testPojo implements Serializable{

    /**
     * @备注: 主键
     * @字段:LOG_UUID bigint
     */
    private String id;

    /**
     * @备注:
     * @字段:TESTMAIN_UUID CHAR(32)
     */
    private String test;

}