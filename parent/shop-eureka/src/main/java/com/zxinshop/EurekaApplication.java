package com.zxinshop;

@SpringBootApplication
@EnableEurekaServer //开启Eureka服务
public class EurekaApplication {

    /***
     * 加载启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
