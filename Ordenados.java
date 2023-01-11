import java.lang.String;
import java.util.ArrayList;
import java.io.IOException;

public class Ordenados extends Contador{

public ArrayList<String> insertSort(ArrayList<String> source){
		
  int index = 1;
  
  while (index < source.size()){

    insertSorted((String)(source.get(index)), source, index);
    index = index + 1;

  }

  return source;
}	
  
  public ArrayList<String> insertSorted(String s, ArrayList<String> source, int index){

      int loc = index - 1;


      while ((loc >= 0) &&(s.compareTo((String) source.get(loc)) <= 0)){


        source.set(loc + 1, source.get(loc));
        loc = loc - 1;

        Incrementador();
      }

      source.set(loc+1, s);


      return source;
  }

  public ArrayList<String> selectionSort(ArrayList<String> listaDeNomes) {

    ArrayList<String> lista = new ArrayList<>(listaDeNomes);

    for (int i = 0; i < lista.size()-1; i++) {

      String menor = lista.get(i);
      int menorIndex = i;

      for (int j = i+1; j < lista.size(); j++) {
        String value = lista.get(j);

        if (value.compareTo(menor) < 0) {
          menor = value;
          menorIndex = j;
        }
      }

      if (menorIndex != i) {
        String temp = lista.get(i);
        lista.set(i, menor);
        lista.set(menorIndex, temp);
        Incrementador();

      }
    }
    return lista;

  }


  public ArrayList<String> QuickSort (ArrayList<String> listaDeNomes)throws IOException {

    ArrayList<String> lista =  new ArrayList<>(listaDeNomes);

    quickSort(lista, 0, lista.size() - 1);

    System.out.println("\n");

    return lista;
  }

  private void quickSort(ArrayList<String> lista, int inicio, int fim) {

    if (inicio < fim) {

        int posicaoPivo = separar(lista, inicio, fim);
        quickSort(lista, inicio, posicaoPivo - 1);
        quickSort(lista, posicaoPivo + 1, fim);
    }
}

private int separar(ArrayList<String> lista, int inicio, int fim) {

  String pivo = lista.get(inicio);
  int i = inicio + 1, f = fim;

  while (i <= f) {
      
      if (pivo.compareTo(lista.get(i)) > 0) {
        i++;
      }

      else if (pivo.compareTo(lista.get(f)) < 0) {
        f--;
      }

      else {

        String troca = lista.get(i);

        lista.set(i, lista.get(f));
        lista.set(f, troca);

        Incrementador();

        i++;
        f--;
      }
  }

  lista.set(inicio, lista.get(f));
  lista.set(f, pivo);

  if ((lista.get(inicio).equals(lista.get(f)) == true) && (lista.get(inicio).equals(pivo)) == true) {

      return f;
  }

  Incrementador();

  return f;
}
}