package T15ReflectionAndAnnotation.lab.L03HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.TreeSet;

import static T15ReflectionAndAnnotation.lab.L03HighQualityMistakes.ReflectionUtils.filterMembersByName;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;

        Method[] methods = clazz.getDeclaredMethods();

        Field[] declaredFields = clazz.getDeclaredFields();

        TreeSet<Field> fields = ReflectionUtils.collectByName(Arrays.stream(declaredFields));

        ReflectionUtils.filterMembers(fields.stream(), f -> !Modifier.isPrivate(f.getModifiers()))
                .forEach(f -> System.out.println(f.getName() + " must be private!"));

        TreeSet<Method> getters = ReflectionUtils.collectByName(filterMembersByName(methods, "get"));

        ReflectionUtils.filterMembers(getters.stream(), g -> !Modifier.isPublic(g.getModifiers()))
                .forEach(g -> System.out.println(g.getName() + " have to be public!"));

        TreeSet<Method> setters = ReflectionUtils.collectByName(filterMembersByName(methods, "set"));

        ReflectionUtils.filterMembers(setters.stream(), s -> !Modifier.isPrivate(s.getModifiers()))
                .forEach(s -> System.out.println(s.getName() + " have to be private!"));
    }
}
