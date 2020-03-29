package jogodavelha;

import java.util.Scanner;

public class Ler {
    
    private int horizontall;
    private int verticall;
    private int contador;
    private String escolha;
    private boolean continuar;
    private boolean jgd1;
    private boolean jgd2;
    private boolean teste;
    private int mudando;
    
    Scanner horizontal = new Scanner(System.in);
    Scanner vertical = new Scanner(System.in);
    Scanner escolhas = new Scanner(System.in);
    
    Jogo jogo = new Jogo();
    
    public Ler(){
        continuar = true;
        jgd1 = true;
        jgd2 = true;
        mudando = 1;
        teste = true;
        contador = 0;
    
    }
    
    
    
    public void jogador1(){
        
        
            while(jgd1){
                if(horizontall > 2 || horizontall < 0){
                    System.out.println("|----------------------------------------------------------------|");
                    System.out.println("| Você não pode digitar uma horizontal maior que 2 e menor que 0 |");
                    System.out.println("|----------------------------------------------------------------|");
                    System.out.println("");
                }
                
                if(verticall > 2 || verticall < 0){
                    System.out.println("|----------------------------------------------------------------|");
                    System.out.println("| Você não pode digitar uma vertifical maior que 2 e menor que 0 |");
                    System.out.println("|----------------------------------------------------------------|");
                    System.out.println("");
                    
                }
                
                
                
                System.out.println("|--------------------------------------|");
                System.out.println("|              Jogador1                |");
                System.out.println("|--------------------------------------|");
                
                System.out.printf("Escolha a posição a colocar na horizontal:");
                horizontall = horizontal.nextInt();            

                System.out.printf("Escolha a posição a colocar na vertical:");
                verticall = vertical.nextInt();

                if(horizontall >=0 && horizontall <= 2 && verticall >=0 && verticall <= 2){

                        jogo.setJogador1_v(verticall);
                        jogo.setJogador1_h(horizontall);

                        jogo.verificar1();
                        jogo.status();
                        jogo.verificacao1();
                        break;

                        }
                
            }
    }
            
    
        public void jogador2(){
            while(jgd2){
            
                if(horizontall > 2 || horizontall < 0){
                    System.out.println("|----------------------------------------------------------------|");
                    System.out.println("| Você não pode digitar uma horizontal maior que 2 e menor que 0 |");
                    System.out.println("|----------------------------------------------------------------|");
                    System.out.println("");
                }
                
                if(verticall > 2 || verticall < 0){
                    System.out.println("|----------------------------------------------------------------|");
                    System.out.println("| Você não pode digitar uma vertifical maior que 2 e menor que 0 |");
                    System.out.println("|----------------------------------------------------------------|");
                    System.out.println("");
                    
                }
                
                
                    
                
                
                
                System.out.println("|--------------------------------------|");
                System.out.println("|              Jogador2                |");
                System.out.println("|--------------------------------------|");

                System.out.printf("Escolha a posição a colocar na horizontal:");
                horizontall = horizontal.nextInt();

                System.out.printf("Escolha a posição a colocar na vertical:");
                verticall = vertical.nextInt();

                if(horizontall >=0 && horizontall <= 2 && verticall >=0 && verticall <= 2){


                        jogo.setJogador2_v(verticall);
                        jogo.setJogador2_h(horizontall);

                        jogo.verificar2();
                        jogo.status();
                        jogo.verificacao2();
                        
                        jgd1 = true;
                        break;
                }
            }
        }
        
    public void escolha(){
        boolean continuar = true;
        while(continuar){
            System.out.println("|---------------------|");
            System.out.println("|       Escolha       |");
            System.out.println("|                     |");
            System.out.println("| c para continuar    |");
            System.out.println("| p para ver o placar |");
            System.out.println("| s para sair         |");
            System.out.println("|---------------------|");
            escolha = escolhas.next();
            
            if("c".equals(escolha)) {
                contador = 0;
                jogo.setTeste(false);
                mudando += 1;
                    if(mudando % 2 == 0)
                        jgd1 = false;
                break;
            }
            
            if("p".equals(escolha)){
                //this.contador = 0;
                jogo.placar();
            }
                
            
            if("s".equals(escolha)){
                this.continuar = false;
                break;
                
            }
        
        }
    }
    
    public void jogadas(){
        
        while(continuar){
            
            while(contador <= 9){
                
                jogador1();
                contador += 1;

                if(contador == 9){
                    System.out.println("velha");
                    jogo.setVelha(1);
                    break;
                }
                
                if(jogo.isTeste() == true){
                    break;
                }
                
                jogador2();
                contador += 1;


                if(contador == 9){
                    System.out.println("velha");
                    jogo.setVelha(1);
                    break;
                }
                
                if(jogo.isTeste() == true){
                    break;
                }
                
                
            }
            
            escolha();
            
        }
    
    
    }
}
