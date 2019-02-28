package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class TriTableauParametrizedTest {
	
	private TriTableau monTrieur = null;
	
	@Parameterized.Parameters
	static Stream<Arguments> chargerJeuTest() throws Throwable {
		
		return Stream.of(Arguments.of(new int[] { 1, 5, 3, 69 }, 1, 69),
				Arguments.of(new int[] { -684, 123, 2, 10 }, -684, 123),
				Arguments.of(new int[] { 0, 69, 6, 98 }, 0, 98));
	}

	@BeforeEach
	void setUp() throws Exception {
		this.monTrieur = new TriTableau();
	}

	@DisplayName("Tests pour la fonction triCroissant")
	@ParameterizedTest	
	@MethodSource("chargerJeuTest")
	void parameterizedTestTriCroissant(int[] tab, int smallest, int largest) {
		
		this.monTrieur.triCroissant(tab);
		
		assertEquals(tab[0], smallest);
		assertEquals(tab[(tab.length - 1)], largest);
	}

	@DisplayName("Tests pour la fonction triDecroissant")
	@ParameterizedTest	
	@MethodSource("chargerJeuTest")
	void parameterizedTestTriChocolatine(int[] tab, int smallest, int largest) {
		
		this.monTrieur.triDecroissant(tab);
		
		assertEquals(tab[0], largest);
		assertEquals(tab[(tab.length - 1)], smallest);
	}

}
