public interface CommonInterface {
    @MethodAnnotation
    void test();

    @MethodAnnotation
    default void testDefault(){
        test();
    };
}
