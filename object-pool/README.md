---
layout: pattern
title: Object Pool
folder: object-pool
permalink: /patterns/object-pool/
pumlid: JSV94SCm2030Lk829Fxf1cF6bWU1XYDkFtdcjxiD9Qc3o-LrPQvu0pW-_HnvrLx1JgR9cfrimf1wCD7XnW-sWsESsXPcicl0nFW1RB-PiYqp0KxwVo-VVTMKBm00
categories: Creational
tags:
 - Java
 - Difficulty-Beginner
 - Performance
---

## Intent
When objects are expensive to create and they are needed only for
short periods of time it is advantageous to utilize the Object Pool pattern.
The Object Pool provides a cache for instantiated objects tracking which ones
are in use and which are available.

当创建对象的开销非常大,只需要短时间的利用是有利的对象池模式。实例化对象的缓存对象池提供了一个跟踪当前正在使用哪些,哪些是可用的

![alt text](./etc/object-pool.png "Object Pool")

## Applicability
Use the Object Pool pattern when

* the objects are expensive to create (allocation cost， 资源分配)
* you need a large number of short-lived objects (memory fragmentation， 内存碎片)
