package com.atmoon.sharding;

import com.atmoon.sharding.entity.Girl;
import com.atmoon.sharding.service.IGirlService;
import org.apache.shardingsphere.core.strategy.keygen.UUIDShardingKeyGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShardingApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private IGirlService girlService;

    @Test
    public void testSelect() {
        System.out.println(("----- selectById method test ------"));
        System.out.println(girlService.getById(Long.valueOf(1001)));
    }

    @Test
    public void testList() {
        System.out.println(("----- selectAll method test ------"));
        girlService.list().forEach(System.out::println);
    }

    @Test
    public void testShardingList() {
        System.out.println(("----- selectShardingList method test ------"));
        girlService.shardingList("gz").forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        System.out.println(("----- insert method test ------"));
        Girl girl = new Girl();
        girl.setCity("chongqing");
        girl.setAge(19);
        girl.setMoney(88d);
        girlService.insert(girl);
        System.out.println(girl);
    }

}
