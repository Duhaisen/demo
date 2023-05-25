import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Child extends Parent implements CommonInterface {

    @Override
    public void invoke() {
        super.invoke();
    }

    @Override
    public void say() {
        System.out.println("Child say()");
        super.say();
    }

    @Override
    @MethodAnnotation
    protected void print(){
        System.out.println("Child");
    }




    public static void main(String[] args) throws NoSuchMethodException {

        Child c = new Child();
        c.invoke();

        /*Class cl = Child.class;

        Method[] declaredMethods = cl.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        Arrays.stream(declaredMethods).forEach(
                method -> {
                    Annotation[] annotations = method.getAnnotations();
                    System.out.println(method +" : "+ Arrays.toString(annotations));
                }
        );


        Method[] methods = cl.getMethods();


        System.out.println(Arrays.toString(methods));

        Arrays.stream(methods).forEach(
                method -> {
                    Annotation[] annotations = method.getAnnotations();
                    System.out.println(method +" : "+ Arrays.toString(annotations));
                }
        );*/

        /*Method invokeMethod = cl.getMethod("invoke");

        System.out.println(invokeMethod);

        MethodAnnotation annotation =  invokeMethod.getDeclaredAnnotation(MethodAnnotation.class);

        System.out.println(annotation);*/












    }

}
