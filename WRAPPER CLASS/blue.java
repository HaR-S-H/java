public class blue {
    public static void main(String[] args) {
        Integer a = 10;
        int a1 = 10;
        System.out.println(a);
        System.out.println(a1);
        //Auto-boxing->stack ka content heap m transfer
        int b = 9;
        Integer b1 = 90;
        b1 = b;
        //Un-boxing->heap ka content stack m transfer
        Integer c = 89;
        int c1 = -7;
        c1 = c;
        Integer e1 = 78;
        Integer e2 = 78;
        Integer e3 = 178;
        Integer e4 = 178;
        System.out.println(e1 == e2);
        System.out.println(e3 == e4);
        //reason->cache range-> -127 to 128 ke range m agr koi value toh woh canche m jake store hoti h toh e1 store hoga uske baad e2 store hoga aur e1 e2 dono range k andr h toh dono k address same hoge but e3 e4 range se bhar  honge toh duplicate generate hoga aur address same nhi hoga isi wajeh se false ayega 
    }
}
