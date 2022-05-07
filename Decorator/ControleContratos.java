public class ControleContratos {
  public static void main(String[] args) {
    Contrato contrato = new Brasileiro(new Libertadores(new Telecine(new HBO(new UFC(new Basico())))));
    System.out.println(contrato.mostrarValoresTotal());
    System.out.println(contrato.listaCanaias());
  }
}