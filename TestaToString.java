public class TestaToString {
public static void main(String[] args) {
 double d = 858.48;
 String s = Double.toString(d);
 int ponto = s.indexOf('.');
 System.out.println(ponto + " dígitos " + "antes do ponto decimal.");
 System.out.println((s.length()-ponto-1)+" dígitos depois do ponto decimal.");
}
}