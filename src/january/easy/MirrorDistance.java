package january.easy;

public class MirrorDistance {
    public int mirrorDistance(int n) {

        String s = "" + n;
        StringBuilder build = new StringBuilder(s);
        build.reverse();
        int num = Integer.parseInt(build.toString());

        return Math.abs(num-n);

    }
}
