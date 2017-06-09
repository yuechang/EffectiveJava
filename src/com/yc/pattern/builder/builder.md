## builder pattern
## 建造者模式
> [建造者模式](http://note.youdao.com/)


### 定义
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

### UML图

![建造者模式](http://img.blog.csdn.net/20170609203051901?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVlY2hhbmc1/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

BuilderTest代码
``` java
public class BuilderTest {

    public static void test(){
        NutritionFacts nutritionFacts = new NutritionFactsBuilder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
        CocaCola cocaCola = new CocaCola(nutritionFacts);
        System.out.println("cocaCola:"+cocaCola);
    }

    public static void main(String[] args) {
        test();
    }
}
```

NutritionFacts是建造者产生的产品，CocaCola是根据这个产品进一步加工的产品，以后还可以有Sprite、Wong Lo Kat...

### 优点
- 将一个复杂对象的创建过程封装起来。
- 允许对象通过多个步骤来创建，并且可以改变过程(这和只有一个步骤的工厂模式不同)
- 向客户隐藏产品内部的表现
- 产品的实现可以被替换，因为客户只看到一个抽象的接口


### 用途与缺点
- 经常被用来创建组合结构
- 与工厂模式相比，采用建造者模式创建对象的客户，需要具备跟多的领域对象