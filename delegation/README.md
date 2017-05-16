---
layout: pattern
title: Delegation
folder: delegation
permalink: /patterns/delegation/
pumlid: JSV14GCX20NGLf82LkxfXbN69OFeu2VRVdBCxRsdUhLiac6F2rZxHHHybwwuyimjKQT37ANEGMfvCpZepHy-ccpjVYm697pJuFq3DJ7f39rEWlhNaZ7Aoc5V
categories: Behavioral
tags:
 - Java
 - Difficulty-Beginner
---

## Also known as
Proxy Pattern

## Intent
It is a technique where an object expresses certain behavior to the outside but in 
reality delegates responsibility for implementing that behaviour to an associated object. 

这是一个技术,一个对象对外表达特定行为,但实际上代表一个关联的对象,负责实施这种行为,

和strategy很像。。。

![alt text](./etc/delegation.png "Delegate")

## Applicability
Use the Delegate pattern in order to achieve the following

使用委托模式以达到以下

* Reduce the coupling of methods to their class

    降低耦合方法的类

* Components that behave identically, but realize that this situation can change in the future.

    组件的行为完全相同,但是意识到,这种情况可以改变未来。

## Credits

* [Delegate Pattern: Wikipedia ](https://en.wikipedia.org/wiki/Delegation_pattern)
* [Proxy Pattern: Wikipedia ](https://en.wikipedia.org/wiki/Proxy_pattern)
