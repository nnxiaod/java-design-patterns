---
layout: pattern
title: Command
folder: command
permalink: /patterns/command/
pumlid: DSgn4OCm30NGLM00h3xR25i7vYpXaxx2-g59zugtTgiZcwIFvGHcV8YSdt9qdBbdYDVR88PIRwK-yc6mqyLVtff4FsoR38XRa7Aye3SgMoD1_RkaQvcfumS0
categories: Behavioral
tags:
 - Java
 - Gang Of Four
 - Difficulty-Intermediate
 - Functional
---

## Also known as
Action, Transaction

## Intent
Encapsulate a request as an object, thereby letting you
parameterize clients with different requests, queue or log requests, and
support undoable operations.

请求封装为一个对象,从而让你参数化客户端不同的请求,队列或日志请求,并支持可撤销的操作

![alt text](./etc/command.png "Command")

## Applicability
Use the Command pattern when you want to

* parameterize objects by an action to perform. You can express such parameterization in a procedural language with a callback function, that is, a function that's registered somewhere to be called at a later point. Commands are an object-oriented replacement for callbacks.

    参数化对象执行的行动。你可以表达这种参数化程序语言和一个回调函数,也就是说,某个函数的注册被称为在晚些时候。命令是一个面向对象替代回调函数。

* specify, queue, and execute requests at different times. A Command object can have a lifetime independent of the original request. If the receiver of a request can be represented in an address space-independent way, then you can transfer a command object for the request to a different process and fulfill the request there

    在不同的时间指定、排列和执行请求。
    一个命令对象可以有一辈子独立于原始请求的。
    如果请求的接收者可以表示在一个地址空间——独立的方式,
    那么你可以请求的命令对象转移到一个不同的过程和完成请求

* support undo. The Command's execute operation can store state for reversing its effects in the command itself. The Command interface must have an added Unexecute operation that reverses the effects of a previous call to execute. Executed commands are stored in a history list. Unlimited-level undo and redo is achieved by traversing this list backwards and forwards calling unexecute and execute, respectively



* support logging changes so that they can be reapplied in case of a system crash. By augmenting the Command interface with load and store operations, you can keep a persistent log of changes. Recovering from a crash involves reloading logged commands from disk and re-executing them with the execute operation



* structure a system around high-level operations build on primitive operations. Such a structure is common in information systems that support transactions. A transaction encapsulates a set of changes to data. The Command pattern offers a way to model transactions. Commands have a common interface, letting you invoke all transactions the same way. The pattern also makes it easy to extend the system with new transactions




## Typical Use Case

* to keep a history of requests
* implement callback functionality
* implement the undo functionality

## Real world examples

* [java.lang.Runnable](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
* [Netflix Hystrix](https://github.com/Netflix/Hystrix/wiki)
* [javax.swing.Action](http://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html)

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
