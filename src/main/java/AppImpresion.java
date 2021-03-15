import java.util.Scanner;

public class AppImpresion {
    public static void main(String[] args) {
        String[] pagina = {"1","3","-","5","10"};
        impresionPaginas(pagina);
    }

    public static void impresionPaginas(String[] pagina){
        int i = 0;
        int j = 0;
        for (i = 0;  i < pagina.length; i++) {
            if (pagina[i].equals("-")) {
                int pagInicio = Integer.parseInt(pagina[i-1]);
                int pagFinal = Integer.parseInt(pagina[i+1]);
                for (j = pagInicio+1; j < pagFinal; j++)
                    System.out.println(j);
            }
            else {
                System.out.println(pagina[i]);
            }
        }
    }
}


