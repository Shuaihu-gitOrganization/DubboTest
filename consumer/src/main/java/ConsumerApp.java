import common.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Date 2023/9/7 17:21
 * @Author XiaoHu
 * @Description
 **/
public class ConsumerApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");
        boolean login = userServiceImpl.login("zhangsan", "lisi");
        System.out.println(login);

        System.in.read();

    }
}
