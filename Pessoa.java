class Pessoa {
  private String nome;
  private int idade;

  public void dizerNome() {
    System.out.println("Nome: " + nome);
  }

  public void dizerIdade() {
    System.out.println("Idade: " + idade);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}
