public class Brasileiro extends ContratoDecorator {

  Brasileiro(Libertadores libertadores) {
    super(libertadores);
  }

  @Override
  public double mostrarValoresTotal() {
    return super.mostrarValoresTotal() + 19.90;
  }

  @Override
  public String listaCanaias() {
    return super.listaCanaias() + " Brasileiro | ";
  }
}
