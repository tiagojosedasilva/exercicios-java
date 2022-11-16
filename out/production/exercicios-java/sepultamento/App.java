public class App {

    public static void main(String[] args) {
        Sepultamento sep = new Sepultamento();
        Corpo corpo = new Corpo();
        Tumulo tumulo = new Tumulo();
        Exumacao exm = new Exumacao();

        corpo.setIdCorpo(01);
        corpo.setNome("Aldo");
        corpo.setSituacao("Morrido");

        tumulo.setIdTumulo(01);
        tumulo.setData("02/04/2021");
        tumulo.setOcupado(false);

        sep.setIdSepultamento(01);
        sep.setData("02/04/2021");
        sep.setCorpo(corpo);
        sep.setTumulo(tumulo);
        sep.sepultar();

        exm.setCorpo(corpo);
        exm.setIdExumacao(01);
        exm.setData("02/04/2023");

        System.out.println(sep.getIdSepultamento());
        System.out.println(sep.getData());
        System.out.println(sep.getCorpo());
        System.out.println(sep.getTumulo());
        System.out.println(sep.getCorpo().getSituacao());
        System.out.println(sep.getCorpo().getNome());
    }
}
