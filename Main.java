import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

// inicio do sistema de cadastro do jogo

    System.out.println("Este é o RPG Adventures, vamos criar o seu Herói!!\n\nAperte ENTER para começar");
    leitor.nextLine();
    System.out.println("Qual será o nome do seu Herói");
    String nome = leitor.next();
    System.out.println("Qual será a Idade do seu Herói?");
    int idade = leitor.nextInt();

// switch case com as classes

    System.out.println("Qual será a classe do seu Herói?\nEscolha entre:\n1-Samurai\n2-Cavaleiro\n3-Mago\n4-Ninja\n");
    System.out.println("Pressione o respectivo número da classe para escolher");
    int classeNum = leitor.nextInt();
    String classe = " ";
    String arma = " ";

switch (classeNum) {
case 1:
classe = "Samurai";
arma = "Katana";
break;

case 2:
classe = "Cavaleiro";
arma = "Espada";
break;

case 3:
classe = "Mago";
arma = "Magia";
break;

case 4:
classe = "Ninja";
arma = "Shuriken";
break;
}

// inicio do jogo

System.out.println("O Herói de nome " +nome+ ", que é um " + classe + ", tem " +idade+ " anos.\nAperte ENTER para começar sua aventura!\n");
 leitor.nextLine();

System.out.println("O " +nome+ "Se deparou com um grupo de bandidos! Pressione ENTER para atacar");
leitor.nextLine();

 System.out.println("O " +classe+ " " +nome+ "atacou usando " + arma);
}
   
}


