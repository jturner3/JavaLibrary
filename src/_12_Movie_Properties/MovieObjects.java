package _12_Movie_Properties;

public class MovieObjects {
		public static void main(String[] args) {
			
			
			Movie johnsDreamMovie = new Movie("action","kevin hart",5, 1);
			johnsDreamMovie.genre = "Action/Comedy";
			johnsDreamMovie.mainActor = "Kevin Hart";
			johnsDreamMovie.mainActress = "Gabrielle Union";
			johnsDreamMovie.starRating = 4;
			johnsDreamMovie.movieLength = 120;
			johnsDreamMovie.onNetflix = true; 
			johnsDreamMovie.boxOfficeGross = 5000000;
			
			System.out.println(johnsDreamMovie.genre);
			
			Movie tommyBoy = new Movie("action","kevin hart",5, 1);
			
			
			johnsDreamMovie.getMovieLength();
			tommyBoy.getMovieLength();
			
			
			//Create a new method thats prints boxOfficeGross
			
			Movie damnHomie = new Movie("action","kevin hart",5, 1);
			damnHomie.boxOfficeGross = 120000000;
			
			johnsDreamMovie.getboxOfficeGross();
			damnHomie.getboxOfficeGross();
			
			
			
			
			
			
			
		}
}
