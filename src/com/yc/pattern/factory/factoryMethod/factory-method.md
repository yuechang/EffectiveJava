## factory method pattern
## 工厂方法模式

### 定义
定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。


### UML图

![工厂方法模式](https://github.com/yuechang/picture/blob/master/desginpattern/factory-method-pattern.png)


### Java中的应用举例：
1. 多个对象聚在一起形成的总体称之为聚集(since java 1.2),聚集对象是能够包容一组对象的容器对象。所有的聚集都实现了code java.util.Conllection接口，这个接口规定了所有的Java聚集必须提供一个iterator()方法，返还一个Iterator类型的对象。 一个具体的Java聚集对象会通过这个iterator()方法接口返还一个具体的Iterator类，这个iterator()方法就是一个工厂方法。
2. List接口给出了两个工厂方法，一个是iterator()方法，返还一个Iterator类型的对象；另一个是listIterator()方法，返还一个ListIterator类型的对象。
3. URL与URLConnection的应用。URL对象提供一个叫做openConnection()的工厂方法，这个方法返还一个URLConnection对象。而URLConnection对象则代表一个与远程对象的连接。URLConnection则表示一个与远程对象的连接。URLConnection是所有的代表应用系统与一个URL的连接对象的超类,使用URLConnection对象可以针对一个URL进行读写操作。