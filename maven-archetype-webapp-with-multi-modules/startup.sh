#!/usr/bin/env bash
echo "The spring-boot-application is starting..."
# -P指定环境
mvn clean install -Plocal
cd module-web/ && mvn spring-boot:run
# 或者 cd module-web/ && mvn exec:java

# 另外,打包类型jar或war,module-web模块的packaging标签就行了

# 如果是把web应用打包成可运行的jar，需要用spring-boot-maven-plugin插件（替代maven-jar-plugin）打包输出指定目录
