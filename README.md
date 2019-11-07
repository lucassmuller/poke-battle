# Atividade Grau B - Desenvolvimento de Software II

Por: Lais Andres, Lucas Müller, Luis Eich, Thiago Vettorazzi.

## Descrição

Este projeto implementa batalhas Pokemon utilizando a classe `PokemonBattle` que é buildada recebendo os Pokemons participantes, criados a partir da `PokemonFactory`, que cria o Pokemon a partir do seu tipo utilizando o `PokemonBuilder`.

Quando iniciada a batalha, são escolhidos o atacante e atacado automaticamente na lista de Pokemons participantes, até sobrar o vencendor.

## Padrões implementados

Foram implementados os seguintes padrões:

* _builder_ - nas classes `Pokemon` e `PokemonBattle`
* _factory_ - classe `PokemonFactory`
* _singleton_ - na `PokemonFactory`