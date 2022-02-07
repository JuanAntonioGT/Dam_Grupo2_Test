public class Equipo {
	private String nombreEquipo;
	private int ranking;
	private String categoriaEquipo;


	
	public Equipo () {
	}

	public String getNombreEquipo() {

		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {

		if (nombreEquipo.length() >= 4 && nombreEquipo.length() <= 20) {
			for (int i = 0; i < nombreEquipo.length(); i++) {
				if(i==1 || i==2 || i==3|| i==4|| i==5|| i==6|| i==7|| i==8|| i==9|| i==0){
					this.nombreEquipo=null;
				}

			}
			this.nombreEquipo = nombreEquipo.toUpperCase();
		}
	}


	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		for (int i = 0; i < ranking.length(); i++) {
			
		}
		if(ranking%1 == 0) {

			if (ranking >= 1 && ranking <= 10) {
				System.out.println("Ranking guardado");
				this.ranking = ranking;
			}

		}
	}



	// Creado por alvaro martin bazan
	public String getCategoriaEquipo() {
		String tercera = "Tercera";
		String segunda= "Segunda";
		String primera= "Primera";
		if (this.nombreEquipo != null){
			if(this.ranking<3 && this.ranking>=1){

				return tercera;
			}else if(this.ranking>=3 && this.ranking <=6){
				return segunda;
			}else if(this.ranking>=7 && this.ranking <=10){
				return primera;
			}else{
				return null;
			}
		}
		return categoriaEquipo;
	}

	public void setCategoriaEquipo(String categoriaEquipo) {
		this.categoriaEquipo = categoriaEquipo;
	}
}

