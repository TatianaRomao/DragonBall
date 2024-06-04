package dragonball;

class Namekuseijin extends PersonagemDragonBall {
    int quantidadeEsferas;
    boolean podeCurar;

    @Override
    int calcularPoder() {
        return (int) (ki * (1 + (podeCurar ? 0.2 : 0)));
    }

    String fazerDesejo(String desejo) {
        return nome + " fez o desejo: " + desejo;
    }
    
    public String toString() {
        return super.toString() + ", Quantidade de Esferas: " + quantidadeEsferas + ", Pode Curar: " + podeCurar;
    }
}
