����ʹ���˷�ע��ķ�ʽʵ�ֵ�springmvc�ĳ�������

	��web.xml�У�������
	1.ǰ�˿�����������Ҫ�Լ�д��ֻҪ��λ�ø���webӦ�þͺã���ô�ң�jar���е�DispatcherServlet��
		��ǰ�˿������У������˳�ʼ��������������ǰ�˿�����springmvc���������ļ�������
		������ǰ�˿������ķ�������*.action����˼��ֻҪ��.action��url��Ҫ���������ǰ�˿�����
		��Ȼ.actionҲ����д��.do��������
	
	��springmvc�������ļ��У�
	1.������HandlerMapping��һ����mapping��֪����ӳ������handler�Ǵ������˼�������Ծ��Ǵ�����ӳ������
		����ܸ�ʲô�أ�
		���ǰ�dispactherServletת��������urlӳ�䵽ÿ����ͬ��handler���棬����������󣬸�ȥ���ĸ�handler
	���ڴ�����ӳ������������BeanNameUrlHandlerMapping��SimpleUrlHandlerMapping

	2.����˵��Ҫ����һ��handler��controller��	
		����handler����Ҫ����handler������԰ɣ���ø���һ��id��������?�����BeanNameUrlHandlerMapping���ӳ�����Ļ�
		��ô�ͱ���ָ��name�ˣ����������name��Ҫ�����name������url���������ܳɹ�ӳ�䣬�������SimpleUrlHandlerMapping���ӳ�����أ�
		�����־�֪���˼�url������ӳ������ֻҪ����ӳ����handler��λ�ã���ӳ������ָ���ĸ�url���Է������handler����������handler��bean֮��
		��ô����SimpleUrlHandlerMapping��handler��λ���أ����ʱ��ֻҪ��handler��id�������Ϳ����ˣ�Ȼ����Ҫ��������ӳ������mapping��
		��mapping������props����props������prop����prop������key��value�������ж������key��url��ַ��value��handler��id�������Ϳ����γ�ӳ��		�ˡ�
		����ӳ�����������ö���������ܷ��ʵ��ĸ�url��������ʲôӳ�䡣

	3.˵������handler�����handler��Ҫ��ʵ��ҵ���߼��ı�д���ܵ�����ȥִ�����handler�ɣ�����˵�����ʱ������������������
	˵�����ʵ��һ���ӿڣ�������ǣ��Ҳ�����ʶ�㣬֪����Ŷ��ԭ����������ȥִ�еģ�����˵���ڱ�дhandler֮ǰ����Ҫ���ô�������������
	
	4.���ô�������������
	��������������һ����SimpleControllerHandlerAdapter����һ����HttpRequestHandlerAdapter
	��������������Ϊ��ʵ�ֲ�ͬ��ҵ������������ģ�˵���������������Դ����������ѹ��ʲô�ģ����ǿ��Ը��ݲ�ͬ������������ͬ����Ӧ��ִ�в�ͬ��		handler���Դﵽ��ͬ��Ŀ�ġ�
	SimpleControllerHandlerAdapterҪ��ʵ��Controller�ӿڵ�handler���Խ��б�����ִ�С�
	ִ�еĽ���Ƿ���һ��ModelAndView���������������DispatcherServlet�����е��ȣ����佻����ͼ������InternalResourceViewResolver������ͼ��������		��֮������ٽ���DispatcherServletת������������������Ⱦ���ڷ���һ��view֮����ת�������������չʾ��	
	HttpRequestHandlerAdapterҪ��ʵ��HttpRequestHandler�ӿڵ�handler���Խ��б�����ִ�С�
	ֱ�ӷ���һ��response������request��ת����������servlet��
	�ڶ��ַ�ʽӦ�Բ�ͬ��������������Ըı�response����Ӧ�����ݸ�ʽ��������Ӧjson����

	5.��ͼ������Ҫ����InternalResourceViewResolver


����ϸ�ڲο���demo��



