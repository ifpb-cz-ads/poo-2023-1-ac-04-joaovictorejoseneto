## Questões teóricas (Batista & Moraes (2013): exercícios 07 a 10 (páginas 79 a 80)

# Questão 07

```
class Registro De Eleitor {

int tituloDeEleitor; // número do título do eleitor
String nome; // nome do eleitor
short zonaEleitoral; // número da zona eleitoral

}
```
Ao executar a classe acima é retornado um erro no terminal:

```
Registro de Eleitor.java:1: error: '{' expected
class Registro De Eleitor {
              ^
1 error
```
* Tal erro ocorre porque o nome da classe está declarado de forma errada, já que as palavras estão separadas umas das outras, logo utilizando o CamelCase resolveria o problema.
* Além disso caso quisesse incrementar o código, seria ideal colocar os atributos encapsulados como private e criar gets e setters para manipular.
* Outro ponto seria colocar a classe como pública.

# Questão 08

```
class Teste2 {

    int num1,num2;

    int maior(){
        if (num1 > num2)
            return true;
        else return false;
    }

    void menor(){
        if (num1 < num2)
            return num1;
        else return num2;
    }
} 
```
Ao executar a classe acima é retornado um erro no terminal:

```
Teste2.java:7: error: incompatible types: boolean cannot be converted to int
            return true;
                   ^
Teste2.java:8: error: incompatible types: boolean cannot be converted to int
        else return false;
                    ^
Teste2.java:13: error: incompatible types: unexpected return value
            return num1;
                   ^
Teste2.java:14: error: incompatible types: unexpected return value
        else return num2;
                    ^
4 errors
```
* Um primeiro erro a ser falado é que o metódo "int maior()" foi criado para retornar um inteiro e no escopo do metódo está sendo passado para o return um valor booleano.
* Em ambos os metódos, faltou colocar as chaves das condicionais.
* No segundo metódo é definido que ele não dever retornar nada, por causa void, porém no escopo do metódo está sendo usado o return para retornar um valor inteiro.

# Questão 09

```
class TesteImpressao{
    main(String[] args){

    System.out.println(“7+2=”+(7+2));
    System.out.println(“7-2=”+(7-2));
    System.out.println(“7*2=”+(7*2));
    System.out.println(“7/2=”+(7/2));
    return true;
    }
} 
```
Ao executar a classe acima é retornado um erro no terminal:

```
TesteImpressao.java:2: error: invalid method declaration; return type required
    main(String[] args){
    ^
TesteImpressao.java:4: error: illegal character: '\u201c'
    System.out.println(“7+2=”+(7+2));
                       ^
TesteImpressao.java:4: error: illegal character: '\u201d'
    System.out.println(“7+2=”+(7+2));
                            ^
TesteImpressao.java:5: error: illegal character: '\u201c'
    System.out.println(“7-2=”+(7-2));
                       ^
TesteImpressao.java:5: error: illegal character: '\u201d'
    System.out.println(“7-2=”+(7-2));
                            ^
TesteImpressao.java:6: error: illegal character: '\u201c'
    System.out.println(“7*2=”+(7*2));
                       ^
TesteImpressao.java:6: error: illegal character: '\u201d'
    System.out.println(“7*2=”+(7*2));
                            ^
TesteImpressao.java:7: error: illegal character: '\u201c'
    System.out.println(“7/2=”+(7/2));
                       ^
TesteImpressao.java:7: error: illegal character: '\u201d'
    System.out.println(“7/2=”+(7/2));
                            ^
9 errors
```
* Um primeiro erro a ser falado é que metódo main está declarado de forma errada, no qual deveriar está no seguinte modelo "public static void main(String[] args).
* Outro erro é na utilização do System.out, onde está sendo passado apostófos ao invés de aspas duplas, ou seja, um erro de formatação.
* E por último, o erro do return no meio do código, ele não está no escopo de nenhum método, o que não faz sentido ele está isolado retornando algo.

# Questão 10

```
class TesteDatas{
    public void static main(String[] args){
        Data2 hoje = new Data2();
        hoje.inicializaData(7,1,2001);
        Data2 amanha;
        amanha.inicializaData(8,1,2001);
        System.out.println(amanha.eIgual(hoje));}
}
 

class TesteObjetos{
    public static void main(String[] args){
        Data a;
        Data b = new Data();
        b = null;
        b = a;
    }
}
```
Ao executar a classe acima é retornado um erro no terminal:

```
TesteObjetos.java:2: error: <identifier> expected
    public void static main(String[] args){
               ^
TesteObjetos.java:2: error: '(' expected
    public void static main(String[] args){
                ^
TesteObjetos.java:2: error: invalid method declaration; return type required
    public void static main(String[] args){
                       ^
3 errors
```
Classe TesteDatas() 

* Um primeiro erro a ser discutido é que na classe TesteDatas, o metódo main está declarado de forma errada.
* Outro erro é que não foi importado a biblioteca de datas (import java.time.LocalDate) e também foi declarado o objeto de forma errada, que deveria ser LocalDate hoje = new LocalDate();
* Além disso o objeto "amanha" foi instanciado de forma errada também.
* E por último o System.out está errado também, por erro de formatação.

Classe TesteObjetos() 
* Um primeiro erro a ser discutido é que na classe TesteObjetos é que também não foi importado a biblioteca LocalDate.
* Outro erro é que os objetos "a e b" estão sendo instanciados de forma errada, já que a palavra "Data" não tem referência para nada.
