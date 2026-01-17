package org.koreait.configs;

import org.koreait.proxy.Calculator;
import org.koreait.proxy.RecCalculator;
import org.koreait.proxy3.CacheCalculator;
import org.koreait.proxy3.PerformCalculator3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass = true)// 서브 클래스
@Configuration
public class AppCtx2 {
    @Bean
    public CacheCalculator cacheCalculator (){
        return new CacheCalculator();
    }

    @Bean

    public Calculator recCalculator() {
        return new RecCalculator();
    }

    @Bean
    public PerformCalculator3 performCalculator3(){
        return new PerformCalculator3();
    }
}
