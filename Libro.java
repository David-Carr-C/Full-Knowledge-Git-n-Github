class Libro {
	private String titulo;
	private int indiceActual;

	public Libro() {
	}

	public String leerLibro() {
		return "Estoy leyendo el libro";
	}
	public String setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
