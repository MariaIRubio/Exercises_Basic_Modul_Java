package exercise_movieRating_HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class MovieRating {
	String movieTitle;
	int rating;

	public MovieRating(String movieTitle, int rating) {
		this.movieTitle = movieTitle;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Title: " + movieTitle + "- Rating: " + rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieRating other = (MovieRating) obj;
		return Objects.equals(movieTitle, other.movieTitle);
	}

}

class RatingSystem {

	HashSet<MovieRating> ratings_list = new HashSet<>();

	public void addRating(String title, int rating) {

		MovieRating movie_rating = new MovieRating(title, rating);
		ratings_list.add(movie_rating);
	}

	public void displayRatings() {
		System.out.println("Movie Ratings: ");
		for (MovieRating movie_rating : ratings_list) {
			System.out.println(movie_rating);
		}

	}
}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		RatingSystem ratingSystem = new RatingSystem();

		System.out.println("Rate some movies. Enter 'exit' when you are ready: ");
		while (true) {
			System.out.println("Title: ");
			String title = scanner.nextLine();
			if (title.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println("Rating: ");
			int rating = scanner.nextInt();
			scanner.nextLine();

			ratingSystem.addRating(title, rating);
			
			String result = (rating >= 0 && rating <= 5) ? "Bad"
					: (rating > 5 && rating <= 7) ? "Good"
							: (rating > 7 && rating <= 8) ? "Very good" : (rating == 10) ? "Incredible" : "Unknown";
			System.out.println(result);

		}

		ratingSystem.displayRatings();

		scanner.close();

	}

}
