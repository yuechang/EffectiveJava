/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.composite;

import java.util.Iterator;

/**
 * @author Yue Chang
 * @ClassName: NullIterator
 * @Description: TODO
 * @date 2017/6/14 18:26
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
