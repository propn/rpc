package services;

import com.propn.golf.rpc.RpcService;

@RpcService(HelloService.class) // 指定远程接口
public class HelloServiceImpl implements HelloService{

	public String hello(String name) {
		 return "Hello! " + name;
	}

}
