public class Anonymous {

    public interface HelloWorld {
        void say1();

        void say2();

        int say3();
    }

    abstract private class speek implements HelloWorld {

    }

    abstract class talk extends speek {

    }

    abstract class haha extends talk {

    }

    class niHao extends haha {
        @Override
        public void say1() {
            System.out.println("hello");
        }

        @Override
        public void say2(){
            System.out.println("jello");
        }
        @Override
        public int say3(){
            return 1;
        }


    }



}
