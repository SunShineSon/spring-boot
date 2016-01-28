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

Spring Boot中几个常用的注解：
（1）@RestController和@Controller指定一个类，作为控制器的注解 
（2）@RequestMapping方法级别的映射注解，这一个用过Spring MVC的小伙伴相信都很熟悉 
（3）@EnableAutoConfiguration和@SpringBootApplication是类级别的注解，根据maven依赖的jar来自动猜测完成正确的spring的对应配置，
只要引入了spring-boot-starter-web的依赖，默认会自动配置Spring MVC和tomcat容器 
（4）@Configuration类级别的注解，一般这个注解，我们用来标识main方法所在的类,完成元数据bean的初始化。 
（5）@ComponentScan类级别的注解，自动扫描加载所有的Spring组件包括Bean注入，一般用在main方法所在的类上 
（6）@ImportResource类级别注解，当我们必须使用一个xml的配置时，使用@ImportResource和@Configuration来标识这个文件资源的类。 
（7）@Autowired注解，一般结合@ComponentScan注解，来自动注入一个Service或Dao级别的Bean 
（8）@Component类级别注解，用来标识一个组件，比如我自定了一个filter，则需要此注解标识之后，Spring Boot才会正确识别。
