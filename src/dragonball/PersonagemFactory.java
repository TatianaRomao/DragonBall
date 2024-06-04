package dragonball;

class PersonagemFactory {
    static PersonagemDragonBall createPersonagem(String nome) {
        switch (nome) {
            case "Kuririn":
            	Terraqueo terraqueo = new Terraqueo();
            	terraqueo.nome = nome;
                return new Terraqueo();
            case "Goku":
            	 Sayajin sayajinGok = new Sayajin();
                 sayajinGok.nome = nome;
                 sayajinGok.temRabo = true;
                 return sayajinGok;
            case "Gohan":
                Sayajin sayajinGoh = new Sayajin();
                sayajinGoh.nome = nome;
                sayajinGoh.nivelMaximoSSJ = 3;
                sayajinGoh.temRabo = false;
                return sayajinGoh;
            case "Dendê":
            	Namekuseijin namekuseijin = new Namekuseijin();
            	namekuseijin.nome = nome;
                return new Namekuseijin();
            default:
                return null;
        }
    }
}
