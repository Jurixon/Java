package pl.lublin.wsei.java.cwiczenia;

public class Main {
    public static int calcLog(int arg){
        return (int)(Math.log(arg) / Math.log(2));
    }
    public static void main(String[] args) {
	   System.out.print("Ala");
	   System.out.print("ma");
	   System.out.print("kota");

	   System.out.print("Ala\n");
	   System.out.print("ma\n");
	   System.out.print("kota\n");

	   System.out.println("Ala");
	   System.out.println("ma");
	   System.out.println("Kota");


	   int a = 3;
	   double b = 4.21;
	   String s = "jakiś tekst";

	   System.out.printf("a =%d, b = %f, s = %s \n", a,b,s );

        // ograniczenie wpisywania miejsca
        System.out.printf("a = %d, b = %.2f, s = %20s %n", a,b,s);

                System.out.printf("alfa\tsin(alfa)\n");
        System.out.print("arg \t log2(arg) \t sum(arg)");
        int arg = 1;
        int log2 = 0;
        int sumArg = 1;
        for(int i = 0; i < 370; i+=10){
            log2 = calcLog(arg);
            System.out.println(arg + " " + log2 + " " + sumArg);
            arg += 2;
            sumArg += arg;
        }

    }
}
