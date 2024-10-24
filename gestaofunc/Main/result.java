package Main;
import classes.conversorunid;

//Main.java

public class result {
    public static void main(String[] args) {
        // Testando os metodos de conversao
        double tempCelsius = 25.0;
        double distanciaKm = 10.0;
        double pesoGramas = 500.0;

        // Convertendo Celsius para Fahrenheit
        double tempFahrenheit = conversorunid.celsiusParaFahrenheit(tempCelsius);
        // Convertendo Quilometros para Milhas
        double distanciaMilhas = conversorunid.quilometrosParaMilhas(distanciaKm);
        // Convertendo Gramas para Libras
        double pesoLibras = conversorunid.gramasParaLibras(pesoGramas);

        // Exibindo os resultados das conversoes
        System.out.println(tempCelsius + "°C em Fahrenheit é: " + tempFahrenheit + "°F");
        System.out.println(distanciaKm + " km em Milhas é: " + distanciaMilhas + " milhas");
        System.out.println(pesoGramas + " gramas em Libras é: " + pesoLibras + " libras");
    }
}
