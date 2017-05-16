---
layout: pattern
title: Prototype
folder: prototype
permalink: /patterns/prototype/
pumlid: HSV13OCm30NGLM00udktCS62eCInxE-YRj_UUdjlRLfx7fBUbmkmU14vF-Lik7BF4AzJ8OfIvw3Mys6mqyrltWw9Tkfc38XhqE3uWSmd9Zuc9AZ_bVHHB4V_0W00
categories: Creational
tags: 
 - Java
 - Gang Of Four
 - Difficulty-Beginner
---

## Intent
Specify the kinds of objects to create using a prototypical
instance, and create new objects by copying this prototype.

使用一个典型的实例创建指定类型的对象,并通过复制此原型创建新的对象(通过拷贝clone,而不是实例化new,去创建对象)


![alt text](./etc/prototype_1.png "Prototype")

## Applicability
Use the Prototype pattern when a system should be independent of how its products are created, composed and represented; and

使用原型模式：系统应该独立于其产品是如何创建、组合和表示的时候，以及

* when the classes to instantiate are specified at run-time, for example, by dynamic loading; or

    运行时实例化一个类,例如,通过动态加载;或

* to avoid building a class hierarchy of factories that parallels the class hierarchy of products; or

    为了避免建立一个类层次结构的工厂类层次结构相似的产品;或

* when instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state

    当一个类的实例的状态有少量不同的组合。每次根据适当的状态，安装相应数量的原型和克隆更方便，而不是手工进行实例化。

## Real world examples

* [java.lang.Object#clone()](http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#clone%28%29)

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
