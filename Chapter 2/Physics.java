public class Physics {
    public static void main(String[] args) {

        int t = 1;
        int s0 = 3;
        int v0 = 7;
        int a = 11;

        double s = (s0 + (v0 * t) + (0.5 * (a * (Math.pow(t, 2)))));
        System.out.println("s=s0+v0t+1/2at^2 WHERE a="+a+",s0="+s0+",v0="+v0+",t="+t);
        System.out.println("s="+s);
    }
}
