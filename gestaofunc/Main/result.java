package Main;
 import classes.conversorunid;
 
//Main.java

public class result {
 public static void main(String[] args) {
     // Testando os metodos de conversao
     double tempCelsius = 25.0;
     double distanciaKm = 10.0;
     double pesoGramas = 500.0;

     double tempFahrenheit = conversorunid.celsiusParaFahrenheit(tempCelsius);
     double distanciaMilhas = conversorunid.quilometrosParaMilhas(distanciaKm);
     double pesoLibras = conversorunid.gramasParaLibras(pesoGramas);

     System.out.println(tempCelsius + "°C em Fahrenheit é: " + tempFahrenheit + "°F");
     System.out.println(distanciaKm + " km em Milhas é: " + distanciaMilhas + " milhas");
     System.out.println(pesoGramas + " gramas em Libras é: " + pesoLibras + " libras");
 }
}

