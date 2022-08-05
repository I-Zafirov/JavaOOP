package T15ReflectionAndAnnotation.lab.L01Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        Class <Reflection> clazz = Reflection.class;

        System.out.println(clazz);

        Class<?> superclass = clazz.getSuperclass();

        System.out.println(superclass);

        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> c : interfaces) {
            System.out.println(c);
        }

        Constructor<Reflection> constructor = clazz.getDeclaredConstructor();

        Reflection newInstance = constructor.newInstance();

        Method getName = clazz.getMethod("getName");

        System.out.println(newInstance);
    }
}
