public class Libertadores extends ContratoDecorator {

  Libertadores(Telecine telecine) {
    super(telecine);
  }

  @Override
  public double mostrarValoresTotal() {
    return super.mostrarValoresTotal() + 19.90;
  }

  @Override
  public String listaCanaias() {
    return super.listaCanaias() + " libertadores |";
  }

}
