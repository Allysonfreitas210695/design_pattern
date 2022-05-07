public class HBO extends ContratoDecorator {

  HBO(UFC ufc) {
    super(ufc);
  }

  @Override
  public double mostrarValoresTotal() {
    return super.mostrarValoresTotal() + 39.90;
  }

  @Override
  public String listaCanaias() {
    return super.listaCanaias() + " HBO |";
  }

}
