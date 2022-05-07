public class Telecine extends ContratoDecorator {

  Telecine(HBO hbo) {
    super(hbo);
  }

  @Override
  public double mostrarValoresTotal() {
    return super.mostrarValoresTotal() + 39.90;
  }

  @Override
  public String listaCanaias() {
    // TODO Auto-generated method stub
    return super.listaCanaias() + " Telecine |";
  }
}
