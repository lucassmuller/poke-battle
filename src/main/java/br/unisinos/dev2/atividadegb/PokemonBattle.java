package br.unisinos.dev2.atividadegb;

import static br.unisinos.dev2.atividadegb.domain.Status.DEAD;
import static br.unisinos.dev2.atividadegb.utils.RandomUtils.nextInt;

import java.util.ArrayList;
import java.util.List;

import br.unisinos.dev2.atividadegb.entity.Pokemon;

public class PokemonBattle {

    private List<Pokemon> participants;

    private PokemonBattle() {
        participants = new ArrayList<Pokemon>();
    }

    /**
     * Run the battle between participants
     * with random attacker and attacked
     *
     * @return The winner of the battle
     */
    public Pokemon battle() {
        while (participants.size() != 1) {
            final int attacker = nextInt(0, participants.size() - 1);
            final int attacked = nextInt(0, participants.size() - 1, attacker);
            final Pokemon pokemonAttacker = participants.get(attacker);
            final Pokemon pokemonAttacked = participants.get(attacked);
            pokemonAttacker.attach(pokemonAttacked);

            if (pokemonAttacked.getStatus() == DEAD) {
                participants.remove(pokemonAttacked);
            } else if (pokemonAttacker.getStatus() == DEAD) {
                participants.remove(pokemonAttacker);
            }
        }

        return participants.get(0);
    }

    public static class PokemonBattleBuilder {

        private final PokemonBattle battle = new PokemonBattle();

        PokemonBattleBuilder() {
        }

        public PokemonBattleBuilder newParticipant(final Pokemon participant) {
            battle.participants.add(participant);
            return this;
        }

        public PokemonBattle build() {
            return battle;
        }
    }

    public static PokemonBattleBuilder builder() {
        return new PokemonBattleBuilder();
    }

}
