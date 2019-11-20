package nika.tutorial.demo.basic;

import nika.tutorial.demo.DemoApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DemoApplication.class)
class BinarySearchTest {

    @Autowired
    BinarySearch search;

    @Test
    void search() {
        int[] arr = new int[] {1,2,3};
        int actual = search.search(arr, 2);

        assertEquals(1, actual);
    }
}