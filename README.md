# rpc
通过 Spring + Netty + Protostuff + ZooKeeper 实现了一个轻量级 RPC 框架，使用 Spring 提供依赖注入与参数配置，
使用 Netty 实现 NIO 方式的数据传输，
使用 Protostuff 实现对象序列化，
使用 ZooKeeper 实现服务注册与发现。

使用该框架，可将服务部署到分布式环境中的任意节点上，客户端通过远程接口来调用服务端的具体实现，让服务端与客户端的开发完全分离，为实现大规模分布式应用提供了基础支持。

Spring：它是最强大的依赖注入框架，也是业界的权威标准。
Netty：它使 NIO 编程更加容易，屏蔽了 Java 底层的 NIO 细节。
Protostuff：它基于 Protobuf 序列化框架，面向 POJO，无需编写 .proto 文件。
ZooKeeper：提供服务注册与发现功能，开发分布式系统的必备选择，同时它也具备天生的集群能力。
