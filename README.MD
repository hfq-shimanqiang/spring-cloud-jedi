## 启动注册中心
> nohup java -jar eureka-server-0.0.1.jar > eureka-server.log 2>&1 &


## 启动两个服务
> nohup java -jar service-a-0.0.1.jar --server.port=2221 > service-a.log 2>&1 &

> nohup java -jar service-a-0.0.1.jar --server.port=2222 > service-a-2.log 2>&1 &


## 启动微服务跟踪
> nohup java -jar zipkin-server-0.0.1.jar > zipkin-server.log 2>&1 &

## 启动服务消费
web-client 在IDE中启动，方便实验
