package nika.tutorial.demo.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class SomeCDIDAO {

    public int[] getData(){
        return  new int[] {146, 245, 32};
    }
}
