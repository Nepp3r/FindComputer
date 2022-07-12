import java.util.Scanner;
public class App {
        static Computer amd = new Computer(400, 1000, 28, 8, "AMD computer");
        static Computer intel = new Computer(500, 1100, 28, 8, "Intel computer");
        static Computer xiaomi = new Computer(600, 1300, 30, 16, "Xiaomi computer");
        static Computer geforce = new Computer(800, 1500, 36, 32, "GeForce computer");
        static Computer[] setofcomp = new Computer[] {amd, xiaomi, intel, geforce};
        static int[] a = new int[setofcomp.length];
    public static void main(String[] args) {
        System.out.println("What power computer do you want?");
        Scanner x = new Scanner(System.in);
        int c = x.nextInt();
        Count rate = new Count(a, c, setofcomp);
            System.out.println("We have offers "+rate.res()+" far away.");
        }
    }