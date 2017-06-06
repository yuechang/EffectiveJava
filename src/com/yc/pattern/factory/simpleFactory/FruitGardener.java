/*!
 * Copyright(c) 2016 Yuechang
 * MIT Licensed
 */
package com.yc.pattern.factory.simpleFactory;

/** 
 * @ClassName: FruitGardener 
 * @Description: 园丁类
 * @author Yue Chang
 * @date 2016年3月15日 下午10:45:01 
 *  
 */
public class FruitGardener {

	public static Fruit factory(String which) throws BadFruitException{
		
		if("Apple".equalsIgnoreCase(which)){
			return new Apple();
		}else if("Grape".equalsIgnoreCase(which)){
			return new Grape();
		}else if("Strawberry".equalsIgnoreCase(which)){
			return new Strawberry();
		}else{
			throw new BadFruitException("Bad fruit requist");
		}
	}
	
}
