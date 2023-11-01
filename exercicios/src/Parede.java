public class Parede {
    //parede
    Double hp = 3.0;
    Double lp = 5.0;

    Double areaDaParede = lp * hp;

    //azulejos
    Double ha = 0.5;
    Double la = 0.5;

    Double areaDoAzulejo = ha * la;

    Double qtDeAzulejos = areaDaParede / areaDoAzulejo;
}
