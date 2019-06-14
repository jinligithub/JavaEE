目标
1.Spring的整体框架
2.Spring的核心：IOC|DI   AOP

Spring的框架结构
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190613230211862.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwOTU1ODI0,size_16,color_FFFFFF,t_70)
视图层（View）技术：
JSP控制层(Control Layer)技术：Servlet
业务层(Business Layer)技术：JavaBean（POJO）
持久层(Persistent Layer)技术：
DB


##### 整个过程：
首先发送一个HTTPRequest请求到控制器里面去，控制器拿到请求之后做了三件事：
第一件获取请求参数，判断是用post方法请求的还是get方法请求的，
第二件事，拿到请求之后调用业务逻辑，
第三件事，访问数据库禁止增删改查操作，然后把操作结果返回到视图层。

下层依赖于上层，下层不依赖于上层。
##### Spring的作用：
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019061323025682.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwOTU1ODI0,size_16,color_FFFFFF,t_70)
管理类和类之间的关系-->解耦此时有两个类，类B强依赖于类A 。
如果此时类B发生改变，在类B里面不在需要类A，就会导致类B需要把有关类A的方法删除掉，如果此时只有几个类A的方法，就可以手动删除，但是如果类B里面有一百万个类A 的方法，这个工作量就会变得非常的大。所以为了接解决这一类的问题做了一下的改变

##### 高类聚，低耦合
	* 高类聚：一个方法只做一件事情
	* 低耦合：类和类之间不要形成强依赖关系，避免在后期想改变强依赖关系都改不掉。

![在这里插入图片描述](https://img-blog.csdnimg.cn/2019061323033035.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwOTU1ODI0,size_16,color_FFFFFF,t_70)
用一个接口，让类A和类B都实现该接口，而实现一个接口就先实现该接口里面的所有方法，此时类A和类B之间就没有关系了。IOC  Inversion Of  Control ：控制权的反转之前控制权在类A的手里，现在类B不在依赖于类A了使用Spring的步骤：
	* 添加jar文件到项目中来：core，context，Beans
	* 配置配置文件applicationContext.xml



##### DI的三种注入方法

1.setter方法Spring的DI通过的方法会在定义的类里面来创建对象，并且会对对象属性进行赋值，DI的具体体现在的setter方法来对变量进行赋值，
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190613230407537.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwOTU1ODI0,size_16,color_FFFFFF,t_70)

2.构造方法在构造方法里面，属性的顺序必须是和类里面的属性顺序是一致的，当属性少的时候可以急着顺序写，单数当属性多的时候是记不住的，此时可以添加一个index来标记属性的顺序，但是此时有需要我们来记住索引，所以还有一种方法，就是用type属性来标记参数的属性也是可以的

3.接口setter和getter方法注入与构造方法注入的比较：当IOC构件
