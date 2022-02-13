class Libro {
	private String titulo;
	private int indiceActual;

	public Libro() {
	}

	public String leerLibro() {
		return "Estoy leyendo el libro";
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo(){
		return titulo;
	}
}
