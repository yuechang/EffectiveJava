### adapter pattern

存在以下两种类型的对象
- 火鸡：只能飞行一小段距离，只会咕咕叫
- 红头鸭：能够飞行很长距离，会嘎嘎叫

首先：火鸡对象,飞行行为与咕咕叫
``` java

public interface Turkey {
    void fly();
    void gobble();
}
```
鸭对象，飞行行为与嘎嘎叫
``` java
public interface Duck {
    void fly();
    void quack();
}
```

现在想把火鸡对象伪装成鸭对象，这个时候也就需要一个转换器，将火鸡对象转换为鸭对象,也就有了如下的适配器：

适配器类：其中火鸡对象飞行的距离比较短，于是这里将火鸡飞行了五次，达到一个更合理的效果；
``` java
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i = 0 ; i < 5 ; i++){
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
```

测试代码：
``` java
public class AdapterTest {

    public static void main(String[] args) {

        // 初始化火鸡对象
        Turkey wildTurkey = new WildTurkey();
        // 将火鸡对象转换成鸭子对象
        TurkeyAdapter duck = new TurkeyAdapter(wildTurkey);
        // 转换后对象具有鸭子对象的行为：飞行以及叫
        duck.fly();
        duck.quack();

    }
}
```