
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
		if (nombreEquipo.length() > 4 && nombreEquipo.length() < 20) {
			this.nombreEquipo = nombreEquipo;
		}
	}


	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		if (ranking > 0){
			this.ranking = ranking;
		}


	}
	// Creado por alvaro martin bazan
	public String getCategoriaEquipo() {
		String tercera = "Tercera Categoría";
		String segunda= "Segunda Categoría";
		String primera= "Primera Categoría";
		if (this.nombreEquipo != null){
			if(this.ranking<3 && this.ranking>=1){

				return tercera;
			}else if(this.ranking>=3 && this.ranking <=6){
				return segunda;
			}else if(this.ranking>=7 && this.ranking <=10){
				return primera;
			}
		}
		return categoriaEquipo;
	}

	public void setCategoriaEquipo(String categoriaEquipo) {
		this.categoriaEquipo = categoriaEquipo;
	}
}
