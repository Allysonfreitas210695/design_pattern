public class Basico implements Contrato {

  @Override
  public double mostrarValoresTotal() {
    return 10;
  }

  @Override
  public String listaCanaias() {
    return "| Basico |";
  }
}
