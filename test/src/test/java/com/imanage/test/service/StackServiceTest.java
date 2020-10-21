package com.imanage.test.service;

import com.imanage.test.stack.Stack;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class StackServiceTest {

    private static Integer ONE = 1;

    @Mock
    Stack<Integer> stack;

    @BeforeEach
    public void setup() {
        Mockito.lenient().when(stack.push(Mockito.anyInt())).thenReturn(1);
        Mockito.lenient().when(stack.peek()).thenReturn(1);
        Mockito.lenient().when(stack.pop()).thenReturn(1);
    }

    @Test
    public void push() {
        Assert.assertEquals(ONE, stack.push(1));
    }
    @Test
    public void pop(){
        Assert.assertEquals(ONE, stack.pop());
    }
    @Test
    public void peek(){
        Assert.assertEquals(ONE, stack.peek());
    }
}
