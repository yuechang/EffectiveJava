/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factory.simpleFactory;

/** 
 * @ClassName: BadFruitException 
 * @Description: 无货水果请求
 * @author Yue Chang
 * @date 2016年3月15日 下午10:46:26 
 *  
 */
@SuppressWarnings("serial")
public class BadFruitException extends Exception {

	public BadFruitException(String msg){
		super(msg);
	}
}
