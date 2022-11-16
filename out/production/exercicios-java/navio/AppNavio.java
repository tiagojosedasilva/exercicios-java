package java.exercicios.navio;

public class AppNavio {

    public static void main(String[] args) {

        NavioGraneleiro navio1 = new NavioGraneleiro(10, "Estrela do Sul",4, 50000, null,4);
        NavioGraneleiro navio2 = new NavioGraneleiro(25, "Cruzeiro do Sul",3, 80000, null,6);

        NavioContainer navio3 = new NavioContainer(33,"Bela Fera", 2, 100000, null, 2, 30);
        NavioContainer navio4 = new NavioContainer(44,"Arrecifes", 2, 120000, null, 2, 30);
        NavioContainer navio5 = new NavioContainer(52,"Aguas Belas", 1, 90000, null, 0, 25);
    }
}
