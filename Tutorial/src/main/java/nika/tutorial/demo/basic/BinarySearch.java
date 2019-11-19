package nika.tutorial.demo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BinarySearch {
    private SortAlgorithm sortAlgorithm;

    @Value("${binarySearch.task}")
    private String task;

    @Autowired
    public BinarySearch( SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void search(){
        sortAlgorithm.sort();
        System.out.println("Doing binary search");
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean created, all dependencies set");
    }

    @PreDestroy
    public void  destroy(){
        System.out.println("Destroying");
    }

    public String getTask() {
        return task;
    }
}

//   Options for @autowiring: by name, by type with @primary, by type with @qualifier
