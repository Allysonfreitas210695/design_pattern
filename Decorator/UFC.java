public class UFC extends ContratoDecorator {

  UFC(Basico basico) {
    super(basico);
  }

  @Override
  public double mostrarValoresTotal() {
    return super.mostrarValoresTotal() + 19.90;
  }

  @Override
  public String listaCanaias() {
    return super.listaCanaias() + " UFC |";
  }
}
