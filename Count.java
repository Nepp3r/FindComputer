public class Count {

    int[] a = new int[App.a.length];
    Computer[] b = new Computer[App.setofcomp.length];
    int c;
    public Count(int[]a, int c, Computer[] b) {
            this.a = a;
            this.c = c;
            this.b = b;
            }
    public int res(){
        for (int i = 0; i<a.length; i++){
            a[i] = b[i].charac();
        }
        for (int i =0; i<a.length; i++){
            System.out.println(b[i].name +" "+ b[i].charac());
        }
        for (int i = 0; i<a.length; i++){
            a[i] = (a[i]-c);
            a[i] = Math.abs(a[i]);
        }
        var min = a[0];
        for (int num : a) {
            if (num < min){
            min = num;   
            }
    }
    return min;
}
}