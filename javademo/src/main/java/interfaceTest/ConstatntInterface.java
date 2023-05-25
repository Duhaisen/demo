package interfaceTest;

/**
 * @Author Duhaisen
 * @Date 2021/12/2 16:16
 * @Version 1.0
 */
public interface ConstatntInterface {

    interface Status {
        Integer handle = 1;

    }


    static boolean isHander(Integer handle){
        return Status.handle.equals(handle);
    }

}
