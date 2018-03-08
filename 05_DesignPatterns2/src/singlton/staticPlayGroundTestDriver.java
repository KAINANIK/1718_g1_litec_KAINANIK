package singlton;

public class staticPlayGroundTestDriver {


        public static void main(String[] args) {
            staticPlayground spg1 = new staticPlayground();
            staticPlayground spg2 = new staticPlayground();

            showInfo(spg1, spg2);

            spg1.setStaticVal(100);
            spg1.setNoneStaticVal(-100);

            showInfo(spg1, spg2);
        }

        public static void showInfo(staticPlayground spg1, staticPlayground spg2) {
            System.out.println("sqg.static=" + spg1.getStaticVal());
            System.out.println("sqg.static=" + spg2.getStaticVal());
            System.out.println("sqg.static=" + spg1.getNoneStaticVal());
            System.out.println("sqg.static=" + spg2.getNoneStaticVal());
        }

    }

