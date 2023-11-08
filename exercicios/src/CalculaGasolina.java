import java.text.DecimalFormat;

public class CalculaGasolina {
    public void calculo(int x, int y){
        //Distância em km para chegar ao destino
        var distancia = x;
        //Quantidade de km que o automóvel percorre por L
        var kmPorL = y;
        Double precoDoLitroDeGasolina = 5.90;

        var valorDaViagem = (distancia/kmPorL) * precoDoLitroDeGasolina;
        System.out.println("O valor gasto para percorrer a distância de " + distancia +
                " km com um carro que faz " + kmPorL + " por litro será de: R$" +
                new DecimalFormat("0.##").format(valorDaViagem));
    }
}
