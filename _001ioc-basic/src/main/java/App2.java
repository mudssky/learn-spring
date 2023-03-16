import com.mudssky.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //    获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //   获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();


    }
}
