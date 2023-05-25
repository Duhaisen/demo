public class Jvm {

    public int a = 10;

    public int b = 10;

    public int add(){
        return a++;

    }

    public int subtract(){

        b++;
        return b;
    }

    public static void main(String args[]){
        Jvm jvm = new Jvm();

        System.out.println(jvm.add());
        System.out.println(jvm.subtract());

    }

}
