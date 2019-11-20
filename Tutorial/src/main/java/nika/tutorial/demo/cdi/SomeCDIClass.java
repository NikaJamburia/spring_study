package nika.tutorial.demo.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIClass {
    @Inject
    private SomeCDIDAO dao;

    public SomeCDIDAO getDao() {
        return dao;
    }

    public void setDao(SomeCDIDAO dao) {
        this.dao = dao;
    }

    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int[] data = dao.getData();

        for(int i : data){
            if(greatest < i){
                greatest = i;
            }
        }
        return greatest;

    }
}
