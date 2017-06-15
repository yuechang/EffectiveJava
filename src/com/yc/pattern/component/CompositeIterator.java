/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.component;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Yue Chang
 * @ClassName: CompositeIterator
 * @Description: 组合迭代器
 * @date 2017/6/15 9:20
 */
public class CompositeIterator implements Iterator {

    private Stack stack = new Stack();

    public  CompositeIterator(Iterator iterator){
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {

        if (stack.empty()){
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {

        if (hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
