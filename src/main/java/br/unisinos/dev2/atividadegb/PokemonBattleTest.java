package br.unisinos.dev2.atividadegb;

import static br.unisinos.dev2.atividadegb.domain.Type.FIRE;
import static br.unisinos.dev2.atividadegb.domain.Type.PLANT;
import static br.unisinos.dev2.atividadegb.domain.Type.WATER;

import br.unisinos.dev2.atividadegb.entity.Pokemon;
import br.unisinos.dev2.atividadegb.factory.PokemonFactory;

public class PokemonBattleTest {

    public static void main(String[] args) {
        final Pokemon waterPokemon = PokemonFactory.getInstance().create(WATER);
        final Pokemon firePokemon = PokemonFactory.getInstance().create(FIRE);
        final Pokemon plantPokemon = PokemonFactory.getInstance().create(PLANT);

        final PokemonBattle pokemonBattle = PokemonBattle.builder()
            .newParticipant(waterPokemon)
            .newParticipant(firePokemon)
            .newParticipant(plantPokemon)
            .build();

        final Pokemon winner = pokemonBattle.battle();

        System.out.println(winner.getName() + " won the battle");
    }

}
