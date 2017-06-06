说明：

1.对各种鸭子的解释：
    RedHeadDuck：红头鸭，可以用翅膀飞，呱呱叫。
    RubberDuck：橡皮鸭，不会飞，吱吱叫。
    ModelDuck：模型鸭，不会飞，呱呱叫。
    DecoyDuck：诱饵鸭，不会飞，不会叫。
    MallardDuck：野鸭，会用翅膀飞，呱呱叫。


2.Duck是各种鸭子的抽象超类，其内部持有FlyBehavior和QuackBehavior接口类型的引用，因为飞行行为和呱呱叫行为随鸭子的不用而不同，是变化的部分，所以将它们取出并“封装”起来，好让其他部分不会受到影响。
       使用FlyBehavior和QuackBehavior接口类型便于以后增加新的飞行行为或呱呱叫行为，不会影响到既有的行为类，也不会影响使用行为的鸭子类。同样，这也可以让飞行行为和呱呱叫行为被其他对象复用，因为这些行为已经与鸭子类无关了，你也可以将其用在鸡和大鹅身上。


3.对飞行行为的解释：
    FlyWithWings：用翅膀飞。
    FlyNoWay：不会飞。
    FlyRocketPowered：使用火箭动力飞行（鸭子的飞行行为可以动态改变）。


4.对呱呱叫（此呱呱叫泛指鸭子的叫声而不是红头鸭的“呱呱叫”）行为的解释：
    Quack：呱呱叫。
    FakeQuack：假叫。
    Squeak：吱吱叫。
    MuteQuack：不会叫。


5.所有的鸭子都会浮水，所以将swim()方法定义且实现为抽象父类Duck中的具体类。
所有的鸭子的外观随鸭子种类不同而不同，所以将display()方法定义为Duck中的抽象方法，让各个鸭子子类实现。


6.Duck中的performFly()和performQuack()方法：
  鸭子对象不亲自处理飞行行为和呱呱叫行为，而是委托给飞行行为类FlyBehavior和呱呱叫行为类QuackBehavior。例如performFly()方法实现为

    public void performFly() {  
        flyBehavior.fly();  
    }  


7.Duck的setFlyBehavior()和setQuackBehavior()用于动态设置鸭子的行为。

8.类不仅可以表示具体的“东西”，还.可以用一个类来表示行为，FlyBehavior表示飞行行为，QuackBehavior表示呱呱叫行为。


