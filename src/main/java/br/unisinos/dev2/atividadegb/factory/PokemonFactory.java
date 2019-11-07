package br.unisinos.dev2.atividadegb.factory;

import br.unisinos.dev2.atividadegb.domain.Type;
import br.unisinos.dev2.atividadegb.entity.Pokemon;

public class PokemonFactory {

    private static PokemonFactory factory;

    private PokemonFactory() {
    }

    public Pokemon create(final Type type) {
        switch (type) {
            case PLANT:
                return Pokemon.builder()
                    .name("Bulbasaur")
                    .type(type)
                    .power(0.55)
                    .life(90.0)
                    .build();
            case WATER:
                return Pokemon.builder()
                    .name("Squirtle")
                    .type(type)
                    .power(0.55)
                    .life(80.0)
                    .build();
            case FIRE:
                return Pokemon.builder()
                    .name("Charizard")
                    .type(type)
                    .power(0.6)
                    .life(60.0)
                    .build();
            default:
                throw new RuntimeException("Pokemon indisponível");
        }
    }

    public static PokemonFactory getInstance() {
        if (factory == null) {
            factory = new PokemonFactory();
        }

        return factory;
    }

}
