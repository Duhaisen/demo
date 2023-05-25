import interfaceTest.ConstatntInterface;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;

public class Parent implements CommonInterface {

    @MethodAnnotation
    public void invoke() {
        System.out.println("Parent invoke()");
        say();
    }

    @MethodAnnotation
    protected void say() {
        System.out.println(getClass());
        System.out.println("Parent");
        print();
    }

    @MethodAnnotation
    protected void print(){
        System.out.println("Parent");
    }



    static class Top{
        public  int a;

        private int b;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }


    static class TopSub extends Top{

        public int a;
        public int b;

        @Override
        public void setA(int a) {
            this.a = a;
        }


        public int getTopA() {
            return super.a;
        }


        public int getTopB() {
            return super.getB();
        }
    }



    public static void main(String[] args) throws NoSuchMethodException {

        TopSub topSub = new TopSub();
        topSub.setA(1);
        topSub.setB(1111);
        System.out.println(topSub.a);
        System.out.println(topSub.getA());
        System.out.println(topSub.getTopA());

        System.out.println(topSub.b);
        System.out.println(topSub.getB());
        System.out.println(topSub.getTopB());



        /*Class cl = Child.class;
·
        Method[] methods = cl.getMethods();
        System.out.println(Arrays.toString(methods));

        Arrays.stream(methods).forEach(
                method -> {
                    Annotation[] annotations = method.getAnnotations();
                    System.out.println(Arrays.toString(annotations));
                }
        );*/

        /*Parent parent = new Child();
        parent.invoke();
*/

        /*System.out.println(ConstatntInterface.isHander(0));
        System.out.println(ConstatntInterface.isHander(1));*/




    }


    @Override
    public void test() {

    }
}
