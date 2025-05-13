package org.koreait.configs;

import org.koreait.configs.person.Greeter;

public class DBConfig {


    public Greeter dataSource(){
        return new Greeter();
    }
}
