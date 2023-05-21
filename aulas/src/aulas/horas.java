package aulas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class horas {

	public static void main(String[] args) {

		Date hora = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");
		String horas = formatar.format(hora);
		formatar.format(hora);
		System.out.println("Hora atual: " + horas);

		int horaAgora = Integer.parseInt(horas.split(":")[0]);

		if (horaAgora < 12) {
			System.out.println("Bom dia, são " + horas + " agora");
		} else if (horaAgora >= 12 && horaAgora < 18) {
			System.out.println("Boa tarde, são " + horas + " agora");
		} else {
			System.out.println("Boa noite, são " + horas + " agora");
		}
	}

}
