public abstract class ContratoDecorator implements Contrato {
  private Contrato decoratorContrato;

  ContratoDecorator(Contrato decoratorContrato) {
    this.decoratorContrato = decoratorContrato;
  }

  @Override
  public double mostrarValoresTotal() {
    return decoratorContrato.mostrarValoresTotal();
  }

  @Override
  public String listaCanaias() {
    return decoratorContrato.listaCanaias();
  }
}
