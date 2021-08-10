package org.gurnish;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand;

//    public Tyre(String brand) {///constructor injection
//        super();
//        this.brand = brand;
//    }

//    public String getBrand(){
//        return brand;
//    }
//    public void setBrand(String brand){///setter injection
//        this.brand=brand;
//    }

    @Override////yeh chlega hi chlega
    public String toString() {
        return "its working";
    }
}
