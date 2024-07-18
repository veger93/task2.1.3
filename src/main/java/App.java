import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean.equals(bean2));

        Cat beanCat = applicationContext.getBean(Cat.class);
        System.out.println(beanCat.getName());
        Cat beanCat2 = applicationContext.getBean(Cat.class);
        System.out.println(beanCat.equals(beanCat2));

    }
}