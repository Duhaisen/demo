package interfaceTest;

import java.util.Arrays;

/**
 * @Author Duhaisen
 * @Date 2021/11/10 9:30
 * @Version 1.0
 */
public class ChildrenClass extends ParentClass implements ChildrenInterface {

    public static void main(String[] args) {

        Class clazz = ChildrenClass.class;

        Arrays.stream(clazz.getInterfaces()).forEach(System.out::println);


    }

}
