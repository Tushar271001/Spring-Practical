package com.maven;
import com.maven.entities.Student;
import com.maven.services.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // XML based configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student student = context.getBean("student", Student.class);
//        System.out.println(student.toString());

  // Annotation based configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student getStudent = context.getBean("student", Student.class);
        System.out.println(getStudent.toString());
        context.registerShutdownHook();
    }
}
