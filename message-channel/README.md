---
layout: pattern
title: Message Channel
folder: message-channel
permalink: /patterns/message-channel/
categories: Integration
tags:
 - Java
 - EIP
 - Apache Camel™
---

## Intent
When two applications communicate using a messaging system they do it by using logical addresses
of the system, so called Message Channels.

当两个应用程序使用一个消息传递系统交流，他们通过使用系统的逻辑地址，即所谓的消息渠道

![alt text](./etc/message-channel.png "Message Channel")

## Applicability
Use the Message Channel pattern when

* two or more applications need to communicate using a messaging system

## Real world examples

* [akka-camel](http://doc.akka.io/docs/akka/snapshot/scala/camel.html)
