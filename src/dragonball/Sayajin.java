package dragonball;

class Sayajin extends PersonagemDragonBall implements Transformavel {
    int nivelMaximoSSJ;
    boolean temRabo;

    @Override
    int calcularPoder() {
        return (int) (ki * (1 + nivelMaximoSSJ * 0.1));
    }

    @Override
    public String transformar(int nivel) {
        if (nivel <= nivelMaximoSSJ) {
            return nome + " transformou para super sayajin nível " + nivel;
        } else {
            return "Transformação n foi possível para o nível " + nivel;
        }
    }
    
    public String toString() {
        return super.toString() + ", Nível Máximo SSJ: " + nivelMaximoSSJ;
    }
}
