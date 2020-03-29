package jogodavelha;


public class Jogo {
    
    private String matriz[][];
    
    private int jogador1_h, jogador1_v;
    
    private int jogador2_h, jogador2_v;
    
    private int placar1, placar2, velha;
    
    private int contador;
    
    private boolean teste;
    
    private boolean verifica1, verifica2;
    
    public Jogo(){
        matriz = new String[3][3];
        
        placar1 = 0; placar2 = 0; velha = 0;
        
        teste = false;
        
        verifica1 = false; verifica2 = false;
        
        
        for (int l = 0; l < matriz.length; l++)  {  
       for (int c = 0; c < matriz[0].length; c++)     { 
           matriz[l][c] = "*";
       }  
     }
        
      
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public boolean isTeste() {
        return teste;
    }

    public void setTeste(boolean teste) {
        this.teste = teste;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    
    
    public void setJogador1_h(int jogador1_h) {
        this.jogador1_h = jogador1_h;
    }

    public void setJogador1_v(int jogador1_v) {
        this.jogador1_v = jogador1_v;
    }
    
    public void setVelha(int velha){
        this.velha += velha;
        
        
    }
    
    public int getVelha(){
        return velha;
    }

    public int getJogador1_h() {
        return jogador1_h;
    }

    public int getJogador1_v() {
        return jogador1_v;
    }
    
    
    public int getJogador2_h() {
        return jogador2_h;
    }

    public void setJogador2_h(int jogador2_h) {
        this.jogador2_h = jogador2_h;
    }

    public int getJogador2_v() {
        return jogador2_v;
    }

    public void setJogador2_v(int jogador2_v) {
        this.jogador2_v = jogador2_v;
    }

    public boolean isVerifica1() {
        return verifica1;
    }

    public void setVerifica1(boolean verifica) {
        this.verifica1 = verifica;
    }

    public boolean isVerifica2() {
        return verifica2;
    }

    public void setVerifica2(boolean verifica2) {
        this.verifica2 = verifica2;
    }
    
    public void verificar2(){
        if("x".equals(matriz[getJogador2_h()][getJogador2_v()]) || "o".equals(matriz[getJogador2_h()][getJogador2_v()])){
            setVerifica2(false);
            System.out.println("|--------------------|");
            System.out.println("| já está preenchido |");
            System.out.println("|--------------------|");
            System.out.println("");}
        else{
            matriz[getJogador2_h()][getJogador2_v()] = "o";
            setVerifica2(true);}
            
    }
    
    public void verificar1(){
        if("x".equals(matriz[getJogador1_h()][getJogador1_v()]) || "o".equals(matriz[getJogador1_h()][getJogador1_v()])){
            setVerifica1(false);
            System.out.println("|--------------------|");
            System.out.println("| já está preenchido |");
            System.out.println("|--------------------|");
            System.out.println("");}
        else
            matriz[getJogador1_h()][getJogador1_v()] = "x";{
            setVerifica1(true);}
            
    }
    
        public void zerar(){
    for (int l = 0; l < matriz.length; l++)  {  
       for (int c = 0; c < matriz[0].length; c++)     { 
           matriz[l][c] = "*";
       }  
     }
    }
    
    public void verificacao1(){
    
        //-------------------------------------------------------------------------
        //verificacao horizontal

        if ("x".equals(matriz[0][0]) && "x".equals(matriz[0][1]) && "x".equals(matriz[0][2])){
            System.out.println("Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            setTeste(true);
        }
        
        else if ("x".equals(matriz[1][2]) && "x".equals(matriz[1][0]) && "x".equals(matriz[1][1])){
            System.out.println("Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            setTeste(true);
            
        }
        else if ("x".equals(matriz[2][0]) && "x".equals(matriz[2][1]) && "x".equals(matriz[2][2])){
            System.out.println("Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            setTeste(true);

        }
        
        //---------------------------------------------------------------------------
        //verificacao verifical
        
        else if ("x".equals(matriz[0][0]) && "x".equals(matriz[1][0]) && "x".equals(matriz[2][0])){
            System.out.println("Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            setTeste(true);

        }
        
        else if ("x".equals(matriz[0][1]) && "x".equals(matriz[1][1]) && "x".equals(matriz[2][1])){
            System.out.println("Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            setTeste(true);

        }
            
        else if ("x".equals(matriz[0][2]) && "x".equals(matriz[1][2]) && "x".equals(matriz[2][2])){
            System.out.println("Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            setTeste(true);
            
        }
        
        
        //--------------------------------------------------------------------------
        //verificacao diagonal
        
        else if ("x".equals(matriz[0][0]) && "x".equals(matriz[1][1]) && "x".equals(matriz[2][2])){
            System.out.println("Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            setTeste(true);
        }
        
        else if ("x".equals(matriz[0][2]) && "x".equals(matriz[1][1]) && "x".equals(matriz[2][0])){
            System.out.println("Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            setTeste(true);
        }
        //-------------------------------------------------------------------------
    }
    
    public void verificacao2()
    {
        if ("o".equals(matriz[0][0]) && "o".equals(matriz[0][1]) && "o".equals(matriz[0][2])){
            
            System.out.println("Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            setTeste(true);

        }
        
        else if ("o".equals(matriz[1][0]) && "o".equals(matriz[1][1]) && "o".equals(matriz[1][2])){
            System.out.println("Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            setTeste(true);

        }
        
        else if ("o".equals(matriz[2][0]) && "o".equals(matriz[2][1]) && "o".equals(matriz[2][2])){
            System.out.println("Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            setTeste(true);

        }
        
        //---------------------------------------------------------------------------
        //verificacao verifical
        
        else if ("o".equals(matriz[0][0]) && "o".equals(matriz[1][0]) && "o".equals(matriz[2][0])){
            System.out.println("Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            setTeste(true);

        }
        
        else if ("o".equals(matriz[0][1]) && "o".equals(matriz[1][1]) && "o".equals(matriz[2][1])){
            System.out.println("Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            setTeste(true);

        }
            
        else if ("o".equals(matriz[0][2]) && "o".equals(matriz[1][2]) && "o".equals(matriz[2][2])){
            System.out.println("Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            setTeste(true);
        }
        
        //--------------------------------------------------------------------------
        //verificacao diagonal
        
        else if ("o".equals(matriz[0][0]) && "o".equals(matriz[1][1]) && "o".equals(matriz[2][2])){
            System.out.println("Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            setTeste(true);

        }
        
        else if ("o".equals(matriz[0][2]) && "o".equals(matriz[1][1]) && "o".equals(matriz[2][0])){
            System.out.println("Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            setTeste(true);
        }
        //-------------------------------------------------------------------------
    
    }
    
    public void placar(){
        System.out.println("|--------------------|");
        System.out.println("| Pontos jogador1 = " + this.placar1 + "|" );
        System.out.println("| Pontos jogador2 = " + this.placar2 + "|");
        System.out.println("| Pontos velha = " + this.velha + "   |");
        System.out.println("|--------------------|");
    }
    

    
    public void status()
    {
    for (int l = 0; l < matriz.length; l++)  {  
       for (int c = 0; c < matriz[0].length; c++)     { 
           System.out.print(matriz[l][c] + " "); //imprime caracter a caracter
       }  
       System.out.println(" "); //muda de linha
     }
    
    }
    
}
