## ����ע������
> nohup java -jar eureka-server-0.0.1.jar > eureka-server.log 2>&1 &


## ������������
> nohup java -jar service-a-0.0.1.jar --server.port=2221 > service-a.log 2>&1 &
> nohup java -jar service-a-0.0.1.jar --server.port=2222 > service-a-2.log 2>&1 &


## ����΢�������
> nohup java -jar zipkin-server-0.0.1.jar > zipkin-server.log 2>&1 &

## ������������
web-client ��IDE������������ʵ��