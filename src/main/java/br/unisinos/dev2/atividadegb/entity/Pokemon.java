package br.unisinos.dev2.atividadegb.entity;

import static br.unisinos.dev2.atividadegb.domain.Status.DEAD;

import br.unisinos.dev2.atividadegb.domain.Status;
import br.unisinos.dev2.atividadegb.domain.Type;

public class Pokemon {

    private String name;
    private Type type;
    private double life;
    private double power;
    private Status status;

    private Pokemon() {
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public double getLife() {
        return life;
    }

    public double getPower() {
        return power;
    }

    public Status getStatus() {
        return status;
    }

    public void attach(final Pokemon pokemon) {
        if (pokemon.status == DEAD) {
            System.out.println(pokemon.name + " already dead");
            return;
        }

        pokemon.life -= power * pokemon.life;

        System.out.println(name + " attached " + pokemon.name);

        if (pokemon.life <= 0.0) {
            pokemon.status = DEAD;
            System.out.println(pokemon.name + " died");
        }
    }

    public static class PokemonBuilder {

        private final Pokemon pokemon = new Pokemon();

        PokemonBuilder() {
            pokemon.status = Status.ALIVE;
        }

        public PokemonBuilder name(final String name) {
            pokemon.name = name;
            return this;
        }

        public PokemonBuilder life(final double life) {
            pokemon.life = life;
            return this;
        }

        public PokemonBuilder power(final double power) {
            pokemon.power = power;
            return this;
        }

        public PokemonBuilder type(final Type type) {
            pokemon.type = type;
            return this;
        }

        public Pokemon build() {
            return pokemon;
        }
    }

    public static PokemonBuilder builder() {
        return new PokemonBuilder();
    }

}
