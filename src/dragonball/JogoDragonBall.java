package dragonball;

public class JogoDragonBall {
    public static void main(String[] args) {
        Terraqueo chichi = (Terraqueo) PersonagemFactory.createPersonagem("Kuririn");
        chichi.ki = 200;
        chichi.pais = "Terra";

        Sayajin goku = (Sayajin) PersonagemFactory.createPersonagem("Goku");
        goku.ki = 11000;
        goku.nivelMaximoSSJ = 5;
        System.out.println(goku.transformar(5));  

        Sayajin gohan = (Sayajin) PersonagemFactory.createPersonagem("Gohan");
        gohan.ki = 4200;
        gohan.nivelMaximoSSJ = 2;
        String resultadoTransformacaoGohan = gohan.transformar(5);
        if (resultadoTransformacaoGohan.contains("n possível")) {
        	gohan.nivelMaximoSSJ = 3;
            System.out.println(", Nível Máximo SSJ: 3"); 
        }

        Namekuseijin dende = (Namekuseijin) PersonagemFactory.createPersonagem("Dendê");
        dende.ki = 650;
        dende.quantidadeEsferas = 7;
        dende.nome = "dende";
        dende.podeCurar = true;
        System.out.println(dende.fazerDesejo("Reviver kuririn"));  

        System.out.println(goku);
        System.out.println(gohan);
        System.out.println(dende);
    }
}
