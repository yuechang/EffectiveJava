## iterator pattern
## 迭代器模式
> [迭代器模式](http://note.youdao.com/)

### 定义
提供一个方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。

说明：
迭代器模式让我们能游走于聚合内的每一个元素，而又不暴露内部的表示。
把游走的任务放在迭代器上，而不是聚合上。这样简化了聚合的接口和实现，也让责任各得其所。

### UML图

![迭代器模式](https://github.com/yuechang/picture/blob/master/desginpattern/iterator-pattern.png)