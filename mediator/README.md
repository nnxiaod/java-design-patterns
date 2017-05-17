中介
---
layout: pattern
title: Mediator
folder: mediator
permalink: /patterns/mediator/
pumlid: FSV14SCm20J0Lk82BFxf1akCJKOW3JhizfDNVhkRUktP9AE_Bc2kDr7mKqx5bKSkYJeSuYXr66dFXy517xvvRxBqz7qo8E6BZDSFPDAKCO84zP-IOMMczIy0
categories: Behavioral
tags:
 - Java
 - Gang Of Four
 - Difficulty-Intermediate
---

## Intent
Define an object that encapsulates how a set of objects interact.
Mediator promotes loose coupling by keeping objects from referring to each
other explicitly, and it lets you vary their interaction independently.

定义一个对象,该对象封装了一组对象是如何交互的。中介可促进松散耦合通过保持指的对象从对方明确,独立和它让你改变他们的交互

![alt text](./etc/mediator_1.png "Mediator")

## Applicability
Use the Mediator pattern when

* a set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand

    一组对象,通过良好定义但复杂的方式沟通。产生的相互依赖关系是非结构化的,很难理解

* reusing an object is difficult because it refers to and communicates with many other objects

    重用一个对象是困难的,因为它指的是,与许多其他对象

* a behavior that's distributed between several classes should be customizable without a lot of subclassing

    行为的几个类之间的分布应该是定制的没有很多子类化


## Real world examples

* All scheduleXXX() methods of [java.util.Timer](http://docs.oracle.com/javase/8/docs/api/java/util/Timer.html)
* [java.util.concurrent.Executor#execute()](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html#execute-java.lang.Runnable-)
* submit() and invokeXXX() methods of [java.util.concurrent.ExecutorService](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)
* scheduleXXX() methods of [java.util.concurrent.ScheduledExecutorService](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html)
* [java.lang.reflect.Method#invoke()](http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html#invoke-java.lang.Object-java.lang.Object...-)

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
