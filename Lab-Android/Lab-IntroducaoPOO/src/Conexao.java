
public class Conexao {
	String tipoPorta;
	int idProtocolo;
	int taxaTransmissao;
	
	Conexao(){
		tipoPorta = "";
		idProtocolo = 0;
		taxaTransmissao = 0;
	}
	
	Conexao(String tp, int ip, int tt){
		tipoPorta = tp;
		idProtocolo = ip;
		taxaTransmissao = tt;
	}
	
	double getTaxaMBps() {
		return (double) taxaTransmissao/1024.0;
	}
	
	String getProtocoloString() {
		if(idProtocolo==1) return "Rotoscope";
		else if(idProtocolo==2) return "Acustico";
		else if(idProtocolo==3) return "Radio";
		else return "Outros";
	}
	
	String getDescricao() {
		return "Conexao: tipoPorta=" + tipoPorta + ", protocolo=" + getProtocoloString() + ", taxaTransmissao=" + getTaxaMBps() + "MBps.";
	}
}
