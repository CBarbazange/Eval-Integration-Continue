package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

class FIFOParametrizedTest {
	
	private FIFO randomFIFO = null;
	
	@Parameterized.Parameters
	static Stream<Arguments> chargerJeuTest() throws Throwable {
		
		return Stream.of(Arguments.of(new int[] { 1, 5, 3, 69 }),
				Arguments.of(new int[] { -684, 123, 2, 10 }),
				Arguments.of(new int[] { 0, 69, 6, 98 }));
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("Tests pour la fonction first")
	@ParameterizedTest	
	@MethodSource("chargerJeuTest")
	void parameterizedTestFirst(int[] tab) {
		
		this.randomFIFO = new FIFO();

		for(int i = 0; i < tab.length; i++) {
			this.randomFIFO.add(tab[i]);
		}
		
		assertEquals(this.randomFIFO.first(), Integer.valueOf(tab[0]));
	}
	
	@DisplayName("Tests pour la fonction isEmpty")
	@ParameterizedTest	
	@MethodSource("chargerJeuTest")
	void parameterizedTestIsEmpty(int[] tab) {
		
		this.randomFIFO = new FIFO();
		
		assertEquals(this.randomFIFO.isEmpty(), true);

		for(int i = 0; i < tab.length; i++) {
			this.randomFIFO.add(tab[i]);
		}
		
		assertEquals(this.randomFIFO.isEmpty(), false);
	}
	
	@DisplayName("Tests pour la fonction removeFirst")
	@ParameterizedTest	
	@MethodSource("chargerJeuTest")
	void parameterizedTestRemoveFirst(int[] tab) {
		
		this.randomFIFO = new FIFO();
		
		assertEquals(this.randomFIFO.isEmpty(), true);

		for(int i = 0; i < tab.length; i++) {
			this.randomFIFO.add(tab[i]);
		}
		
		assertEquals(this.randomFIFO.first(), Integer.valueOf(tab[0]));
		
		this.randomFIFO.removeFirst();
		
		assertEquals(this.randomFIFO.first(), Integer.valueOf(tab[1]));
	}

	@DisplayName("Tests pour la fonction size")
	@ParameterizedTest	
	@MethodSource("chargerJeuTest")
	void parameterizedTestSize(int[] tab) {
		
		this.randomFIFO = new FIFO();
		
		assertEquals(this.randomFIFO.size(), 0);

		for(int i = 0; i < tab.length; i++) {
			this.randomFIFO.add(tab[i]);	
		}
			
		assertEquals(this.randomFIFO.size(), tab.length);
		
		this.randomFIFO.removeFirst();
		
		assertEquals(this.randomFIFO.size(), tab.length - 1);
	}
}
