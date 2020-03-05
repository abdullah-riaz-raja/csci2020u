public class RandomClass {

    public static void main(String[] args) {
        float f = (float) Math.random();
        //System.out.println(f);

        int low = 10;
        int high = 200;

        int r = low + (int) (Math.random() * (high-low +1));

        System.out.println(r);

    }
}
