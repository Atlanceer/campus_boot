package atlan.ceer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *使用注解版mybatis @MapperScan指定需要扫描的mapper接口所在的包
 */
@MapperScan("atlan.ceer.mapper")
@SpringBootApplication
public class CampusBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusBootApplication.class, args);
    }

}
