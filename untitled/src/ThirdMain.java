import com.reflections.pckg.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ThirdMain {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Class c = Class.forName("com.reflections.pckg.Person");

        Method[] methods = c.getDeclaredMethods();


        Person p = new Person();
        for (Method method: methods)
        {
            System.out.println("writing!");
            method.setAccessible(true);
            System.out.println(method.invoke(p,"peter"));
            method.setAccessible(false);
        }

    }
}
