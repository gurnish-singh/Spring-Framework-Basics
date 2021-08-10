package org.gurnish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    @Qualifier("snapDragon")///first letter small
    MobileProcessor cpu;

    public void config() {
        System.out.println("octa core,4gb Ram,12 mp camera");
        cpu.process();
    }

}

