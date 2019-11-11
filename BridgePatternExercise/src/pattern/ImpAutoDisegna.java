package pattern;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream.PutField;

import javax.imageio.ImageIO;

public class ImpAutoDisegna implements ImpAuto{
	
	@Override
	public void caricaImmagine(Auto auto) {
		Image img = null;
		
		if (auto.getTipo() == "blu")
			try {
				img = ImageIO.read(new File("Immagini" + File.separator  + "autoBlu.jpeg"));
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		
		else if (auto.getTipo() == "verde")
			try {
				img = ImageIO.read(new File("Immagini" + File.separator  + "autoVerde.jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		auto.setImg(img);
		
	}

	
	
}
