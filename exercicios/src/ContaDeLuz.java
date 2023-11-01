public class ContaDeLuz {
    public  void  calculoDaConta(int n, int x){
        var leituraAnterior = x;
        var leituraAtual = n;
        var kwh = leituraAtual - leituraAnterior;
        var precoKwh = 0.75;
        //Contribuição Iluminação Pública - CIP
        var CIP = 0.0;

        if (kwh <= 30){
            CIP = 1.57;
        } else if (kwh <= 50) {
            CIP = 3.14;
        } else if (kwh <= 100) {
            CIP = 12.57;
        }
        var precoDaConta = (kwh*precoKwh) + CIP;

        System.out.println("Valor gasto de energia: " + kwh + "kwh");
        System.out.println("Valor da conta fora impostos: " + "R$" + precoDaConta);
        System.out.println("Valor da Contribuição Iluminação Pública - CIP: " + "R$" + CIP);
    }
}
