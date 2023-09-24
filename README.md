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
