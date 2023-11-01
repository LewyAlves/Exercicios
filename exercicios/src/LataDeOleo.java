public class LataDeOleo {
    //apresentar o volume da lata de oleo através de uma equação V= h x l x c
    double c = 25;
    double l = 7.5;
    double h = 15.0;

    public void equacao(){
        System.out.println("V = h x l x c");
    }

    public void medidas(){
        System.out.println("medidas:");
        System.out.println("comprimento: " + c + " largura: " + l + " altura: " + h);
    }

    Double equacaoDeV = h*l*c;

}
