#启动应用

##默认配置
java -java   RestfulSimple.jar

##设置变量
java -jar RestfulSimple.jar --spring.application.json='{"foo":"bar"}'

##设置配置文件
java -jar RestfulSimple.jar --spring.config.name=application_dev.properties

OR

java -jar RestfulSimple.jar --spring.config.location=classpath:/default.properties,classpath:/override.properties