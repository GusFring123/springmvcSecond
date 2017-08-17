这是使用了非注解的方式实现的springmvc的初步配置

	在web.xml中，配置了
	1.前端控制器（不需要自己写，只要把位置告诉web应用就好，怎么找？jar包中的DispatcherServlet）
		在前端控制器中，配置了初始化参数，告诉了前端控制器springmvc的主配置文件在哪里
		配置了前端控制器的访问条件*.action，意思是只要带.action的url都要经过我这个前端控制器
		当然.action也可以写成.do或者其他
	
	在springmvc主配置文件中，
	1.配置了HandlerMapping，一看到mapping就知道是映射器（handler是处理的意思），所以就是处理器映射器啦
		这个能干什么呢？
		它是把dispactherServlet转发过来的url映射到每个不同的handler上面，告诉这个请求，该去找哪个handler
	关于处理器映射器有两个：BeanNameUrlHandlerMapping和SimpleUrlHandlerMapping

	2.所以说需要配置一下handler（controller）	
		关于handler，需要告诉handler在哪里对吧，最好给它一个id，名字呢?如果是BeanNameUrlHandlerMapping这个映射器的话
		那么就必须指定name了，它对于这个name有要求，这个name必须是url，这样才能成功映射，那如果是SimpleUrlHandlerMapping这个映射器呢？
		看名字就知道了简单url处理器映射器：只要告诉映射器handler的位置，在映射器中指定哪个url可以访问这个handler，
		那配置了handler的bean之后怎么告诉SimpleUrlHandlerMapping它handler的位置呢，这个时候只要将handler的id告诉它就可以了，
		然后需要配置它的映射属性mapping了
		在mapping中配置props，在props中配置prop，在prop中配置key与value（可以有多个），key是url地址，value是handler的id，
		这样就可以形成映射了。
		关于映射器可以配置多个，请求能访问到哪个url就能做出什么映射。

	3.说到配置handler，这个handler主要是实现业务逻辑的编写，总得有人去执行这个handler吧，所以说，这个时候适配器就跳出来了
	说，你得实现一个接口（做个标记，我才能认识你，知道：哦，原来你是让我去执行的，所以说，在编写handler之前还需要配置处理器适配器）
	
	4.配置处理器适配器：
	适配器有两个：一个是SimpleControllerHandlerAdapter，另一个是HttpRequestHandlerAdapter
	这两个适配器是为了实现不同的业务需求而设立的，说到适配器，就像电源适配器，变压器什么的，就是可以根据不同的请求
	做出不同的响应（执行不同的handler）以达到不同的目的。
	SimpleControllerHandlerAdapter要求实现Controller接口的handler可以进行被它所执行。
	执行的结果是返回一个ModelAndView，交给中央控制器DispatcherServlet来进行调度，将其交给试图解析器InternalResourceViewResolver
	进行视图解析，完成之后回来再交给DispatcherServlet转发交给？？？进行渲染后在返回一个view之后再转发给浏览器进行展示。	
	HttpRequestHandlerAdapter要求实现HttpRequestHandler接口的handler可以进行被它所执行。
	直接返回一个response，或者request的转发（类似于servlet）
	第二种方式应对不同的特殊需求，如可以改变response的响应的数据格式，比如响应json数据

	5.视图解析需要配置InternalResourceViewResolver


更多细节参考本demo。



