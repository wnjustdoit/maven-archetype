## 自定义Maven脚手架，快速构建项目
#### 模块说明
* maven-archetype-simple
> 构建标准Java应用。

* maven-archetype-webapp
> 构建普通Java Web应用，使用Spring Boot做web框架。

* maven-archetype-webapp-with-multi-modules
> 构建模块化的Java Web应用，使用Spring Boot做web框架。

#### 使用方法
1. git clone 当前工程；
2. 执行 sh build.sh 或 build.cmd ；
3. 使用以下命令创建项目（注意 -DarchetypeArtifactId 的值加后缀 -archetype ，否者类型不匹配；可选值：maven-archetype-simple-archetype、maven-archetype-webapp-archetype、maven-archetype-webapp-with-multi-modules-archetype）： 
    > 1. cd YOUR_WORKSPACE
    > 2. mvn archetype:generate -DarchetypeGroupId=com.caiya -DarchetypeArtifactId=maven-archetype-simple-archetype -DarchetypeVersion=1.0.0-SNAPSHOT -DgroupId=YOUR_PROJECT_GROUP_ID -DartifactId=YOUR_PROJECT_ARTIFACT_ID -Dversion=1.0.0-SNAPSHOT -DarchetypeCatalog=local -X

#### 参考
> * https://maven.apache.org/archetype/maven-archetype-plugin/examples/create-multi-module-project.html

