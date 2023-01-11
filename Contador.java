import java.util.Scanner;

public class Contador {
    
  Scanner ler = new Scanner(System.in);
  
  private int contador;

  public void Incrementador() {
    
    contador++;
  }

  public int getContador() {
    return contador;
  }

  public void imprimeContador() {
    System.out.println("\ncontador = " + contador);
    contador = 0;
  }
}