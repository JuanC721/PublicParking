package modelo;

public class Parqueadero {
	public final static double TARIFA_HORA_MOTO  = 1000;
	public final static double TARIFA_HORA_CARRO = 3500;
	
	public final static String MOTO  = "Moto";
	public final static String CARRO = "Carro";
	
	private String tipoVehiculo;
	
	private int horaInicio;
	private int minutoInicio;
	private int horaFinal;
	private int minutoFinal;
	
	public Parqueadero() {
	}
	
	public void marcarHoraInicio(String tipoV) {
		tipoVehiculo = tipoV;
		// To modify:
		horaInicio   = (int)(7+Math.random()*5);
		minutoInicio = (int)(Math.random()*60);


		horaFinal   = (int)(12+Math.random()*10);
		minutoFinal = (int)(Math.random()*60);

	}
	
	public String darHoraInicio() {
		return horaInicio+":"+minutoInicio;
	}
	
	public void marcarHoraFinal() {
		// To modify:
		horaInicio   = 12;
		minutoInicio = 0;
	}
	
	public String darHoraFinal() {
		return horaInicio+":"+minutoInicio;
	}
	
	public double calcularValorAPagar() {
		double tarifa;
		if(tipoVehiculo.equals(MOTO)) {
			tarifa = TARIFA_HORA_MOTO;
		}else {
			tarifa = TARIFA_HORA_CARRO;
		}
		
		double valorAPagar = (horaFinal-horaInicio)*tarifa;
		if(minutoFinal>minutoInicio) {
			valorAPagar += tarifa;
		}
		return valorAPagar;
	}
}
