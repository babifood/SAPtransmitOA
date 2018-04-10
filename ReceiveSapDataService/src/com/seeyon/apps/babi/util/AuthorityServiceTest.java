package com.seeyon.apps.babi.util;

import com.seeyon.client.CTPRestClient;
import com.seeyon.client.CTPServiceClientManager;

/**
 * 验证服务
 */
public class AuthorityServiceTest {

    /** 验证服务对象 */
    private static AuthorityServiceTest authorityService = null;

    // 定义REST动态客户机
    private CTPRestClient client = null;

    /**
     * 单例对象,私有化构造函数
     */
    private AuthorityServiceTest() {
    }

    /**
     * 获取实体对象
     * @return
     */
    public static AuthorityServiceTest getInstence() {
        if(authorityService == null) {
            authorityService = new AuthorityServiceTest();
        }
        return authorityService;
    }

    /**
     * 验证权限
     * @return 验证结果
     */
    public boolean authenticate() {
        // 取得指定服务主机的客户端管理器。
        // 参数为服务主机地址，包含{协议}{Ip}:{端口}，如http://127.0.0.1:8088
        //CTPServiceClientManager clientManager = CTPServiceClientManager.getInstance("http://10.1.1.5");
        CTPServiceClientManager clientManager = CTPServiceClientManager.getInstance("http://10.1.1.3");
        // 取得REST动态客户机。
        client = clientManager.getRestClient();
        // 登录校验,成功返回true,失败返回false,此过程并会把验证通过获取的token保存在缓存中
        // 再请求访问其他资源时会自动把token放入请求header中。
        return client.authenticate("rest", "123456");
    }

    /**
     * 获取client
     * @return client
     */
    public CTPRestClient getClient() {
        return client;
    }

    /**
     * 设置client
     * @param client client
     */
    public void setClient(CTPRestClient client) {
        this.client = client;
    }
    
    public static void main(String[] args ){
       System.out.println(AuthorityServiceTest.getInstence().authenticate());
    }
}
