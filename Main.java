class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();

    System.out.println("Pessoa 1: ");
    pessoa1.setNome("Maria Eduarda");
    pessoa1.setIdade(18);

    pessoa1.dizerNome();
    pessoa1.dizerIdade();
  }
}
