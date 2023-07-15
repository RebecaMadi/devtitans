
public class Sensor {
	String cor;
	double resolucao;
	int framesPorSegundo;
	
	Sensor(){
		cor = "";
		resolucao =0.0;
		framesPorSegundo = 0;
	}
	
	Sensor(String c, double r, int f){
		cor = c;
		resolucao = r;
		framesPorSegundo = f;
	}
	
	double getMPixelsPorSegundo() {
		return resolucao*framesPorSegundo;
	}
	
	String getDescricao() {
		return "Sensor: cor=" + cor + ", resolucao=" + resolucao + "Mp, framesPorSegundo=" + framesPorSegundo + "fps, mPixelsPorSegundo=" + getMPixelsPorSegundo() + "Mpps.";
	}
}
