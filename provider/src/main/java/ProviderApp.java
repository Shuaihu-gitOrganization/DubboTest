import com.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @Date 2023/9/7 17:05
 * @Author XiaoHu
 * @Description
 **/
public class ProviderApp {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
        applicationContext.start();
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        new CountDownLatch(1).await();
    }
}
