package dev.bstk.estruturadados.vetores;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VetorSimplesTest {

    @Test
    @DisplayName("Deve retornar TRUE ao passar um vetor nulo")
    public void deveRetornarTrueAoPassarUmVetorNulo() {
        boolean vetorVazio = VetorSimples.vetorVazio(null);

        Assertions.assertThat(vetorVazio).isTrue();
    }

    @Test
    @DisplayName("Deve retornar TRUE ao passar um vetor vazio")
    public void deveRetornarTrueAoPassarUmVetorVazio() {
        boolean vetorString = VetorSimples.vetorVazio(new String[]{});
        boolean vetorObject = VetorSimples.vetorVazio(new Object[]{});

        Assertions.assertThat(vetorString).isTrue();
        Assertions.assertThat(vetorObject).isTrue();
    }

    @Test
    @DisplayName("Deve retornar FALSE ao passar um vetor vazio")
    public void deveRetornarFalseAoPassarUmVetorComItens() {
        boolean vetorString = VetorSimples.vetorVazio(new String[]{ "", ""});
        boolean vetorObject = VetorSimples.vetorVazio(new Object[]{1, "", 0});

        Assertions.assertThat(vetorString).isFalse();
        Assertions.assertThat(vetorObject).isFalse();
    }

}
