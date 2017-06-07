/*
 * ! Copyright(c) 2016 Yue Chang MIT Licensed
 */
/**
 * @ClassName: package-info
 * @Description FactoryMethod工厂方法设计模式<br>
 *              工厂方法设计模式在Java中的应用举例：<br>
 *              1、多个对象聚在一起形成的总体称之为聚集(since java 1.2),聚集对象是能够包容一组对象的容器对象。
 *              所有的聚集都实现了code java.util.Conllection接口，这个接口规定了所有的Java聚集必须提供
 *              一个iterator()方法，返还一个Iterator类型的对象。 一个具体的Java聚集对象会通过这个
 *              iterator()方法接口返还一个具体的Iterator类，这个iterator()方法就是一个工厂方法。<br>
 *              2、List接口给出了两个工厂方法，一个是iterator()方法，返还一个Iterator类型的对象；另一个是
 *              listIterator()方法，返还一个ListIterator类型的对象。<br>
 *              3、URL与URLConnection的应用。URL对象提供一个叫做openConnection()的工厂方法，这个方法
 *              返还一个URLConnection对象。而URLConnection对象则代表一个与远程对象的连接。
 *              URLConnection则表示一个与远程对象的连接。URLConnection是所有的代表应用系统与一个URL的
 *              连接对象的超类，使用URLConnection对象可以针对一个URL进行读写操作。
 * @author Yue Chang
 * @date 2016年3月17日 上午10:53:10 @
 * 
 */
package com.yc.pattern.factory.factoryMethod;