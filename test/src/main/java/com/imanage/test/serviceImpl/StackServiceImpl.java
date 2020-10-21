package com.imanage.test.serviceImpl;

import com.imanage.test.stack.Stack;
import com.imanage.test.service.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StackServiceImpl implements StackService {

    private static Stack<Integer> STACK ;

    @Autowired
    public void StackServiceImpl(@Value("${stack.max.capacity}") Integer maxCapacity){
        this.STACK =  new Stack(maxCapacity);
    }

    @Override
    public int push(Integer item) {
        return STACK.push(item);
    }

    @Override
    public int pop() {
        return STACK.pop();
    }

    @Override
    public int peek() {
        return STACK.peek();
    }
}
