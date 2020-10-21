package com.imanage.test.stack;

import com.imanage.test.stack.Stack;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class StackTest {

    private static Integer ONE = 1;

    private static Integer ZERO = 0;

    private static Integer CAPACITY = 3;

    private Stack<Integer> stack ;

    @BeforeEach
    public void setUp(){
        stack = new Stack<>(CAPACITY);
    }

    @Test
    public void push(){
        Assert.assertEquals(ONE,stack.push(1));
        Assert.assertEquals(ONE, Optional.of(stack.size()).get());
    }

    @Test
    public void push_throwsSizeExceedException(){
        Assert.assertEquals(ONE,stack.push(1));
       stack.push(2);
        Assert.assertEquals(CAPACITY,stack.push(3));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,()->stack.push(4));
    }

    @Test
    public void peek(){
        Assert.assertEquals(ONE,stack.push(1));
        Assert.assertEquals(ONE, Optional.of(stack.size()).get());
        Assert.assertEquals(ONE,stack.peek());
    }

    @Test
    public void pop(){
        Assert.assertEquals(ONE,stack.push(1));
        Assert.assertEquals(ONE, Optional.of(stack.size()).get());
        Assert.assertEquals(ONE,stack.pop());
        Assert.assertEquals(ZERO, Optional.of(stack.size()).get());
    }
}
