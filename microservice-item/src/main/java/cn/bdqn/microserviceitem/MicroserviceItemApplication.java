package cn.bdqn.microserviceitem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.bdqn.microserviceitem.dao")
@SpringBootApplication
public class MicroserviceItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceItemApplication.class, args);
    }

}
