# spring 解读

## ClassPathXmlApplicationContext简单测试

主要调试以下两方面
- 1 spring 加载xml格式的bean定义
- 2 spring getBean的过程

getBean过程中 finis  `AbstractAutowireCapableBeanFactory`类的`applyBeanPostProcessorsAfterInitialization`方法中完成AOP的增强,大致的调用堆栈如下

```java
// 此步方法中会调用`AbstractAutowireCapableBeanFactory`类的`applyBeanPostProcessorsAfterInitialization`方法完成AOP的增强
resolveBeforeInstantiation:1126, AbstractAutowireCapableBeanFactory (org.springframework.beans.factory.support)
createBean:534, AbstractAutowireCapableBeanFactory (org.springframework.beans.factory.support)
lambda$doGetBean$0:339, AbstractBeanFactory (org.springframework.beans.factory.support)
getObject:-1, 1224347463 (org.springframework.beans.factory.support.AbstractBeanFactory$$Lambda$11)
getSingleton:236, DefaultSingletonBeanRegistry (org.springframework.beans.factory.support)
doGetBean:337, AbstractBeanFactory (org.springframework.beans.factory.support)
getBean:199, AbstractBeanFactory (org.springframework.beans.factory.support)
// 初始化剩下的单例（非懒加载的单例类）（并invoke BeanPostProcessors）
preInstantiateSingletons:866, DefaultListableBeanFactory (org.springframework.beans.factory.support)
finishBeanFactoryInitialization:917, AbstractApplicationContext (org.springframework.context.support)
refresh:584, AbstractApplicationContext (org.springframework.context.support)
<init>:145, ClassPathXmlApplicationContext (org.springframework.context.support)
<init>:85, ClassPathXmlApplicationContext (org.springframework.context.support)
main:11, ClassPathXmlApplicationContextTest (com.creasypita.springtest)
```