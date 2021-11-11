
public class Arreglos {
  
 public static void main(String[] args)
 {
int Arreglo[] = new int [100];
for (int i=0; i<100; i++){
Arreglo[i] = (int) (Math.random()*10);
}
System.out.println("Resultado: ");
for (int i =0; i<100; i++){
System.out.println("["+i+"]="+Arreglo[i]);
}
}
}
