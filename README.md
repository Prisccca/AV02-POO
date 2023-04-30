# AV02-POO

1) Elabore um programa em Java com as seguintes características:

a) Crie uma classe Contato no pacote contatos, que será usada para representar os dados de
seus amigos: nome, telefone, e-mail e endereço. Essa classe deverá conter, além dos
atributos correspondentes aos dados acima, os getters e setters, o método toString() e um
construtor que inicialize todos os atributos.

b) Endereço é composto de logradouro, número, CEP, cidade e estado, onde estado deve ser
escolhido de uma lista fixa de valores. Embora dê pra fazer isso com array, não é uma
boa solução.

c) Crie uma classe Agenda no pacote agenda, usada para armazenar vários contatos acima.
Essa classe deverá possuir, além de um atributo do tipo array, que permita armazenar os
contatos, métodos para:

1. inserir novos contatos

2. listar todos os contatos existentes. Se não houver contato nenhum, imprima
mensagem dizendo que a agenda está vazia.

d) Uma vez criadas as classes acima, crie uma classe ContatoApp, apenas para abrigar o
método main(). 

Nesse método:

1. Crie 1 objeto do tipo Agenda e pelo menos 2 objetos do tipo Contato inicializando-os
com dados à sua escolha.

2. Insira os contatos na agenda usando o método criado para tal.

3. Liste na tela os contatos que estão na agenda também usando o método criado.

Faça uso das boas práticas vistas em classe: encapsulamento, nomes de classes sempre no
singular e começando com maiúscula, não use atributos ou métodos estáticos - além do main().
