package client;

import interfacciaGrafica.Output;
import pattern.*;

public class Main {

	public static void main(String[] args) {
		Auto auto = new AutoVerde();
		Auto auto2 = new AutoBlu();
		
		auto.carica();
		//auto2.carica();
		
		Output out = new Output(auto);

	}
}
