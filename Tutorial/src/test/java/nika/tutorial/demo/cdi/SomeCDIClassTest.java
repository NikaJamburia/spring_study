package nika.tutorial.demo.cdi;

import nika.tutorial.demo.DemoApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes=DemoApplication.class)
class SomeCDIClassTest {

    @InjectMocks
    SomeCDIClass cdi;

    @Mock
    SomeCDIDAO dao;

    @Test
    void findGreatest() {
        when(dao.getData()).thenReturn(new int[] {4, 6, 3, 8});
        int result = cdi.findGreatest();
        assertEquals(8, result);
    }
}