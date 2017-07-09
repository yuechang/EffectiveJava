## command pattern
## 命令模式

### 定义
将"请求"封装成对象，以便于使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。


### UML图

![状态模式](https://github.com/yuechang/picture/blob/master/desginpattern/command-pattern.png)

- RemoteLoader：RemoteLoader创建许多命令对象，然后将其加载到遥控器的插槽中。每个命令对象都封装了某个家电自动化装置的一项请求。
- RemoteControl：RemoteControl管理一组命令对象，每个按钮都有一个命令对象。每当按下按钮，就调用对应的xxButtonWasPushed()方法，间接造成该命令的execuse()方法被调用。
- Command：所有的遥控器命令都实现这个Command接口，此接口中包含了一个方法，也就是execute(),命令封装了某个特定厂商类的一组动作，遥控器可以通过调用execute()方法，执行这些动作。
- Light：这些厂商类被用来控制特定的家电自动化装置。在这里，我们用Light当作例子。
- xxComnad：利用Command接口，每个动作都被实现成一个简单的命令对象。命令对象持有对一个厂商类的实例的引用，并实现了一个execute()方法。这个方法会调用厂商类实例的一个或者多个方法，完成特定的行为。