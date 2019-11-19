package nika.tutorial.demo.basic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Scope("prototype")
public class QuickSort implements SortAlgorithm {
    @Override
    public void sort() {
        System.out.println("Using quick sort");
    }
}
