package dragonball;

class Terraqueo extends PersonagemDragonBall {
    String pais;

    @Override
    int calcularPoder() {
        return ki;
    }
    
    public String toString() {
        return super.toString() + ", pais: " + pais;
    }
}
