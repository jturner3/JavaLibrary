package _12_Movie_Properties;


	public class Movie {
		
		//Properties
		
		String genre;
		//ArrayList<String> actors = newArrayList();
		String[] actresses;
		String mainActor;
		String mainActress;
		int starRating;
		int movieLength;
		boolean onNetflix;
		int boxOfficeGross;

		
		//Methods
		public void getMovieLength() {
			System.out.println(movieLength);
		}
		
		public void getboxOfficeGross() {
			System.out.println(boxOfficeGross);
		}
		//Constructor
			
		public Movie(String genre, String mainActor, int starRating, int onNetflix){
				this.genre = genre;
				this.mainActor = mainActor;
				this.starRating = starRating;
				this.onNetflix = true;
				
			
			
			
		}
		
	}	
