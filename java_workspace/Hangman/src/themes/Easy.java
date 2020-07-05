package themes;

import java.util.Arrays;

public class Easy {
	private String[]occupations; //= {"Teacher", "Doctor", "Nurse", "Lawyer"};
	private String[]booksAndMovies;
	private String[]animals;
	
	public Easy(String[] occupations, String[] booksAndMovies, String[] animals) {
		
		this.occupations = occupations;
		this.booksAndMovies = booksAndMovies;
		this.animals = animals;
	}

	public String[] getOccupations() {
		return occupations;
	}

	public void setOccupations(String[] occupations) {
		this.occupations = occupations;
	}

	public String[] getBooksAndMovies() {
		return booksAndMovies;
	}

	public void setBooksAndMovies(String[] booksAndMovies) {
		this.booksAndMovies = booksAndMovies;
	}

	public String[] getAnimals() {
		return animals;
	}

	public void setAnimals(String[] animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		return "Easy [occupations=" + Arrays.toString(occupations) + ", booksAndMovies="
				+ Arrays.toString(booksAndMovies) + ", animals=" + Arrays.toString(animals) + "]";
	}
	
	
	

}
