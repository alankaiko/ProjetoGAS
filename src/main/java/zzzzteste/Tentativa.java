package zzzzteste;

import br.com.gsv.domain.Agenda;
import br.com.projeto.gsv.controller.AgendaController;

public class Tentativa {

	public static void main(String[] args) {
		AgendaController controller = new AgendaController();
		Agenda agenda = controller.BuscarPelaID(3L);

		System.out.println(agenda.getFuncionario().getNome());
		System.out.println(agenda.getPaciente().getNome());
		
		controller.setAgenda(agenda);
		controller.RemoverAgenda();
	}

}
