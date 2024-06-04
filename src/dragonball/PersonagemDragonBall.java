package dragonball;

abstract class PersonagemDragonBall {
    String nome;
    int ki;

    abstract int calcularPoder();
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Poder de Luta: " + calcularPoder();
    }
}
