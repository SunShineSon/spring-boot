一、需要注意的地方如下： 
1、在src/main/java包下的第一层结构中，是必须放一个含有main方法的主启动的类，而且只能有一个main方法，
如果再出现其他的main方法，在使用maven编译打包时，会报编译错误，当然在src/test/java包下，可以出现多个，但建议最好使用Junit进行单元测试.
	
结构建议这样建立：
com
 +- example
     +- myproject
         +- Application.java
         |
         +- domain
         |   +- Customer.java
         |   +- CustomerRepository.java
         |
         +- service
         |   +- CustomerService.java
         |
         +- web
             +- CustomerController.java
保证了main方法在最外围，便于阅读和管理，把握项目的大致结构。