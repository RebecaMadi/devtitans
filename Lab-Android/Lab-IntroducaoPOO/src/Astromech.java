
public class Astromech {
	String modelo;
	Mestre mestre;
	Sensor sensor;
	Conexao conexao;
	
	Astromech(){
		modelo = "";
		mestre = new Mestre();
		sensor = new Sensor();
		conexao = new Conexao();
	}
	
	Astromech(String m, Mestre mt, Sensor sn, Conexao c){
		modelo = m;
		mestre = mt;
		sensor = sn;
		conexao = c;
	}
	
	String getDescricao() {
		return "Astromech modelo " + modelo + ". " + mestre.getDescricao() + " " + sensor.getDescricao() + " "  + conexao.getDescricao();
	}
}
