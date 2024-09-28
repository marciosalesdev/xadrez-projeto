Chess System Java
♟️ Jogo de Xadrez ♟️

Introdução
Projeto assistido e desenvolvido durante o Curso de Java Completo da plataforma Udemy através do Linkedin Prof. Dr. Nelio Alves. O repositório das minhas atividades no curso podem ser acessados aqui.

Este projeto consolida os conhecimentos adquiridos até o momento do curso (cerca da metade), que incluí, mas não se limitando a:

Classes: construtores padrões, atributos, encapsulamento, getters e setters, métodos da instância e da classe (estático), sobrecargas, classes reais e abstratas, etc;
Programação orientada a projetos, lógica e organização: herança, polimorfismo, sobrescrita de métodos, injeção de dependência, associações, encapsulamento, enumeração, downcasting, upcasting, padrão de camadas, tratamento de exceções, listas, matrizes, estruturas sequenciais, repetitivas (for e while) e condicionais (if-else e ternários), diagrama UML, versionamento do código, código limpo, etc;
Design do projeto
O projeto baseia-se em duas camadas: Board layer e Chess layer. O tabuleiro é uma matriz. Cada elemento da matriz contém ou não uma peça. Porém, a forma como acessamos esta matriz é diferente entre as camadas. Na camada Board layer temos todas as lógicas de controle do tabuleiro. Os índices da matriz são os números inteiros correspondentes aos índices das listas. Temos a classe Position que representa uma posição da matriz. A classe abstrata Piece representa a peça na matriz através da Position e os métodos abstratos de movimentos possíveis. A classe Board descreve o tabuleiro fisicamente e seu estado. Por fim, nesta camada temos a classe BoardException para tratar exceções do tabuleiro.

A camada Chess layer agrupa todos as peças do tabuleiro (King, Bishop, Knight, Pawn, Queen, Rook) que são entidades (classes) que estende da classe abstrata ChessPiece, e esta estende da classe Piece da outra camada. Logo, cada peça herda os atributos e métodos das super classes. Cada peça implementa suas regras de movimentos e jogadas especiais (se houver). A lógica de controle do jogo (check mate) está na classe ChessMatch desta camada que incluem, também, o tratamento das exceções através da classe ChessException o enum Color e a classe ChessPosition. Nesta camada, os índices da matriz são acessados com a regra amigável da UI, isto é, através de letras e números. As letras de a a h representam as colunas e os números de 1 a 8 as linhas do tabuleiro. Então se faz a necessidade conversão entre as coordenadas do tabuleiro.

A seguir, o diagrama UML do projeto (créditos do material do curso): 
![chess-system-design](https://github.com/user-attachments/assets/f751a8e5-662a-4110-abee-40d3a7bddd29)

Ambiente de desenvolvimento e execução
O projeto foi desenvolvido na IDE Eclipse versão 2022-14 (4.26.0), Linux Ubuntu 22.04 LTS e Java OpenJDK 11. Mas pode ser executado também em versões superiores.

O programa pode ser executado diretamente do console da IDE ou na linha de comando do terminal.

Para executar diretamente no terminal, utilize o arquivo exportado do projeto chess-system-java.jar. Da pasta raiz do repositório clonado, execute:

java -cp exported/chess-system-java.jar application.Program
Lembrando que é necessário ter o Java instalado na máquina na versão 11 ou superior.

A tela do programa deve ser executado semelhante ao mostrado a seguir:
![alt text](https://github.com/user-attachments/assets/2364f849-97c7-48e4-9ada-ec1760dafb01)



O turno começa com as peças Brancas (WHITE). A UI do programa solicita a entrada de origem da peça a mover (Source). Exemplo: "a2" seleciona o Peão Branco da posição A2. Confirme com ENTER e então o programa solicitará a o destino (Target) da nova posição da peça, exemplo "a4". Observe que o programa já mostra quais movimentos possíveis da peça e trata possíveis erros de movimentação. Depois de uma movimentação válida do atual jogador segue-se para o movimento do opositor, ou seja, da peça preta (BLACK). Concluída o turno, segue-se para o próximo repetindo-se a sequência. As peças capturadas são mostradas em todas a rodadas.



Conteúdo: Sistema jogo de xadrez - 33 aulas - 5h45m
 Visão geral do capítulo Sistema Jogo de Xadrez.
- Material de apoio do capítulo.
- Criando projeto e repositório Git.
- Primeira classe - Position.
- Começando a implementar Board e Piece.
- Camada Chess e imprimindo o tabuleiro.
- Colocando peças no tabuleiro.
- BoardException e programação defensiva.
- ChessException e ChessPosition.
- Pequena melhoria na impressão do tabuleiro.
- Movendo peças.
- Tratando exceções e limpando a tela.
- Movimentos possíveis de uma peça.
- Implementando movimentos possíveis da Torre.
- Imprimindo os movimentos possíveis.
- Implementando os movimentos possíveis do Rei.
- Trocando de jogador a cada turno.
- Manipulando peças capturadas.
- Lógica de xeque - PARTE 1.
- Lógica de xeque - PARTE 2.
- Lógica de xequemate.
- Contagem de movimentos das peças.
- Peão.
- Bispo.
- Cavalo.
- Rainha.
- Jogada especial Roque - PARTE 1.
- Jogada especial Roque - PARTE 2.
- Jogada especial en passant - PARTE 1.
- Jogada especial en passant - PARTE 2.
- Jogada especial promoção.
- Atualização de compliance.
- Dando um tratamento melhor para promoção.
