package com.mickitotutorial.demo;

public class SomeBusiness {
    private DataService dataService;

    public SomeBusiness(DataService dataService) {
        this.dataService = dataService;
    }

    public int findBiggest(){
        int[] data = dataService.retrieveAllData();
        int biggest = Integer.MIN_VALUE;

        for(int i : data){
            if(i > biggest){
                biggest = i;
            }
        }

        return biggest;
    }
}
