/**
 * 
 */


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author XuLei
 *
 */
public class RpcBootstrap {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("spring.xml");
	}

}
