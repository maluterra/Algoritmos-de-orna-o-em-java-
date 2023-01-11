import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args)
    throws IOException, InterruptedException {
    String entrada100Ale = "entrada-100-ale.txt";
    String Quick_Ordenado = "Quick_Ordenado.csv";
    String Select_Ordenado = "Select_Ordenado.csv";
    String Insert_Ordenado = "Insert_Ordenado.csv";

    ArrayList<String> nomes100ale = Dados.leArquivo(entrada100Ale);
    ArrayList<String> ordena_quicksort = new ArrayList<String>();
    ArrayList<String> ordena_select = new ArrayList<String>();
    ArrayList<String> ordena_insert = new ArrayList<String>();

    Ordenados cont100ale = new Ordenados();

    System.out.println("\n\n\t******************************************************");
		System.out.println("\t*\t\t\t\t                     *\n\t*\t      ORDENAÇÃO - 100  ALEATORIOS\t     *\n\t*\t\t\t\t\t\t     *");
    System.out.println ("\t******************************************************");

    System.out.println("\t\t\t Q U I C K - S O R T");

    ordena_quicksort = cont100ale.QuickSort(nomes100ale);
    cont100ale.imprimeContador();
    Dados.Escreve(ordena_quicksort,Quick_Ordenado,"\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 100  ALEATORIOS\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t S E L E C T - S O R T");

    ordena_select = cont100ale.selectionSort(nomes100ale);
    cont100ale.imprimeContador();
    Dados.Escreve(ordena_select,Select_Ordenado,"\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 100  ALEATORIOS\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("-------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t I N S E R T - S O R T");

    ordena_insert = cont100ale.insertSort(nomes100ale);
    cont100ale.imprimeContador();
    Dados.Escreve(ordena_insert,Insert_Ordenado,"\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 100  ALEATORIOS\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    String entrada100Cre = "entrada-100-cre.txt";

    ArrayList<String> nomes100Cre = Dados.leArquivo(entrada100Cre);

    Ordenados cont100cre = new Ordenados();

    System.out.println("\n\n\t******************************************************");
		System.out.println("\t*\t\t\t\t                     *\n\t*\t      ORDENAÇÃO - 100  CRESCENTES\t     *\n\t*\t\t\t\t\t\t     *");
    System.out.println ("\t******************************************************");
    System.out.println("\t\t\t Q U I C K - S O R T");

    ordena_quicksort = cont100cre.QuickSort(nomes100Cre);
    cont100cre.imprimeContador();
    Dados.Escreve(ordena_quicksort,Quick_Ordenado,"\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 100  CRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t S E L E C T I O N - S O R T");

    ordena_select = cont100cre.selectionSort(nomes100Cre);
    cont100cre.imprimeContador();
    Dados.Escreve(ordena_select,Select_Ordenado,"\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 100  CRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t I N S E R T - S O R T");

    ordena_insert = cont100cre.insertSort(nomes100Cre);
    cont100cre.imprimeContador();
    Dados.Escreve(ordena_insert,Insert_Ordenado,"\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 100  CRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    String entrada100Dec = "entrada-100-dec.txt";

    ArrayList<String> nomes100Dec = Dados.leArquivo(entrada100Dec);
    Ordenados cont100Dec = new Ordenados();

    System.out.println("\n\n\t******************************************************");
		System.out.println("\t*\t\t\t\t                     *\n\t*\t      ORDENAÇÃO - 100  DESCRESCENTES\t     *\n\t*\t\t\t\t\t\t     *");
    System.out.println ("\t******************************************************");
    System.out.println("\t\t\t Q U I C K - S O R T");

    ordena_quicksort = cont100Dec.QuickSort(nomes100Dec);
    cont100Dec.imprimeContador();
    Dados.Escreve(ordena_quicksort,Quick_Ordenado,"\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 100  DECRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t S E L E C T I O N - S O R T");

    ordena_select = cont100Dec.selectionSort(nomes100Dec);
    cont100Dec.imprimeContador();
    Dados.Escreve(ordena_select,Select_Ordenado,"\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 100  DECRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t I N S E R T - S O R T");

    ordena_insert = cont100Dec.insertSort(nomes100Dec);
    cont100Dec.imprimeContador();
    Dados.Escreve(ordena_insert,Insert_Ordenado,"n\\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 100  DECRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");
    
    System.out.println("\n\n\t******************************************************");
		System.out.println("\t*\t\t\t\t                     *\n\t*\t      ORDENAÇÃO - 1000  ALEATORIOS\t     *\n\t*\t\t\t\t\t\t     *");
    System.out.println ("\t******************************************************");

    String entrada1000Ale = "entrada-1000-ale.txt";

    ArrayList<String> nomes1000Ale = Dados.leArquivo(entrada1000Ale);

    Ordenados cont1000Ale = new Ordenados();

    System.out.println("\t\t\t Q U I C K - S O R T");

    ordena_quicksort = cont1000Ale.QuickSort(nomes1000Ale);
    cont1000Ale.imprimeContador();
    Dados.Escreve(ordena_quicksort, Quick_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 1000  ALEATÓRIOS\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t S E L E C T I O N - S O R T");

    ordena_select = cont1000Ale.selectionSort(nomes1000Ale);
    cont1000Ale.imprimeContador();
    Dados.Escreve(ordena_select, Select_Ordenado , "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 1000  ALEATÓRIOS\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t I N S E R T - S O R T");

    ordena_insert = cont1000Ale.insertSort(nomes1000Ale);
    cont1000Ale.imprimeContador();
    Dados.Escreve(ordena_insert, Insert_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 1000  ALEATÓRIOS\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\n\n\t******************************************************");
		System.out.println("\t*\t\t\t\t                     *\n\t*\t      ORDENAÇÃO - 1000  CRESCENTES\t     *\n\t*\t\t\t\t\t\t     *");
    System.out.println ("\t******************************************************");

    String entrada1000Cre = "entrada-1000-cre.txt";

    ArrayList<String> nomes1000Cre = Dados.leArquivo(entrada1000Cre);

    Ordenados cont1000Cre = new Ordenados();

    System.out.println("\t\t\t Q U I C K - S O R T");

    ordena_quicksort = cont1000Cre.QuickSort(nomes1000Cre);
    cont1000Cre.imprimeContador();
    Dados.Escreve(ordena_quicksort, Quick_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 1000  CRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");
    
    System.out.println("\t\t\t S E L E C T I O N - S O R T");

    ordena_select = cont1000Cre.selectionSort(nomes1000Cre);
    cont1000Cre.imprimeContador();
    Dados.Escreve(ordena_select, Select_Ordenado , "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 1000  CRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");
    
    System.out.println("\t\t\t I N S E R T - S O R T");

    ordena_insert = cont1000Cre.insertSort(nomes1000Cre);
    cont1000Cre.imprimeContador();
    Dados.Escreve(ordena_insert, Insert_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 1000  CRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\n\n\t******************************************************");
		System.out.println("\t*\t\t\t\t                     *\n\t*\t      ORDENAÇÃO - 1000 DECRESCENTES\t     *\n\t*\t\t\t\t\t\t     *");
    System.out.println ("\t******************************************************");

    String entrada1000Dec = "entrada-1000-dec.txt";

    ArrayList<String> nomes1000Dec = Dados.leArquivo(entrada1000Dec);

    Ordenados cont1000Dec = new Ordenados();

    System.out.println("\t\t\t Q U I C K - S O R T");

    ordena_quicksort = cont1000Dec.QuickSort(nomes1000Dec);
    cont1000Dec.imprimeContador();
    Dados.Escreve(ordena_quicksort, Quick_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 1000  DECRESCENTES\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t S E L E C T I O N - S O R T");

    ordena_select = cont1000Dec.selectionSort(nomes1000Dec);
    cont1000Dec.imprimeContador();
    Dados.Escreve(ordena_select, Select_Ordenado , "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 1000  DECRESCENTES\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t I N S E R T - S O R T");

    ordena_insert = cont1000Dec.insertSort(nomes1000Dec);
    cont1000Dec.imprimeContador();
    Dados.Escreve(ordena_insert, Insert_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 1000  DECRESCENTES\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\n\n\t******************************************************");
		System.out.println("\t*\t\t\t\t                     *\n\t*\t      ORDENAÇÃO - 10000  ALEATORIOS\t     *\n\t*\t\t\t\t\t\t     *");
    System.out.println ("\t******************************************************");
    System.out.println("\t\t\t Q U I C K - S O R T\n");
      
    String entrada10000Ale = "entrada-10000-ale.txt";

    ArrayList<String> nomes10000Ale = Dados.leArquivo(entrada10000Ale);

    Ordenados cont10000Ale = new Ordenados();

    ordena_quicksort = cont10000Ale.QuickSort(nomes10000Ale);
    cont10000Ale.imprimeContador();
    Dados.Escreve(ordena_quicksort, Quick_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 10000  ALEATÓRIOS\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t S E L E C T I O N - S O R T\n");

    ordena_select = cont10000Ale.selectionSort(nomes10000Ale);
    cont10000Ale.imprimeContador();
    Dados.Escreve(ordena_select, Select_Ordenado , "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 10000  ALEATÓRIOS\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t I N S E R T - S O R T\n");

    ordena_insert = cont10000Ale.insertSort(nomes10000Ale);
    cont10000Ale.imprimeContador();
    Dados.Escreve(ordena_insert, Insert_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 10000  ALEATÓRIOS\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\n\n\t******************************************************");
		System.out.println("\t*\t\t\t\t                     *\n\t*\t      ORDENAÇÃO - 10000 CRESCENTES\t     *\n\t*\t\t\t\t\t\t     *");
    System.out.println ("\t******************************************************");

    String entrada10000Cre = "entrada-10000-cre.txt";

    ArrayList<String> nomes10000Cre = Dados.leArquivo(entrada10000Cre);

    Ordenados cont10000Cre = new Ordenados();

    System.out.println("\t\t\t Q U I C K - S O R T\n");

    ordena_quicksort = cont10000Cre.QuickSort(nomes10000Cre);
    cont10000Cre.imprimeContador();
    Dados.Escreve(ordena_quicksort, Quick_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 10000  CRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");

    System.out.println("\t\t\t S E L E C T I O N - S O R T\n");

    ordena_select = cont10000Cre.selectionSort(nomes10000Cre);
    cont10000Cre.imprimeContador();
    Dados.Escreve(ordena_select, Select_Ordenado , "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 10000  CRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t I N S E R T - S O R T\n");

    ordena_insert = cont10000Cre.insertSort(nomes10000Cre);
    cont10000Cre.imprimeContador();
    Dados.Escreve(ordena_insert, Insert_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 10000  CRESCENTES\t\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\n\n\t******************************************************");
		System.out.println("\t*\t\t\t\t                     *\n\t*\t      ORDENAÇÃO - 10000 DECRESCENTES\t     *\n\t*\t\t\t\t\t\t     *");
    System.out.println ("\t******************************************************");

    String entrada10000Dec = "entrada-10000-dec.txt";

    ArrayList<String> nomes10000Dec = Dados.leArquivo(entrada10000Dec);

    Ordenados cont10000Dec = new Ordenados();

    System.out.println("\t\t\t Q U I C K - S O R T\n");

    ordena_quicksort = cont10000Dec.QuickSort(nomes10000Dec);
    cont10000Dec.imprimeContador();
    Dados.Escreve(ordena_quicksort, Quick_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 10000  DECRESCENTES\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t S E L E C T I O N - S O R T\n");

    ordena_select = cont10000Dec.selectionSort(nomes10000Dec);
    cont10000Dec.imprimeContador();
    Dados.Escreve(ordena_select, Select_Ordenado , "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 10000  DECRESCENTES\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

    System.out.println("\t\t\t I N S E R T - S O R T\n");

    ordena_insert = cont10000Dec.insertSort(nomes10000Dec);
    cont10000Dec.imprimeContador();
    Dados.Escreve(ordena_insert, Insert_Ordenado, "\n\t******************************************************\n\t*\t\t\t\t\t\t\t                         *\n\t*\t\t      ORDENAÇÃO - 10000  DECRESCENTES\t     *\n\t*\t\t\t\t\t\t\t\t\t\t\t         *\n\t******************************************************\n\n");
    System.out.println("--------------------------------------------------------------------------------------------------");

  }
}
