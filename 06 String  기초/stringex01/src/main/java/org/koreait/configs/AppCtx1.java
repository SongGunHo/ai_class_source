package org.koreait.configs;

import org.koreait.member.dao.sub.MemberDao;
import org.springframework.context.annotation.*;

import java.time.format.DateTimeFormatter;

//@Import(DBConfig.class)
@Configuration
//@ComponentScan("org.koreait.member")
//@ComponentScan(basePackages = "org.koreait", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class))
//@ComponentScan(basePackages = "org.koreait", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class))
//@ComponentScan(basePackages = "org.koreait",excludeFilters =  @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "org.koreait.member.dao,*Dao") )
//@ComponentScan(basePackages = "org.koreait",excludeFilters =  @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "org.koreait.member.dao..*Dao") )
@ComponentScan(basePackages = "org.koreait", excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.koreait.member\\..*Dao"))
public class AppCtx1 {
    @Bean
    public DateTimeFormatter date (){
        return DateTimeFormatter.ofPattern("yy, MM, dd HH:mm");
     }
//    @Bean
//    @Qualifier("dtf2")
//    public DateTimeFormatter date2 (){
//        return DateTimeFormatter.ofPattern            ("yy, MM, dd HH:mm");
//    }





}
