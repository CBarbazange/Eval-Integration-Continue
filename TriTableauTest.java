package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


class TriTableauTest {

	private int tab_positive[] = null;
	private int tab_negative[] = null;
	private int tab_zero[] = null;

	private TriTableau monTrieur = null;

	@BeforeEach
	void setUp() throws Exception {

		this.monTrieur = new TriTableau();

		this.tab_positive = new int[] { 1, 5, 3, 69 };
		this.tab_negative = new int[] { -684, 123, 2, 10 };
		this.tab_zero = new int[] { 0, 69, 6, 98 };
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTrier_positive() throws IOException {
		this.monTrieur.trier(this.tab_positive);
	}

	@Test
	void testTrier_negative() throws IOException {
		this.monTrieur.trier(this.tab_negative);
	}

	@Test
	void testTrier_zero() throws IOException {
		this.monTrieur.trier(this.tab_zero);
	}

	@Test
	void testTriCroissant_positive() {
		this.monTrieur.triCroissant(this.tab_positive);
	}

	@Test
	void testTriCroissant_negative() {
		this.monTrieur.triCroissant(this.tab_negative);
	}

	@Test
	void testTriCroissant_zero() {
		this.monTrieur.triCroissant(this.tab_zero);
	}

	@Test
	void testTriDecroissant_positive() {
		this.monTrieur.triDecroissant(this.tab_positive);
	}

	@Test
	void testTriDecroissant_negative() {
		this.monTrieur.triDecroissant(this.tab_negative);
	}

	@Test
	void testTriDecroissant_zero() {
		this.monTrieur.triDecroissant(this.tab_positive);
	}

}
