package nika.tutorial.demo.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {
    @Override
    public void sort() {
        System.out.println("Using bubble sort");
    }
}
